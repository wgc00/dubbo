package com.wgc.dubbo.api;

import java.util.List;

/**
 * @author: Earle
 * @createdDate: 2019-10-16
 * @updatedDate:
 */
public interface DemoService {

    String sayHello(String name);

    List list();
}
