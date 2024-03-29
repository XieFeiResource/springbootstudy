package com.example.springbooot1.Config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

@EnableTransactionManagement
@Configuration
@MapperScan("com.example.springbooot1.Mapper")
public class MybatisPlusConfig {
    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor  PaginationInterceptorpaginationInterceptor() {
        return new PaginationInterceptor();
    }
    /**
     * 打印 sql
     */
    /*@Bean
    public PerformanceInterceptor PerformanceInterceptorperformanceInterceptor() {
        PerformanceInterceptor performanceInterceptor =new PerformanceInterceptor();
        //格式化sql语句
        Properties properties =new Properties();
        properties.setProperty("format", "faalse");
        performanceInterceptor.setProperties(properties);
        return performanceInterceptor;
    }*/
}
