package org.ldxy.dao;

import org.ldxy.pojo.User;

import java.util.List;

public interface UserDao {//数据操作层
    public int insertUser(User user);
    public int deleteUserById(Integer uid);
    public int updateUser(User user);
    public List<User> selectUserByName(String uname);
    public User selectUserById(Integer uid);
}
