package org.ldxy.testdao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.ldxy.dao.UserDao;
import org.ldxy.pojo.User;

import java.io.IOException;
import java.io.InputStream;

public class TestUserDao {
    SqlSessionFactory sessionFactory;
    @Before
    public void init() throws IOException {
        String resource="mybatis.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);
        sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void selectUserById() throws IOException {
        SqlSession session=sessionFactory.openSession();
        UserDao userDao=session.getMapper(UserDao.class);
        User user=userDao.selectUserById(17);
        session.close();
        System.out.println(user);
    }
}
