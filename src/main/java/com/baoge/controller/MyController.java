package com.baoge.controller;

import com.baoge.domain.Person;
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

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Object test() {
        Person person = new Person();
        person.setId(2);
        person.setAge(23);
        person.setName("豹哥");

        return person;
    }

}
