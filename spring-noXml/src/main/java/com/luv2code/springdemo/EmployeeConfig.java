package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Date;


@Configuration
@PropertySource("classpath:EmployeeDetails.properties")
@ComponentScan("com.luv2code")
public class EmployeeConfig
{
    @Bean
    public Employee employee(@Autowired Department department){
        return new Employee(department);
    }

    //by @Autowired we are accessing that special bean and setting its properties
    @Bean
    public Department department(@Autowired Date date){
        Department d =  new Department();
        d.setDate(date);
        d.setDepartment("${emp.department}");
        return d;
        //return null;
    }

    //DateConverter is implementing factory bean that means it is a special bean therefore we will make it as bean in  config file

    @Bean
    public DateConverter createdOn(){
        return new DateConverter();
    }


}
