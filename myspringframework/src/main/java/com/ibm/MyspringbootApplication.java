package com.ibm;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyspringbootApplication {
    public static void main(String[] args) {
        //run(RootAppConfiguration)
        //ConfigurableApplicationContext ctx = SpringApplication.run(MyspringbootApplication.class, args);
        SpringApplication application = new SpringApplication(MyspringbootApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setWebApplicationType(WebApplicationType.NONE);
        ConfigurableApplicationContext context =application.run(args);
        HelloService helloWorld = context.getBean(HelloService.class);
        System.out.println(helloWorld.sayHello());

        //
        ProductService productService=context.getBean(ProductService.class);
        //invoke api
        System.out.println(productService.findAll());
        System.out.println(productService.save());
        System.out.println(productService.update());

    }

}
