package com.john.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * Spring父容器，排除掉Controller注解
 * Spring 不扫描Controller
 */
@ComponentScan(value = "com.john", excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class)})
public class RootConfig {
}
