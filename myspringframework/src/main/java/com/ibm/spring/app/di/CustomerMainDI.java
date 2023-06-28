package com.ibm.spring.app.di;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CustomerMainDI {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
        Customer customer = context.getBean("customerAuto",Customer.class);
        System.out.println(customer);


    }
}
