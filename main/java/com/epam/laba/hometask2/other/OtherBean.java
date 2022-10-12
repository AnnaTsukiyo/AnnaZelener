package com.epam.laba.hometask2.other;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class OtherBean implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("Interface BeanFactoryPostProcessor was implemented by OtherBean class");
        configurableListableBeanFactory.getBeanDefinition("beanB").setInitMethodName("modify");
        System.out.println("Init method of class BeanB was changed into modify method: modify()");
    }
}
