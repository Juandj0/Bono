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
public class SedeTecnologica extends Sede {
    private int numEstudiantes;

    public SedeTecnologica(String nombre, String direccion, String telofono, String AreaConstruida) {
        super(nombre, direccion, telofono, AreaConstruida);
        this.numEstudiantes=0;
    }
    //Composicion de programa , los programas no pueden existir sin la sede
      public void addProgramaFormacion(String nombre, String descripcion,boolean calidad){
     ProgramaFormacion x=new ProgramaFormacion(nombre,descripcion,calidad);
     this.programas.add(x);
      }
    @Override
    public String darInformación() {
       return "nombre "+this.nombre+"  direccion"+this.direccion+"  telefono"+this.telofono+" Area Constriuda"+ this.AreaConstruida+ "Num Estudiantes" +this.numEstudiantes;
    }
}
