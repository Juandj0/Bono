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
public abstract class Sede  {
    //Cualquier sede maneja la siguiente información: Nombre de la sede, dirección, Teléfono, Área construida. 
     protected String nombre;

   
    protected  String direccion;
    protected  String telofono;
   protected String AreaConstruida;
   protected ArrayList<Programa> programas;

 

    public Sede(String nombre, String direccion, String telofono, String AreaConstruida) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telofono = telofono;
        this.AreaConstruida = AreaConstruida;
        this.programas=new ArrayList();
    }
     public String getNombre() {
        return nombre;
    }

 

       public ArrayList<Programa> getProgramas() {
        return programas;
    }

  
    
         public void addPrograma(Programa x){
         this.programas.add(x);
         }
             public abstract String darInformación ();
}
