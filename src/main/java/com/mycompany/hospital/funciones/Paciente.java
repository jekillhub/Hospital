package com.mycompany.hospital.funciones;

import java.util.ArrayList;

public class Paciente extends Persona {

    private int nHistorialClinico;
    private boolean sexo;
    private String gSanguineo;
    private ArrayList<String> mAlergico;

    public Paciente(int nHistorialClinico, boolean sexo, String gSanguineo, ArrayList<String> mAlergico, int rut, String nombre, String apellido, String fNacimiento, String direccion, String cProcedencia) {
        super(rut, nombre, apellido, fNacimiento, direccion, cProcedencia);
        this.nHistorialClinico = nHistorialClinico;
        this.sexo = sexo;
        this.gSanguineo = gSanguineo;
        this.mAlergico = mAlergico;
    }
        
        

}