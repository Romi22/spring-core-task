package com.luv2code.springdemo;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class Employee {
    private String name;
    private Integer age;
    private Double salary;

    private Department department;

    private Date dateFormat;
    private List<String> taskList;


    public Employee() {
        System.out.println("Inside Employee constructor");
    }


    public void setDepartment(Department department) {
        System.out.println("inside set deptt.");
        this.department = department;
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
    public void setTaskList(List<String> taskList) {
        this.taskList = taskList;
    }

    @Override
    public String toString() {
        return "\nName : " +name + " \nAge :  "+ age + " \nsalary : "+ salary + department;
    }
}