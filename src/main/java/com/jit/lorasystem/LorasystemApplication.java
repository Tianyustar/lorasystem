package com.jit.lorasystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jit.lorasystem.mapper")

public class LorasystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(LorasystemApplication.class, args);
	}
}
