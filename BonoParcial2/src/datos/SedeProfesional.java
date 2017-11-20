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
public class SedeProfesional extends Sede{
  private int numProgramasCalidad;
    public SedeProfesional(String nombre, String direccion, String telofono, String AreaConstruida,int programasCalidad) {
        super(nombre, direccion, telofono, AreaConstruida);
        this.numProgramasCalidad=programasCalidad;
    }

    
    //Composicion de programa , los programas no pueden existir sin la sede
   public void addProgramaEdContinuada(String nombre, String descripcion,boolean calidad){
      ProgramaEdContinuada x= new ProgramaEdContinuada(nombre,descripcion,calidad);
     this.programas.add(x);
   }
    public void addProgramaTecnico(String nombre, String descripcion,boolean calidad){
        ProgramaTecnico x= new ProgramaTecnico(nombre,descripcion,calidad);
        this.programas.add(x);
    } 
   public void addProgramaFormacion(String nombre, String descripcion,boolean calidad){
     ProgramaFormacion x=new ProgramaFormacion(nombre,descripcion,calidad);
     this.programas.add(x);
      }
    //Retorna programas tecnicos
    public ArrayList<Programa> getProgramasTecnicos(){
        ArrayList<Programa> x= new ArrayList();
        
        
        return x;
    }
    @Override
    public String darInformación() {
        return "nombre "+this.nombre+"  direccion"+this.direccion+"  telefono"+this.telofono+" Area Constriuda"+ this.AreaConstruida+"Programas de Calidad" +this.numProgramasCalidad;
    }
}
