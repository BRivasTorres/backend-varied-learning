package com.spring.IoC;

public class JefeEmpleado implements Empleados {
    public String getTareas() {
        return "Gestiono las tareas";
    }

    @Override
    public String getInforme() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getInforme'");
    }
}
