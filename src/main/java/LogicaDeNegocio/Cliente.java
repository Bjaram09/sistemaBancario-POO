/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaDeNegocio;

/**
 *
 * @author bryan
 */

import java.util.ArrayList;

public class Cliente extends Usuario {
    private String sexo;
    private String profesion;
    private String direccion;
    private ArrayList<CuentaDebito> cuentasDebito;
    private ArrayList<CuentaCredito> cuentasCredito;
    private ArrayList<CuentaAhorro> cuentasAhorro;

    public Cliente() {
        super();
        this.sexo = "";
        this.profesion = "";
        this.direccion = "";
        this.cuentasDebito = new ArrayList<>();
        this.cuentasCredito = new ArrayList<>();
        this.cuentasAhorro = new ArrayList<>();
    }

    public Cliente(String id, String cedula, String nombre, String apellido1, String apellido2, String correoElectronico, String sexo, String profesion, String direccion) {
        super(id, cedula, nombre, apellido1, apellido2, correoElectronico);
        this.sexo = sexo;
        this.profesion = profesion;
        this.direccion = direccion;
        this.cuentasDebito = new ArrayList<>();
        this.cuentasCredito = new ArrayList<>();
        this.cuentasAhorro = new ArrayList<>();
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "sexo='" + sexo + '\'' +
                ", profesion='" + profesion + '\'' +
                ", direccion='" + direccion + '\'' +
                ", cuentasDebito=" + cuentasDebito +
                ", cuentasCredito=" + cuentasCredito +
                ", cuentasAhorro=" + cuentasAhorro +
                "} " + super.toString();
    }
}
