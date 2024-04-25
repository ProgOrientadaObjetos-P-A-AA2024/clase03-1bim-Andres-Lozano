/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

public class InstitucionEducativa {
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    
    public void establecerNombres(String nom){
        nombre= nom;
    }
        public void establecerInstitucion(String ins){
        tipoInstitucion= ins;
    }
        public void establecerNumeroAlumnos(int num){
        numeroAlumnos= num;
    }
        public void establecerNumeroDocentes(int num){
        numeroDocentes= num;
    }
        public void establecerNumeroSedes(int num){
        numeroSedes= num;
    }
        public String obtenerNombres(){
        return nombre;
    }
        public String obtenerInstitucion(){
        return tipoInstitucion;
    }
        public int obtenerNumeroAlumnos(){
        return numeroAlumnos;
    }
        public int obtenerNumeroDocentes(){
        return numeroDocentes;
    }
        public int obtenerNumeroSedes(){
        return numeroSedes;
    }        
}
