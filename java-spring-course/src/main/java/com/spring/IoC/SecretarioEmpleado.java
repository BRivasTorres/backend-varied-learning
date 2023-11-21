package com.spring.IoC;

public class SecretarioEmpleado implements Empleados {
    public String getTareas() {
        return "Gestiona agenda";
    }

    @Override
    public String getInforme() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getInforme'");
    }
}
