package com.epam.laba.hometask2.beans;

import lombok.Data;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Data
public class BeanA implements DefaultBean, InitializingBean, DisposableBean {
    private String name;
    private Integer value;

    @Override
    public void afterPropertiesSet() {
        System.out.printf("%s: InitializingBean.afterPropertiesSet started%n", BeanA.class.getSimpleName());
    }

    @Override
    public void destroy() {
        System.out.printf("%s:  DisposableBean.destroy started%n", BeanA.class.getSimpleName());
    }

}
