package xyz.frish2021.login.dao;

import org.apache.ibatis.annotations.Mapper;

/**
 * &#064;@author: Frish2021
 * &#064;@createTime: 2023/08/24 13:09
 */

@Mapper
public interface SQLInitiativeDao {
    public void createDataSource();
    public void createTable();
    public void uesDb();
}
