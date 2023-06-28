package com.ibm.spring.app.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMain {
    public static void main(String[] args) {
//        ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
        ConfigurableApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");

        factory.getBean(CustomerService.class);
        factory.registerShutdownHook();

    }
}
