package com.baoge.boot.controller;

import com.baoge.boot.config.MyConfigBean;
import com.baoge.boot.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/5/3
 */

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MyController {

    @Value("${myConfig.myObject.myName}")
    private String myName;

    @Value("${myConfig.myObject.myAge}")
    private int myAge;

    @Autowired
    private MyConfigBean myConfigBean;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Object test() {
        Person person = new Person();
        person.setId(2);
        person.setAge(23);
        person.setName("豹哥");

        System.out.println(myName);
        System.out.println(myAge);

        System.out.println("==============");

        System.out.println(myConfigBean.getMyAge());
        System.out.println(myConfigBean.getMyName());

        return person;
    }

}
