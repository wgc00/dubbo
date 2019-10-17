/*
package com.wgc.dubbo;

import com.wgc.dubbo.service.PersonService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;

import java.util.List;

*/
/**
 * @author: Earle
 * @createdDate: 2019-10-9
 * @updatedDate:
 *//*

public class Main {
    public static void main(String[] args) {
        ReferenceConfig<PersonService> reference = new ReferenceConfig<>();
        reference.setApplication(new ApplicationConfig("dubbo-consumer"));
        reference.setRegistry(new RegistryConfig("zookeeper://127.0.0.1:2181"));
        reference.setInterface(PersonService.class);
        PersonService service = reference.get();
        List message = service.list();
        message.forEach(System.out::println);
        System.err.println(message.size());
    }
}
*/
