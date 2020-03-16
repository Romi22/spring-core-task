package com.luv2code.springdemo;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DateConverter implements FactoryBean<java.util.Date> {

    @Value("${emp.format}")
    private String format;

    @Value("${emp.date}")
    private String date;

    @Override
    public Date getObject() throws Exception {
//        return new Date();
    return new SimpleDateFormat(format).parse(date);
    }

    @Override
    public Class<?> getObjectType() {
        return java.util.Date.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
