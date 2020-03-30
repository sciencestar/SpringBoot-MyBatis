package com.springboot.demo.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyBatisMapperScannerConfig
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/30 16:01
 * @Version V1.0
 **/
@Configuration
@AutoConfigureAfter(MyBatisConfig.class)
public class MyBatisMapperScannerConfig {
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        //获取之前注入的beanName为sqlSessionFactory的对象
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        //指定dao的路径
        mapperScannerConfigurer.setBasePackage("com.springboot.demo.mapper");
        return mapperScannerConfigurer;
    }
}
