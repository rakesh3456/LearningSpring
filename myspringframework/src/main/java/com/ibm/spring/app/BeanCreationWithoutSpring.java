package com.ibm.spring.app;

public class BeanCreationWithoutSpring {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.sayHello());
    }
}
