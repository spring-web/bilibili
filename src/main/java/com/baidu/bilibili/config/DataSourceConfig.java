package com.baidu.bilibili.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Autowired
    Environment env;

    @Bean(name = "hikariDataSource")
    public DataSource DataSourcee(){
        DruidDataSource ds=new DruidDataSource();
        ds.setUsername(env.getProperty("spring.datasource.username"));
        ds.setUrl(env.getProperty("spring.datasource.url"));
        ds.setPassword(env.getProperty("spring.datasource.password"));
        ds.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
        return ds;
    }
}
