package com.epam.laba.hometask2.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class BeanB implements DefaultBean {
    @Value("${beanB.name}")
    private String name;
    @Value("${beanB.value}")
    private Integer value;

    public void init() {
        System.out.printf("%s: Init() method started%n", BeanB.class.getSimpleName());
    }

    public void modify() {
        System.out.printf("%s: Modify() method started%n", BeanB.class.getSimpleName());
    }

    public void destroy() {
        System.out.printf("%s: Destroy() method started%n", BeanB.class.getSimpleName());
    }

}
