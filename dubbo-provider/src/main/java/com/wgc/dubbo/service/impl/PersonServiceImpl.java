package com.wgc.dubbo.service.impl;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wgc.dubbo.api.DemoService;
import com.wgc.dubbo.entity.Person;
import org.apache.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: Earle
 * @createdDate: 2019-10-16
 * @updatedDate:
 */
@Service(version = "${demo.service.version}")
public class PersonServiceImpl implements DemoService {


    @Override
    public String sayHello(String name) {
        ObjectMapper mapper = new ObjectMapper();
        String s = null;
        try {
           s = mapper.writeValueAsString(list());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return name + s;
    }

    @Override
    public List list() {
        List<Person> listPerson = new ArrayList<>();
        Person person = new Person();
        person.setId(1).setName("掌声呢").setPrice(23.0);
        Person person1 = new Person();
        person1.setId(2).setName("adf").setPrice(234.32);
        listPerson.addAll(Arrays.asList(person, person1));
        return listPerson;
    }
}
