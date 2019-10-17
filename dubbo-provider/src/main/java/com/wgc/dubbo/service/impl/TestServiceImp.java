package com.wgc.dubbo.service.impl;

import com.wgc.dubbo.api.TestService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author: Earle
 * @createdDate: 2019-10-17
 * @updatedDate:
 */
@Service(version = "${demo.service.version}")
public class TestServiceImp implements TestService {
    @Override
    public String test() {
        return "你叫什么名字";
    }
}
