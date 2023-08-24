package xyz.frish2021.login.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * &#064;@author: Frish2021
 * &#064;@createTime: 2023/08/24 13:10
 */

@Mapper
public interface LoginDao {
    public String getPassword(@Param("username") String username);
    List<String> getUserList();
}
