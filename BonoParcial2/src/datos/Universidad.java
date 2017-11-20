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
public class Universidad {
    private ArrayList<Sede> sedes;

    public Universidad( ) {
        this.sedes = new ArrayList();
    }
    

   
    
   //Agregar  distintas clases de sedes 
    public void addSedeTecnologica(String nombre, String direccion, String telofono, String AreaConstruida) {
     SedeTecnologica s= new SedeTecnologica(nombre,direccion,telofono,AreaConstruida);
    
     this.sedes.add(s);
    }
    public void addSedeProfesional(String nombre, String direccion, String telofono, String AreaConstruida,int programasCalidad){
     SedeProfesional s= new SedeProfesional(nombre,direccion,telofono,AreaConstruida,programasCalidad);
    
     this.sedes.add(s);
    } 
    public void addSedeEducacionContinuada(String nombre, String direccion, String telofono, String AreaConstruida,String curso) {
         SedeEducacionContinuada s= new SedeEducacionContinuada(nombre,direccion,telofono,AreaConstruida,curso);
         this.sedes.add(s);
    
    }
    //Elimina sede por nombre
    public void eliminarSede(String nombre){
    for(int i=0;i<this.sedes.size();i++){
          if(this.sedes.get(i).getNombre().equals(nombre)){
              this.sedes.remove(i);
           break;
          }
    
    }
    
    
    
    }
    public ArrayList<String> darInformacionSedes(){
         ArrayList<String> a = new ArrayList();
     for(Sede sede : this.sedes){
        a.add(sede.darInformación());
         
     }
     return a;
    }
    public ArrayList<String> darInformacionTodosLosCursos(){
    
      ArrayList<String> t = new ArrayList();
        
        for(int i=0;i< this.sedes.size();i++){
           
           ArrayList<Programa> x= this.sedes.get(i).getProgramas();
           for(int f=0;f<x.size();f++){
           
              t.add( x.get(f).darInformacion()) ;
                
           }
           
        }
        return t;
    }
    
    
    //Obtener sedes
     public ArrayList<Sede> getSedes() {
        return sedes;
    }
     //modificar sedes
    public void modificarSedes(ArrayList<Sede> sedes) {
        this.sedes = sedes;
    }
    
    
    
}
