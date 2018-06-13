package com.mycompany.hospital;

import java.util.ArrayList;

public class Empleado extends Persona implements Registro {

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

    @Override
    public void añadirEmpleadoEv(double hPorHora, int hTotales, String fTerminoContrato, int cEmpleado, int nHorasExtras, String fIngreso, String area, String cargo, int rut, String nombre, String apellido, String fNacimiento, String direccion, String cProcedencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void añadirEmpleadoPl(double sMensual, double pAdicionalHoraExtra, int cEmpleado, int nHorasExtras, String fIngreso, String area, String cargo, int rut, String nombre, String apellido, String fNacimiento, String direccion, String cProcedencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void añadirMedico(String especialidad, String servicio, int tConsultorio, int cEmpleado, int nHorasExtras, String fIngreso, String area, String cargo, int rut, String nombre, String apellido, String fNacimiento, String direccion, String cProcedencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void añadirPaciente(int nHistorialClinico, boolean sexo, String gSanguineo, ArrayList<String> mAlergico, int rut, String nombre, String apellido, String fNacimiento, String direccion, String cProcedencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ordenarPorEspecialidad(ArrayList medicos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listarPacientes(ArrayList pacientes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        

        
        
}