package com.wgc.dubbo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wgc.dubbo.api.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * @author: Earle
 * @createdDate: 2019-10-17
 * @updatedDate:
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    @Reference
    private DemoService demoService;

    @GetMapping
    public List list() throws IOException {
        String hello = demoService.sayHello("");
        ObjectMapper mapper = new ObjectMapper();
        List list = mapper.readValue(hello, List.class);
        return list;
    }
}
