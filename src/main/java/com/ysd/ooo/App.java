package com.ysd.ooo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication // Spring boot 应用标识
@MapperScan("com.ysd.ooo.dao") // mapper 接口扫描包配置

/**
 * 注:任务调度在 com.ysd.ooo.util.SimpleTask
 * 
 * @author 爱新觉罗
 *
 */

/* @EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class }) */
public class App /* extends SpringBootServletInitializer */ {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	

}
