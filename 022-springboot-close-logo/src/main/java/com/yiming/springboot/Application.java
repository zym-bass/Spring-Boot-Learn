package com.yiming.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		//获取入口SpringBoot类
		SpringApplication springApplication = new SpringApplication(Application.class);

		//设置他的属性
		//关闭logo
		springApplication.setBannerMode(Banner.Mode.OFF);
		springApplication.run(args);
	}

}
