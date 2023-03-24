/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.william.ejemplohash;

/**
 *
 * @author William
 */
public class Persona {
    String nombre;
    int edad;
    int cui;
    boolean estadoVacunacion;

    public Persona(String nombre, int edad, int cui) {
        this.nombre = nombre;
        this.edad = edad;
        this.cui = cui;
        this.estadoVacunacion = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCui() {
        return cui;
    }

    public void setCui(int cui) {
        this.cui = cui;
    }

    public boolean isVacunada() {
        return estadoVacunacion;
    }

    public void setEstadoVacunacion(boolean estadoVacunacion) {
        this.estadoVacunacion = estadoVacunacion;
    }
    
    
    
          
}


