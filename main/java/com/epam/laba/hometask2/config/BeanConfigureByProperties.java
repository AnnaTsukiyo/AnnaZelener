package com.epam.laba.hometask2.config;

import com.epam.laba.hometask2.beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;
@PropertySource("classpath:application.properties")
@Configuration
public class BeanConfigureByProperties {
    @DependsOn({"beanD"})
    @Bean(
            initMethod = "init",
            destroyMethod = "destroy"
    )
    BeanB beanB() {
        return new BeanB();
    }

    @DependsOn({"beanB", "beanD"})
    @Bean(
            initMethod = "init",
            destroyMethod = "destroy"
    )
    BeanC beanC() {
        return new BeanC();
    }

    @Bean(
            initMethod = "init",
            destroyMethod = "destroy"
    )
    BeanD beanD() {
        return new BeanD();
    }
}