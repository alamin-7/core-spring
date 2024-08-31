package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext  applicationContext = new ClassPathXmlApplicationContext("config.xml");

        Student student = (Student) applicationContext.getBean("student1");

        //   applicationContext.close();

        Student student1 = (Student) applicationContext.getBean("student2");

       System.out.println(student.hashCode());
       System.out.println(student1.hashCode());
    }
}