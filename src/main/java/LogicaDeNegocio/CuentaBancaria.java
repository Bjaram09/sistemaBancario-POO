/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaDeNegocio;

/**
 *
 * @author bryan
 */
public class CuentaBancaria {
    private String numeroCuenta;
    private boolean activa;
    private double saldo;
    private String tipo;

    public CuentaBancaria() {
        this.numeroCuenta = "";
        this.activa = false;
        this.saldo = 0.0;
        this.tipo = "";
    }

    public CuentaBancaria(String numeroCuenta, boolean activa, double saldo, String tipo) {
        this.numeroCuenta = numeroCuenta;
        this.activa = activa;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Metodo para realizar un retiro
    public void retiro(double retiro) {
        if (retiro <= 0) {
            System.out.println("El monto a retirar debe ser mayor que cero.");
        }
        if (retiro > saldo) {
            System.out.println("Saldo insuficiente. Saldo actual: " + saldo);
        }
        saldo -= retiro;
        System.out.println("Retiro exitoso. Saldo actual: " + saldo);
    }

    // Metodo para realizar un pago
    public void pago(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a pagar debe ser mayor a 0.");
        }
        if (monto > saldo) {
            System.out.println("Fondos insuficientes. Saldo actual: " + saldo);
        }
        saldo -= monto;
        System.out.println("Pago exitoso. Nuevo saldo: " + saldo);
    }


    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", activa=" + activa +
                ", saldo=" + saldo +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
