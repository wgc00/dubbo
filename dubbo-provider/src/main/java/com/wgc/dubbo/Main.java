/*
package com.wgc.dubbo;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.wgc.dubbo.service.PersonServiceImpl;
import com.wgc.dubbo.service.impl.PersonServiceImpl;

import java.io.IOException;

*/
/**
 * @author: Earle
 * @createdDate: 2019-10-9
 * @updatedDate:
 *//*

public class Main {

    public static void main(String[] args) throws IOException {
        ServiceConfig<PersonServiceImpl> service = new ServiceConfig<>();
        service.setApplication(new ApplicationConfig("dubbo-provider"));
        service.setRegistry(new RegistryConfig("zookeeper://127.0.0.1:2181"));
        service.setInterface(PersonServiceImpl.class);
        service.setRef(new PersonServiceImpl());
        service.export();
        System.in.read();
    }
}
*/
