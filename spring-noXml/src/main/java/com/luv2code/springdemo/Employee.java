package com.luv2code.springdemo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Employee {

    @Value("${emp.name}")
    private String name;

    @Value("${emp.age}")
    private Integer age;

    @Value("${emp.salary}")
    private Double salary;

    private Department department;


    public Employee(Department department) {
        this.department=department;
        System.out.println("Inside Employee constructor");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }


    public void setDepartment(Department department)
    {
        this.department = department;
    }

    @Override
    public String toString() {
        return "\nName : " +name + " \nAge :  "+ age + " \nsalary : "+ salary + "\ndepartment:"+department;
    }
}