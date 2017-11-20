/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import datos.*;
import java.io.*;

import java.util.*;

/**
 *
 * @author El PcGamer
 */
public class Logica {
     private Universidad universidad;

    public Logica() {
        this.universidad= new Universidad();
    }

    public Universidad getUniversidad() {
        return universidad;
    }
     public void cargar(String ruta){
          File lectura = new File(ruta);
       Scanner leer = null;
       if(lectura.exists()){
           try {
               leer = new Scanner(lectura);
               leer.useDelimiter(",");
               String tipo = tipo = leer.next().trim();
               while(leer.hasNext()){
                   switch (tipo) {
                       case "SEC":
                           {
                               String nombre = leer.next().trim();
                               String direccion = leer.next().trim();
                               String telefono = leer.next();
                               String area = leer.next();
                               String curso= leer.next();
                               this.getUniversidad().addSedeEducacionContinuada(nombre, direccion,telefono,area,curso);
                               int nsedes = this.getUniversidad().getSedes().size();
                               tipo = leer.next().trim();
                               while (!((tipo.equals("SP")||tipo.equals("ST"))||tipo.equals("SEC"))){
                                   switch(tipo){
                                       case "PEC":              
                                           String nombre1 = leer.next().trim();
                                           String descripcion = leer.next().trim();
                                           
                                           ProgramaEdContinuada x= new ProgramaEdContinuada(nombre1,descripcion,true);
                                           this.getUniversidad().getSedes().get(nsedes - 1).addPrograma(x);
                                           break;
                                       default:
                                           break;
                                   }
                                   if(leer.hasNext()){
                                       tipo = leer.next().trim();
                                       if((tipo.equals("SP")||tipo.equals("ST"))||tipo.equals("SEC")){
                                           break;
                                       }
                                   }else{break;}
                               }       break;
                           }
                       case "SP":
                           {
                               String nombre = leer.next().trim();
                               String direccion = leer.next().trim();
                               String telefono = leer.next();
                               String area = leer.next();
                               int numerodecursos= leer.nextInt();
                               this.getUniversidad().addSedeProfesional(nombre, direccion,telefono,area,numerodecursos);
                               int nsedes = this.getUniversidad().getSedes().size();
                               tipo = leer.next().trim();
                               while (!((tipo.equals("SP")||tipo.equals("ST"))||tipo.equals("SEC"))){
                                   switch(tipo){
                                       case "PEC":

                                            String nombre1 = leer.next().trim();
                                            String descripcion1 = leer.next().trim();
                                           ProgramaEdContinuada p= new ProgramaEdContinuada(nombre1,descripcion1,true);
                                           this.getUniversidad().getSedes().get(nsedes - 1).addPrograma(p);
                                           break;
                                       case "PF":
                                           String nombre2 = leer.next().trim();
                                           String descripcion2 = leer.next().trim();
                         
                                           ProgramaFormacion q= new ProgramaFormacion(nombre2,descripcion2,false);
                                           this.getUniversidad().getSedes().get(nsedes - 1).addPrograma(q);
                                           break;
                                       case "PT":

                                           String nombre3 = leer.next().trim();
                                           String descripcion3 = leer.next().trim();
                                           ProgramaTecnico r= new ProgramaTecnico(nombre3,descripcion3,false);
                                           this.getUniversidad().getSedes().get(nsedes - 1).addPrograma(r);
                                           break;
                                   }
                                   if(leer.hasNext()){
                                       tipo = leer.next().trim();
                                       if((tipo.equals("SP")||tipo.equals("ST"))||tipo.equals("SEC")){
                                           break;
                                       }
                                   }else{break;}
                               }       break;
                           }
                       case "ST":
                           {
                               String nombre = leer.next().trim();
                               String direccion = leer.next().trim();
                               String telefono = leer.next();
                               String area = leer.next();
                              
                               this.getUniversidad().addSedeTecnologica(nombre, direccion, telefono, area);
                               int nsedes = this.getUniversidad().getSedes().size();
                               tipo = leer.next().trim();
                               while (!((tipo.equals("SP")||tipo.equals("ST"))||tipo.equals("SEC"))){
                                   switch(tipo){
                                       case "PF":
                                           String nombre1 = leer.next().trim();
                                           String descripcion1 = leer.next().trim();
                                           ProgramaFormacion q= new ProgramaFormacion(nombre1,descripcion1,true);
                                           this.getUniversidad().getSedes().get(nsedes - 1).addPrograma(q);
                                           break;
                                 
                                   }
                                   if(leer.hasNext()){
                                       tipo = leer.next().trim();
                                       if((tipo.equals("SP")||tipo.equals("ST"))||tipo.equals("SEC")){
                                           break;
                                       }
                                   }else{
                                       
                                       break;
                                   }
                               }       break;
                           }
                       default:
                           break;
                   }
               }
               
               
           } catch (FileNotFoundException ex) {
               
           }
          
       }
    }
}
