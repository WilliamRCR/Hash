/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.william.ejemplohash;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author wil_c
 */
public class EjemploHash {

    public static void main(String[] args) {
        int opcion = 0;
        String elemento;
        HashMap h = new HashMap();
       
         // Crear objeto de la clase CentroVacunacion
        CentroVacunacion centro = new CentroVacunacion(h);

        // Crear menú principal
        String[] opciones = {"Agregar persona", "Eliminar persona", "Buscar persona", "Vacunar persona", "Obtener estado de vacunación", "Obtener personas no vacunadas", "Salir"};
        int opcionSeleccionada = 0;
        while(opcionSeleccionada != opciones.length - 1) {
            opcionSeleccionada = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Centro de vacunación", 
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            switch(opcionSeleccionada) {
                case 0: // Agregar persona
                    String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la persona:", "Agregar persona", JOptionPane.PLAIN_MESSAGE);
                    int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad de la persona:", "Agregar persona", JOptionPane.PLAIN_MESSAGE));
                    int cui = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el CUI de la persona:", "Agregar persona", JOptionPane.PLAIN_MESSAGE));
                    
                    Persona persona = new Persona(nombre, edad, cui);
                    centro.agregarPersona(persona);
                    JOptionPane.showMessageDialog(null, "Persona agregada correctamente.", "Agregar persona", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        }
        
    
    }
    
}
