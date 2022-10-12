package com.epam.laba.hometask1.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanA {
    public BeanA() {
        System.out.println(this.getClass().getSimpleName());
    }
}