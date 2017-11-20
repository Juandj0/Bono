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
public class Estudiante {
   // Se debe registrar de los estudiantes nombre, apellido, colegio donde se graduó y año y Programa en el cual está registrado.
private String nombre;
private String apellido;
private String colegio;
private String año;
private String programa;

    public Estudiante(String nombre, String apellido, String colegio, String año, String programa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.colegio = colegio;
        this.año = año;
        this.programa = programa;
    }

}
