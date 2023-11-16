package com.spring.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {
    public static void main(String[] args) {
        // Empleados empleado1 = new DirectorEmpleado();

        // System.out.println(empleado1.getTareas());

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
}
