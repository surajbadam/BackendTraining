package com.example.javabean;

import com.example.javabean.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavabeanApplication {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("-----------------");
        Employee emp=(Employee) context.getBean("employee");
        System.out.println("got employee object from the application context(spring container)");
        emp.employeeDetails();
    }

}
