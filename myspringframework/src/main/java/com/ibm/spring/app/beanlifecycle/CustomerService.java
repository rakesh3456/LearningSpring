package com.ibm.spring.app.beanlifecycle;

public class CustomerService {

    public void init(){
        System.out.println("Init");
    }
    public  void destroy(){
        System.out.println("Destroy");
    }
}
