package com.luv2code.springdemo;

import java.util.Date;

public class Department {

    private String department;

    private Date createdOn;

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        return " \nDepartment: " + department + " \nDate: " +createdOn ;
    }
}


