/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.william.ejemplohash;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author William
 */
public class CentroVacunacion {
    
   public HashMap<Integer, Persona> personas;

    public CentroVacunacion(HashMap<Integer, Persona> personas) {
        this.personas = personas;
    }
   
   public void agregarPersona(Persona p){
       this.personas.put(p.getCui(), p);
   }
   
   public Persona buscarPersona(int id) {
        return this.personas.get(id);
    }
   
   public boolean obtenerEstadoVacunacion(int id) {
        Persona p = this.personas.get(id);
        return p.isVacunada();
    }
   
    public void vacunarPersona(int id, Vacuna v) {
        Persona p = this.personas.get(id);
        if (!p.isVacunada()) {
            p.setEstadoVacunacion(true);
        } else {
            System.out.println("La persona ya ha sido vacunada.");
        }
    }
    
     public ArrayList<Persona> obtenerPersonasNoVacunadas() {
        ArrayList<Persona> personasNoVacunadas = new ArrayList<Persona>();
        for (Persona p : this.personas.values()) {
            if (!p.isVacunada()) {
                personasNoVacunadas.add(p);
            }
        }
        return personasNoVacunadas;
    }

}
