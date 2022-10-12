package com.epam.laba.hometask2.validation;

import com.epam.laba.hometask2.beans.DefaultBean;

public class ValidatorImp implements Validator{
    @Override
    public void validateBeans(DefaultBean bean) {
        if (!bean.toString().matches(".*\\bnull\\b.*")) {
            System.out.printf("Validation of %s was successful. [%s]%n", bean.getClass().getSimpleName(), bean);
        } else {
            System.out.printf(" Validation of %s was unsuccessful. [%s]%n", bean.getClass().getSimpleName(), bean);
        }
    }
}
