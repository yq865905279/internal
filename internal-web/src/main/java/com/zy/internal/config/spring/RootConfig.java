package com.zy.internal.config.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by zhangyanyan on 2017/6/24.
 */
@Configuration
@ComponentScan(basePackages = {"com.zy.internal"}, excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,
        value = EnableWebMvc.class)})
public class RootConfig {
}
