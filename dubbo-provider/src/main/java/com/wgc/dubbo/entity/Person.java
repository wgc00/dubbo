package com.wgc.dubbo.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author: Earle
 * @createdDate: 2019-10-17
 * @updatedDate:
 */
@Data
@Accessors(chain = true)
public class Person {

    private Integer id;

    private String name;

    private double price;

}
