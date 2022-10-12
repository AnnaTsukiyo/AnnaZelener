package com.epam.laba.hometask1.pet;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component(value = "Cat")
@Order(2)
public class Cat implements Animal {
}