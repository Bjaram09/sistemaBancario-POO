/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaDeNegocio;

/**
 *
 * @author bryan
 */
public class CuentaDebito extends CuentaBancaria {
    private double limiteRetiro;

    public CuentaDebito() {
        super();
        this.limiteRetiro = 0.0;
    }

    public CuentaDebito(String numeroCuenta, boolean activa, double saldo, String tipo, String divisa, double limiteRetiro) {
        super(numeroCuenta, activa, saldo, tipo, divisa);
        this.limiteRetiro = limiteRetiro;
    }

    public double getLimiteRetiro() {
        return limiteRetiro;
    }

    public void setLimiteRetiro(double limiteRetiro) {
        this.limiteRetiro = limiteRetiro;
    }

    @Override
    public String toString() {
        return "CuentaDebito{" +
                "limiteRetiro=" + limiteRetiro +
                "} " + super.toString();
    }
}
