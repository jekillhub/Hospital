package com.mycompany.hospital;

import java.util.ArrayList;

public interface Registro {
    
    public void añadirEmpleadoEv(double hPorHora, int hTotales, String fTerminoContrato, int cEmpleado, int nHorasExtras, String fIngreso, String area, String cargo, int rut, String nombre, String apellido, String fNacimiento, String direccion, String cProcedencia);
    
    public void añadirEmpleadoPl(double sMensual, double pAdicionalHoraExtra, int cEmpleado, int nHorasExtras, String fIngreso, String area, String cargo, int rut, String nombre, String apellido, String fNacimiento, String direccion, String cProcedencia);
    
    public void añadirMedico(String especialidad, String servicio, int tConsultorio, int cEmpleado, int nHorasExtras, String fIngreso, String area, String cargo, int rut, String nombre, String apellido, String fNacimiento, String direccion, String cProcedencia);
    
    public void añadirPaciente(int nHistorialClinico, boolean sexo, String gSanguineo, ArrayList<String> mAlergico, int rut, String nombre, String apellido, String fNacimiento, String direccion, String cProcedencia);
    
    public void ordenarPorEspecialidad(ArrayList medicos);
    
    public void listarPacientes(ArrayList pacientes);
        
       
}
