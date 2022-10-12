package com.epam.laba.hometask2.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
@Data
public class BeanD implements DefaultBean {
    @Value("${beanD.name}")
    private String name;
    @Value("${beanD.value}")
    private Integer value;

    public void init() {
        System.out.printf("%s: Init() method started%n", BeanD.class.getSimpleName());
    }

    public void destroy() {
        System.out.printf("%s: Destroy() method started%n", BeanD.class.getSimpleName());
    }
}