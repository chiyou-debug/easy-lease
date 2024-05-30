package com.example.lease.common.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.example.lease.web.*.mapper")
public class MybatisPlusConfiguration {

}