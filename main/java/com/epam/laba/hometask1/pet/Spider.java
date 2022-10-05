package com.epam.laba.hometask1.pet;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component(value = "Spider")
@Order(4)
public class Spider implements Animal {
}
