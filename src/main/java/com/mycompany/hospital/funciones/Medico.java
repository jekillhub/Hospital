package com.mycompany.hospital.funciones;

public class Medico extends Empleado {
    
    private String especialidad;
    private String servicio;
    private int tConsultorio;

    public Medico(String especialidad, String servicio, int tConsultorio, int cEmpleado, int nHorasExtras, String fIngreso, String area, String cargo, int rut, String nombre, String apellido, String fNacimiento, String direccion, String cProcedencia) {
        super(cEmpleado, nHorasExtras, fIngreso, area, cargo, rut, nombre, apellido, fNacimiento, direccion, cProcedencia);
        this.tConsultorio = tConsultorio;
        
        Especialidad esp = Enum.valueOf(Especialidad.class, especialidad.toUpperCase());
        this.especialidad = esp.getEspecialidadE();
        
        Servicio ser = Enum.valueOf(Servicio.class, servicio.toUpperCase());
        this.servicio = ser.getServicioE();
        
        
    }

    







    
enum Especialidad {

    OFTALMOLOGO("oftalmologo"),
    CIRUJANO("cirujano"),
    NEUROLOGO("neurologo"),
    PEDIATRA("pediatra");
    
    String especialidad;
    
    private Especialidad(String especialidad){
        
        this.especialidad = especialidad;
    
    }
    
    public String getEspecialidadE(){
    
        return this.especialidad;
    
    }
    
}

enum Servicio {

    OFTALMOLOGIA("oftalmologia"),
    CIRUGIA("cirugia"),
    NEUROLOGia("neurologia"),
    PEDIATRIA("pediatria");
    
    String servicio;
    
    private Servicio(String servicio){
        
        this.servicio = servicio;
    
    }
    
    public String getServicioE(){
    
        return this.servicio;
    
    }
    
}


}