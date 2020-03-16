package com.luv2code.springdemo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(EmployeeConfig.class);
        Employee emp = (Employee) ctx.getBean(Employee.class);
        System.out.println(emp);
    }
}