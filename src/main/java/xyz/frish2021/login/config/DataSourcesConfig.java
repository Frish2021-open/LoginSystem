package xyz.frish2021.login.config;

import com.zaxxer.hikari.HikariDataSource;
import org.noear.solon.annotation.Bean;
import org.noear.solon.annotation.Configuration;
import org.noear.solon.annotation.Inject;

import javax.sql.DataSource;

/**
 * &#064;@author: Frish2021
 * &#064;@createTime: 2023/08/24 17:10
 */

@Configuration
public class DataSourcesConfig {
    @Bean(value = "db_1", typed = true)
    public DataSource dataSource(@Inject("${sql.db_1}") HikariDataSource dataSource) {
        return dataSource;
    }
}
