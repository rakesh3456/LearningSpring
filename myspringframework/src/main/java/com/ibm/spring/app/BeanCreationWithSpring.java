package com.ibm.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanCreationWithSpring {
    public static void main(String[] args) {
      //Load Spring Container:XMLContainer,JavaConfigContainer,BootContainer
        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        System.out.println(helloWorld.sayHello());
    }
}
