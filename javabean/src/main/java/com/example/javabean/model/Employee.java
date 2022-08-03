package com.example.javabean.model;

public class Employee {
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void employeeDetails(){
        System.out.println("Employee name"+" "+name);
    }
}
