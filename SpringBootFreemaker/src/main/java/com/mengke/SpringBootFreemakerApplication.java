package com.mengke;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mengke.code.BasePathExposer;

@MapperScan("com.mengke.mapper")
@SpringBootApplication
public class SpringBootFreemakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFreemakerApplication.class, args);
	}
	
	/**
	 * 初始化根函数
	 * @return
	 */
	@Bean(initMethod="init")
	public BasePathExposer getBasePathExposer(){
		return new BasePathExposer();
	}
}
