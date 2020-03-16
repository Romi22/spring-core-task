package com.luv2code.springdemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class App
{
    public static void main(String[] args ) throws ParseException {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
       Employee emp = context.getBean("myEmp",Employee.class);
       System.out.println(emp);
    }
}
