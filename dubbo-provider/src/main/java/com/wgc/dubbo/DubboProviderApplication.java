package com.wgc.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

@SpringBootApplication
@ImportResource("classpath:dubbo/provider.xml")
public class DubboProviderApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(DubboProviderApplication.class, args);
     /*  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:dubbo/provider.xml"});
        context.start();
        System.in.read();*/
       // GenericApplicationContext context = new GenericApplicationContext();
       // new GroovyBeanDefinitionReader(context).loadBeanDefinitions("dubbo/provider.xml");
       // context.refresh();
       // System.in.read();
    }

}
