package com.epam.laba.hometask1.pet;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component(value = "Cheetah")
@Order(3)
public class Cheetah implements Animal {
}
