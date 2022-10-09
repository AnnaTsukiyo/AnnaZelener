package com.epam.laba;

import com.epam.laba.hometask1.config.BeansConfig;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class ApplicationContext {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ap = new AnnotationConfigApplicationContext(BeansConfig.class);
        Arrays.stream(ap.getBeanDefinitionNames()).forEach(System.out::println);
        ap.close();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
        for (String name : context.getBeanDefinitionNames()) {
            System.out.println("[CONFIGURATION] " + name + " : " + context.getBeanDefinition(name));
        }
        context.close();
    }
}