/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaDeNegocio;

/**
 *
 * @author bryan
 */
public class Administrador extends Usuario {
    public Administrador() {
        super();
    }

    public Administrador(String id, String cedula, String nombre, String apellido1, String apellido2, String correoElectronico) {
        super(id, cedula, nombre, apellido1, apellido2, correoElectronico);
    }

    public void registrarUsuario() {
      
    }

    @Override
    public String toString() {
        return "Administrador{} " + super.toString();
    }
}
