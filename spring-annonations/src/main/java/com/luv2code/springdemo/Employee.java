package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee
{

    @Value("${emp.name}")
    String name;

    @Value("${emp.age}")
    Integer age;

    @Autowired
    private Department department;

    public Employee()
    {
        System.out.println("Inside the Employee constructor");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Autowired
    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "EmployeeDetails:" +
                "\nName:" + name +"\nAge:" + age + "\nDepartment:" + department;
    }
}
