package com.yiming.springboot.config;

import com.yiming.springboot.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //该注解将此类定义为配置类（相当于一个xml配置文件）
public class ServletConfig {
    //@Bean是一个方法级别上的注解，主要用在配置里
    //相当于一个<beans></beans>
    @Bean
    public ServletRegistrationBean myServletRegistrationBean(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new MyServlet(),"/myservlet");
        return servletRegistrationBean;
    }
}
