package com.epam.laba.hometask2.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Data
public class BeanE implements DefaultBean {
    private String name;
    private Integer value;

    @PostConstruct
    public void postConstruct() {
        System.out.printf("%s: Init() method started%n", BeanE.class.getSimpleName());
    }

    @PreDestroy
    public void preDestroy() {
        System.out.printf("%s: Destroy() method started%n", BeanD.class.getSimpleName());
    }
}