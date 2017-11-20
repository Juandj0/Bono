/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Estudiante
 */
public class ProgramaFormacion extends Programa {
    
    public ProgramaFormacion(String nombre, String descripcion,boolean calidad) {
        super(nombre, descripcion,calidad);
    }

    @Override
    public String darInformacion() {
         return "Nombre   "+  this.nombre+ "Descripcion  " +  this.descripcion;
    }
    
}
