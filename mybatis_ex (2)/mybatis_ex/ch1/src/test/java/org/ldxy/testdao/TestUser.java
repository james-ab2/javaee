package org.ldxy.testdao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.ldxy.pojo.User;

import java.io.IOException;
import java.io.InputStream;

public class TestUser {
    SqlSessionFactory sessionFactory;
    @Before
    public void init() throws IOException{
        String resource="mybatis.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);
        sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void test1() throws IOException {
        SqlSession session=sessionFactory.openSession();
        User user=session.selectOne("mapper.UserMapper.selectUser",17);
        System.out.println(user);
    }
    @Test
    public void test2() throws IOException {
        SqlSession session=sessionFactory.openSession();
        int i=session.delete("mapper.UserMapper.deleteUserById",7);
        session.commit();
        if(i>0)
            System.out.println("删除成功");
        else
            System.out.println("删除失败");
    }
    @Test
    public void insertUser() throws IOException {
        SqlSession session=sessionFactory.openSession();
        User user=new User("李俊國","341023",true);
        int i=session.insert("mapper.UserMapper.insertUser",user);
        session.commit();
        session.close();
        if(i>0)
            System.out.println("添加成功");
        else
            System.out.println("添加失败");
    }
}
