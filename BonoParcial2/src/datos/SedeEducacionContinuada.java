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
public class SedeEducacionContinuada extends Sede   {
    private String cursoPopular;

    public SedeEducacionContinuada(String nombre, String direccion, String telofono, String AreaConstruida,String cursoPopular) {
        super(nombre, direccion, telofono, AreaConstruida);
        this.cursoPopular=cursoPopular;
    }
     //Composicion de programa , los programas no pueden existir sin la sede
   public void addProgramaEdContinuada(String nombre, String descripcion,boolean calidad){
      ProgramaEdContinuada x= new ProgramaEdContinuada(nombre,descripcion,calidad);
     this.programas.add(x);
   }
    @Override
    public String darInformación() {
      return "nombre "+this.nombre+"  direccion"+this.direccion+"  telefono"+this.telofono+" Area Constriuda"+ this.AreaConstruida+"Curso popular"+this.cursoPopular;
    }
    
}
