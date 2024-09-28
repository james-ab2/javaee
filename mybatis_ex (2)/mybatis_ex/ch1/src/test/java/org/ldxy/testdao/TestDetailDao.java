package org.ldxy.testdao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.ldxy.dao.DetailDao;
import org.ldxy.dao.UserDao;
import org.ldxy.pojo.Detail;
import org.ldxy.pojo.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestDetailDao {
    SqlSessionFactory sessionFactory;
    @Before
    public void init() throws IOException {
        String resource="mybatis.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);
        sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void selectUserDetailByPros() throws IOException {
        SqlSession session=sessionFactory.openSession();
        DetailDao detailDao=session.getMapper(DetailDao.class);
        Detail detail=new Detail();
        detail.setUaddress("白银路");
        detail.setUphone("13289001001");
        detail.setUrealname("马明马明");
        List<Detail> detailList=detailDao.selectByPros(detail);
        for(Detail detail1:detailList)
            System.out.println(detail1);

    }

    @Test
    public void selectUserDetailByPro() throws IOException {
        SqlSession session=sessionFactory.openSession();
        DetailDao detailDao=session.getMapper(DetailDao.class);
        Detail detail=new Detail();
        //detail.setUaddress("白银路");
        detail.setUphone("13289001001");
        //detail.setUrealname("马明马明");
        List<Detail> detailList=detailDao.selectByPro(detail);
        for(Detail detail1:detailList)
            System.out.println(detail1);

    }
}
