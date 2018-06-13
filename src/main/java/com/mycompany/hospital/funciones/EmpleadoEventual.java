package com.mycompany.hospital.funciones;

public class EmpleadoEventual extends Empleado {

    private double hPorHora;
    private int hTotales;
    private String fTerminoContrato;

    public EmpleadoEventual(double hPorHora, int hTotales, String fTerminoContrato, int cEmpleado, int nHorasExtras, String fIngreso, String area, String cargo, int rut, String nombre, String apellido, String fNacimiento, String direccion, String cProcedencia) {
        super(cEmpleado, nHorasExtras, fIngreso, area, cargo, rut, nombre, apellido, fNacimiento, direccion, cProcedencia);
        this.hPorHora = hPorHora;
        this.hTotales = hTotales;
        this.fTerminoContrato = fTerminoContrato;
    }

        
}