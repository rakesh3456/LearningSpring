package com.ibm.spring.app.di.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryMain {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
        AuthService authService = context.getBean(AuthService.class);
        System.out.println(authService.getUserName());
    }
}
