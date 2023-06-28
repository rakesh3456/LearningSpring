package com.ibm.spring.app.extensions;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorExtension implements BeanPostProcessor {

    //This method will be called after bean creation
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization : " + bean + " " + beanName);
        return bean;
    }

    //this method will be called before before bean creation.
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization : " + bean + " " + beanName);
        return bean;
    }
}
