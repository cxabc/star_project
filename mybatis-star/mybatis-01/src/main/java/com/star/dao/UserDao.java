package com.star.dao;

import com.star.pojo.User;
import org.apache.ibatis.annotations.Insert;

import java.util.List;
import java.util.Map;

public interface UserDao {
    List<User> getAllUser();

    List<User> getUserByLimit(Map<String, Integer> map);

    // 使用需要将本类注册mapper，即mybatis-config注册
    @Insert("insert into user(id,name,pwd) values (#{id},#{name},#{password})")
    int addUser(User user);
}
