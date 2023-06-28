package com.ibm.spring.app.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequiredAnnotationMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beansannotation.xml");
        Student student = context.getBean(Student.class);
        System.out.println(student);

    }
}
