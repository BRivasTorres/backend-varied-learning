package com.spring.IoC;

import com.spring.IoC.CreacionInformes;

public class DirectorEmpleado implements Empleados {

    private CracionInformes informeNuevo;

    public DirectorEmpleado(CreacionInformes informeNuevo) {
        this.informeNuevo = informeNuevo;
    }

    @Override
    public String getTareas() {
        return "Director";
    }

    @Override
    public String getInforme() {
        throw new UnsupportedOperationException("Unimplemented method 'getInforme'");
    }

}
