package com.mycompany.hospital.funciones;

public interface Cita {
    
    public String buscarMedico(String servicio);
    
    public String buscarFecha(String nombreMedico, String apellidoMedico);
    
    public String buscarHora(String nombreMedico, String apellidoMedico);

}
