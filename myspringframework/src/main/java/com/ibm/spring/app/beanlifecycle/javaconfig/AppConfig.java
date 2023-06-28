package com.ibm.spring.app.beanlifecycle.javaconfig;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration //beans.xml
@Import({CustomerConfig.class,ProductConfig.class})
public class AppConfig {

}
