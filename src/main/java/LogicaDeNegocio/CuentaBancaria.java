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
    private String divisa;

    public CuentaBancaria() {
        this.numeroCuenta = "";
        this.activa = false;
        this.saldo = 0.0;
        this.tipo = "";
        this.divisa = "";
    }

    public CuentaBancaria(String numeroCuenta, boolean activa, double saldo, String tipo, String divisa) {
        this.numeroCuenta = numeroCuenta;
        this.activa = activa;
        this.saldo = saldo;
        this.tipo = tipo;
        this.divisa = divisa;
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

    public String getDivisa() {
        return divisa;
    }

    public void setDivisa(String divisa) {
        this.divisa = divisa;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", activa=" + activa +
                ", saldo=" + saldo +
                ", tipo='" + tipo + '\'' +
                ", divisa='" + divisa + '\'' +
                '}';
    }
}
