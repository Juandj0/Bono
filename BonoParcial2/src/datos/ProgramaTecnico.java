/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class ProgramaTecnico extends Programa{
    
    public ProgramaTecnico(String nombre, String descripcion,boolean calidad) {
        super(nombre, descripcion,calidad);
    }

    @Override
    public String darInformacion() {
          return "Nombre   "+  this.nombre+ "Descripcion  " +  this.descripcion;
    }
    
}
