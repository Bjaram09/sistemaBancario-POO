/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaDeNegocio;

/**
 *
 * @author bryan
 */
public class CuentaCredito extends CuentaBancaria {
    private double limiteCredito;

    public CuentaCredito() {}

    public CuentaCredito(String numeroCuenta, boolean activa, double saldo, String tipo, String divisa, double limiteCredito) {
        super(numeroCuenta, activa, saldo, tipo, divisa);
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public String toString() {
        return "CuentaCredito{" +
                "limiteCredito=" + limiteCredito +
                "} " + super.toString();
    }
}
