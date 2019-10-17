package com.wgc.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

@SpringBootApplication
@ImportResource("classpath:dubbo/consumer.xml")
public class DubboConsumerApplication {

    public static void main(String[] args) throws IOException {

        SpringApplication.run(DubboConsumerApplication.class, args);
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo/consumer.xml");
        //context.start();
        //System.in.read();
 /*       DemoService demoService = (DemoService) context.getBean("demoService");
        String hell = demoService.sayHello("hell");
        System.out.println(hell);*/
    }

}
