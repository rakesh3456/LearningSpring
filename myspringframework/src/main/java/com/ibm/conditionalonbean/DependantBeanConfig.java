package com.ibm.conditionalonbean;


import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependantBeanConfig {
//    @Bean
//    OptionalBean optionalBean() {
//        return new OptionalBean();
//    }
    @Bean
    @ConditionalOnBean(OptionalBean.class)
        //create this bean only if OptionalBean is available , if not dont
    DependantBean dependantBean() {
        return new DependantBean();
    }
}
