package com.epam.laba.hometask1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.epam.laba.hometask1.other")
@Import(PetConfig.class)
public class OtherConfig {
}
