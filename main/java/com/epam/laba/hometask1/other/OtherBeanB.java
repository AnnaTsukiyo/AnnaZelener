package com.epam.laba.hometask1.other;

import com.epam.laba.hometask1.beans.BeanB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OtherBeanB {
    private BeanB beanB;

    @Autowired
    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
        System.out.println(this.getClass().getSimpleName() + ". " + beanB.getClass().getSimpleName() + " was injected through the setter");
    }
}