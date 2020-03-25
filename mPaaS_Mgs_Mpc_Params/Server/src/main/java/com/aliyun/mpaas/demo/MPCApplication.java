package com.aliyun.mpaas.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource({"classpath*:META-INF/*.xml"})
@SpringBootApplication
public class MPCApplication {
    public static void main(String[] args){

        SpringApplication springApplication = new SpringApplication(MPCApplication.class);
        ApplicationContext applicationContext = springApplication.run(args);
        applicationContext.getBean(SampleService.class);

    }
}
