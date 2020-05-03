package com.baoge.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/5/3
 */

@Configuration
public class MyConfig {

    @Bean
    public MyConfigBean myConfigBean() {
        return new MyConfigBean();
    }

}
