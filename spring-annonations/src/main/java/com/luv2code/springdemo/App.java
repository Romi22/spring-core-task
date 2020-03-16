package com.luv2code.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static  void main(String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee emp = context.getBean("employee",Employee.class);
        System.out.println(emp);

        String beans[] = context.getBeanDefinitionNames();

        System.out.println(Arrays.toString(beans));
    }
}
