package com.mycompany.hospital.funciones;

public class Medico extends Empleado {
    
    private String especialidad;
    private String servicio;
    private int tConsultorio;

    public Medico(String especialidad, String servicio, int tConsultorio, int cEmpleado, int nHorasExtras, String fIngreso, String area, String cargo, int rut, String nombre, String apellido, String fNacimiento, String direccion, String cProcedencia) {
        super(cEmpleado, nHorasExtras, fIngreso, area, cargo, rut, nombre, apellido, fNacimiento, direccion, cProcedencia);
        this.especialidad = especialidad;
        this.servicio = servicio;
        this.tConsultorio = tConsultorio;
    }

        

        
        
}