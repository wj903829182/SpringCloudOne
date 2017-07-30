package com.jack;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Springboot1Application {

    public static void main(String[] args) {

        SpringApplication.run(Springboot1Application.class, args);
        //关闭banner
        /*SpringApplication app = new SpringApplication(Springboot1Application.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);*/
        /*new SpringApplicationBuilder(Springboot1Application.class).bannerMode(Banner.Mode.OFF).run(args);*/
    }
}
