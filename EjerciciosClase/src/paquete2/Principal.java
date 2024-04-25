/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.InstitucionEducativa;

public class Principal {

    public static void main(String[] args) {
        /*Un objeto de tipo InstitucionEducativa*/
        String nombre = "Mater Dei";
        String tipoInstitucion = "Fiscomicional";
        int numeroAlumnos = 500;
        int numeroDocentes = 40 ;
        int numeroSedes = 1 ;
        
        InstitucionEducativa i1 = new InstitucionEducativa();
        
        i1.establecerNombres(nombre);
        i1.establecerInstitucion(tipoInstitucion);
        i1.establecerNumeroAlumnos(numeroAlumnos);
        i1.establecerNumeroDocentes(numeroDocentes);
        i1.establecerNumeroSedes(numeroSedes);
        
        System.out.printf("Nombre de la Institucion: %s\nTipo de institucion: %s\n"
                + "Numero de estudiantes: %s\nNumero de docentes: %s\nNumero de sedes: %s\n",
        i1.obtenerNombres(), i1.obtenerInstitucion(), i1.obtenerNumeroAlumnos(), 
        i1.obtenerNumeroDocentes(), i1.obtenerNumeroSedes());

    }
}
