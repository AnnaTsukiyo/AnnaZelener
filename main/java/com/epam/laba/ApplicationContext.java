package com.epam.laba;

import com.epam.laba.hometask2.config.BeanConfigByManual;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class ApplicationContext {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ap = new AnnotationConfigApplicationContext(BeanConfigByManual.class);
        Arrays.stream(ap.getBeanDefinitionNames()).forEach(System.out::println);
        ap.close();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigByManual.class);
        for (String name : context.getBeanDefinitionNames()) {
            System.out.println("[CONFIGURATION] " + name + " : " + context.getBeanDefinition(name));
        }
        context.close();
   }
}