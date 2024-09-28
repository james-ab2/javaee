package org.ldxy.testdao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.ldxy.pojo.Goods;
import org.ldxy.pojo.User;

import java.io.IOException;
import java.io.InputStream;

public class TestGoods {
    SqlSessionFactory sessionFactory;
    @Before
    public void init() throws IOException {
        String resource="mybatis.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);
        sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void insertGoods() throws IOException {
        SqlSession session=sessionFactory.openSession();
        Goods goods=new Goods("畅玩50大字体大音量5200mAh大电池高清灵动大屏5G手机",639,null);
        int i=session.insert("mapper.GoodsMapper.insertGoods",goods);
        session.commit();
        session.close();
        if(i>0)
            System.out.println("添加操作成功");
        else
            System.out.println("添加操作失败");
        System.out.println(goods);
    }

    @Test
    public void insertGoods2() throws IOException {
        SqlSession session=sessionFactory.openSession();
        Goods goods=new Goods("畅玩50大字体大音量5200mAh大电池高清灵动大屏5G手机",639,null);
        int i=session.insert("mapper.GoodsMapper.insertGoods2",goods);
        session.commit();
        session.close();
        if(i>0)
            System.out.println("添加操作成功");
        else
            System.out.println("添加操作失败");
        System.out.println(goods);
    }
}
