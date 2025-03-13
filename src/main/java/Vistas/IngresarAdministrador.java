/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import javax.swing.JOptionPane;

/**
 *
 * @author bryan
 */
public class IngresarAdministrador {
    private String nombre;
    
    public void ingresarNombre(){
      nombre = JOptionPane.showInputDialog("Inserte su nombre: ");
    }
    
    public String retornarNombre(){
        return nombre; 
    }
    
}
