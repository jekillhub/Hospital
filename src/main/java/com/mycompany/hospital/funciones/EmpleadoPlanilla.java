package com.mycompany.hospital.funciones;

public class EmpleadoPlanilla extends Empleado {

    private double sMensual;
    private double pAdicionalHoraExtra;

    public EmpleadoPlanilla(double sMensual, double pAdicionalHoraExtra, int cEmpleado, int nHorasExtras, String fIngreso, String area, String cargo, int rut, String nombre, String apellido, String fNacimiento, String direccion, String cProcedencia) {
        super(cEmpleado, nHorasExtras, fIngreso, area, cargo, rut, nombre, apellido, fNacimiento, direccion, cProcedencia);
        this.sMensual = sMensual;
        this.pAdicionalHoraExtra = pAdicionalHoraExtra;
    }

        
        
}