package com.epam.laba.hometask2.other;

import com.epam.laba.hometask2.beans.DefaultBean;
import com.epam.laba.hometask2.validation.Validator;
import com.epam.laba.hometask2.validation.ValidatorImp;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeansValidator implements BeanPostProcessor {
    private final Validator validator = new ValidatorImp();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("[BEFORE INIT] Method postProcessBeforeInitialization was executed on bean: " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("[AFTER INIT] Method postProcessAfterInitialization was executed on bean: " + beanName);
        if (bean instanceof DefaultBean) {
            this.validator.validateBeans((DefaultBean) bean);
        }
        return bean;
    }
}
