/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import datos.*;
import java.util.HashMap;
import Logica.*;
import java.util.ArrayList;
/**
 *
 * @author Estudiante
 */
public class Main {
      public static void main(String[] args) {
         Logica l=new Logica();
        l.cargar("text");
       ArrayList<String> s = l.getUniversidad().darInformacionSedes();
       ArrayList<String> f =l.getUniversidad().darInformacionTodosLosCursos();
        for (int i = 0; i < s.size(); i++){
            System.out.println(s.get(i));
                    
      
    }
         System.out.println("Programas de todas las sedes");
        for(int v= 0; v < f.size(); v++){
             System.out.println(f.get(v));
             
       
        
        
        }

    
}
}