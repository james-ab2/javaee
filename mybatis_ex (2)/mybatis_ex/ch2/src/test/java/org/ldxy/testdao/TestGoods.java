package org.ldxy.testdao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.ldxy.pojo.Goods;

import java.io.IOException;
import java.io.InputStream;

public class TestGoods {//测试用例
    SqlSessionFactory sessionFactory;
    @Before
    public void init() throws IOException {
        String resource="mybatis.xml";
        InputStream inputStream= Resources.getResourceAsStream(resource);
        sessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
    }

}
