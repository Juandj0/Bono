/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.*;

/**
 *
 * @author Estudiante
 */
public abstract  class Programa {
   // Cada programa de formación tiene un nombre y una descripción.
    protected String nombre;
    protected String descripcion;
    protected ArrayList<Estudiante> estudiantes;
    protected boolean calidad;

    public Programa(String nombre, String descripcion,boolean calidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estudiantes = new ArrayList();
        this.calidad=calidad;
        
    }
    public void addEstudiante(Estudiante s){
        this.estudiantes.add(s);
    
    
    }
    
    public abstract String  darInformacion();
    
}
