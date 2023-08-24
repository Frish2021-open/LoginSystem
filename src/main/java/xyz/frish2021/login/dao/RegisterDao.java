package xyz.frish2021.login.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * &#064;@author: Frish2021
 * &#064;@createTime: 2023/08/24 13:08
 */

@Mapper
public interface RegisterDao {
    void addUser(@Param("username") String username, @Param("password") String password);
    List<String> getUserList();
}
