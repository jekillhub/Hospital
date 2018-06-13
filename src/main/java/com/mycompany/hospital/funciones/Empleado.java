package com.mycompany.hospital.funciones;

import java.util.ArrayList;

public class Empleado extends Persona implements Registro, Cita {

	private int cEmpleado;
	private int nHorasExtras;
	private String fIngreso;
	private String area;
	private String cargo;
        private Hospital hospital;

    public Empleado(int cEmpleado, int nHorasExtras, String fIngreso, String area, String cargo, int rut, String nombre, String apellido, String fNacimiento, String direccion, String cProcedencia) {
        super(rut, nombre, apellido, fNacimiento, direccion, cProcedencia);
        this.cEmpleado = cEmpleado;
        this.nHorasExtras = nHorasExtras;
        this.fIngreso = fIngreso;
        this.area = area;
        this.cargo = cargo;
        this.hospital = new Hospital();
    }

    @Override
    public void añadirEmpleadoEv(double hPorHora, int hTotales, String fTerminoContrato, int cEmpleado, int nHorasExtras, String fIngreso, String area, String cargo, int rut, String nombre, String apellido, String fNacimiento, String direccion, String cProcedencia) {
        EmpleadoEventual ev = new EmpleadoEventual(hPorHora, hTotales, fTerminoContrato, cEmpleado, nHorasExtras, fIngreso, area, cargo, rut, nombre, apellido, fNacimiento, direccion, cProcedencia);
        this.hospital.empleados.add(ev);
    }

    @Override
    public void añadirEmpleadoPl(double sMensual, double pAdicionalHoraExtra, int cEmpleado, int nHorasExtras, String fIngreso, String area, String cargo, int rut, String nombre, String apellido, String fNacimiento, String direccion, String cProcedencia) {
        EmpleadoPlanilla pl = new EmpleadoPlanilla(sMensual, pAdicionalHoraExtra, cEmpleado, nHorasExtras, fIngreso, area, cargo, rut, nombre, apellido, fNacimiento, direccion, cProcedencia);
        this.hospital.empleados.add(pl);
    }

    @Override
    public void añadirMedico(String especialidad, String servicio, int tConsultorio, int cEmpleado, int nHorasExtras, String fIngreso, String area, String cargo, int rut, String nombre, String apellido, String fNacimiento, String direccion, String cProcedencia) {
        Medico med = new Medico(especialidad, servicio, tConsultorio, cEmpleado, nHorasExtras, fIngreso, area, cargo, rut, nombre, apellido, fNacimiento, direccion, cProcedencia);
        this.hospital.empleados.add(med);
    }

    @Override
    public void añadirPaciente(int nHistorialClinico, boolean sexo, String gSanguineo, ArrayList<String> mAlergico, int rut, String nombre, String apellido, String fNacimiento, String direccion, String cProcedencia) {
        Paciente pa = new Paciente(nHistorialClinico, sexo, gSanguineo, mAlergico, rut, nombre, apellido, fNacimiento, direccion, cProcedencia);
        this.hospital.pacientes.add(pa);
    }

    @Override
    public void ordenarPorEspecialidad(ArrayList medicos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listarPacientes(ArrayList pacientes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String buscarMedico(String servicio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String buscarFecha(String nombreMedico, String apellidoMedico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String buscarHora(String nombreMedico, String apellidoMedico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        

        
        
}