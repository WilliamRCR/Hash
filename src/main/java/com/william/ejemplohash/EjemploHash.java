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
       
        
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                     1. Insertar al inicio
                     2. Insertar al Final
                     3. Recorrer                                                     
                     4. Buscar elemento                                                       
                     5. Borrar un elemento
                     6. Salir                                                                                                                                            
                     Menu de opciones                                                       """, "Menu de Opciones",
                        JOptionPane.INFORMATION_MESSAGE));
                
                switch(opcion){
                    case 1:
                        elemento = JOptionPane.showInputDialog(null, "Ingresar elemento del nodo",
                                "Agregar nodo al inicio", JOptionPane.INFORMATION_MESSAGE);
                                h.put(h, elemento);
                        break;
                }
                
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }
            
        }while(opcion != 3);
        
        
        
    
    }
    
}
