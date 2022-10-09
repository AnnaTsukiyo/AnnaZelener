package com.epam.laba.hometask2.config;

import com.epam.laba.hometask2.beans.BeanA;
import com.epam.laba.hometask2.beans.BeanE;
import com.epam.laba.hometask2.beans.BeanF;
import com.epam.laba.hometask2.other.BeansValidator;
import com.epam.laba.hometask2.other.OtherBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;

@Import(BeanConfigureByProperties.class)
@Configuration
public class BeanConfigByManual {
    @Lazy
    @Bean
    BeanF beanF() {
        return new BeanF();
    }

    @Bean
    BeanA beanA() {
        return new BeanA();
    }

    @Bean
    BeanE beanE() {
        return new BeanE();
    }

    @Bean
    OtherBean beanChanger() {
        return new OtherBean();
    }

    @Bean
    BeansValidator beanValidator() {
        return new BeansValidator();
    }
}
