package com.baoge.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/5/3
 *
 * 远程调试：
 * JDWP: Java Debug Wire Protocol, Java调试协议
 * java -agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=5050 -jar spring-lecture-1.0-SNAPSHOT.jar
 */

@SpringBootApplication
public class SpringLectureApplication {

    public static void main(String[] args) {
        // 1、idea右键run启动时输出的是AppClassLoader
        // 2、项目打成jar包，以java -jar ...启动，输出LaunchedURLClassLoader
        System.out.println("=============" + SpringLectureApplication.class.getClassLoader());
        SpringApplication.run(SpringLectureApplication.class, args);
    }

}
