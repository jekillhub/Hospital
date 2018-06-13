package com.mycompany.hospital;

public class Empleado extends Persona {

	private int cEmpleado;
	private int nHorasExtras;
	private String fIngreso;
	private String area;
	private String cargo;

    public Empleado(int cEmpleado, int nHorasExtras, String fIngreso, String area, String cargo, int rut, String nombre, String apellido, String fNacimiento, String direccion, String cProcedencia) {
        super(rut, nombre, apellido, fNacimiento, direccion, cProcedencia);
        this.cEmpleado = cEmpleado;
        this.nHorasExtras = nHorasExtras;
        this.fIngreso = fIngreso;
        this.area = area;
        this.cargo = cargo;
    }

        

        
        
}