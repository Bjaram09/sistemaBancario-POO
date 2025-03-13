/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaDeNegocio;

/**
 *
 * @author bryan
 */
public class CuentaAhorro extends CuentaBancaria {
    private double interes;
    private String periodo;

    public CuentaAhorro() {}

    public CuentaAhorro(String numeroCuenta, boolean activa, double saldo, String tipo, String divisa, double interes, String periodo) {
        super(numeroCuenta, activa, saldo, tipo, divisa);
        this.interes = interes;
        this.periodo = periodo;
    }
    
    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
 

    @Override
    public String toString() {
        return "CuentaAhorro{" +
                "interes=" + interes +
                ", periodo='" + periodo + '\'' +
                "} " + super.toString();
    }
}
