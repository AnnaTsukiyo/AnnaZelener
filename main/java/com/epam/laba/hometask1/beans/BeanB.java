package com.epam.laba.hometask1.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanB {
    public BeanB() {
        System.out.println(this.getClass().getSimpleName());
    }
}