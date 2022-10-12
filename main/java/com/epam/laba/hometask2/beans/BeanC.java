package com.epam.laba.hometask2.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
@Data
public class BeanC implements DefaultBean {
    @Value("${beanC.name}")
    private String name;
    @Value("${beanC.value}")
    private Integer value;

    public void init() {
        System.out.printf("%s: Init() method started%n", BeanC.class.getSimpleName());
    }

    public void destroy() {
        System.out.printf("%s: Destroy() method started%n", BeanC.class.getSimpleName());
    }

}
