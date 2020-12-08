package com.tzb.timetask.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.tzn.timetask.mbg.mapper")
public class MyBatisConfig {
}
