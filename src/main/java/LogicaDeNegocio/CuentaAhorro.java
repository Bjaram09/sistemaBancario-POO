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
    private String periodo;
    private double interes;

    public CuentaAhorro() {
        super();
        this.periodo = "";
        this.interes = 0.0;
    }

    public CuentaAhorro(String numeroCuenta, boolean activa, double saldo, String tipo, String divisa, String periodo) {
        super(numeroCuenta, activa, saldo, tipo);
        this.interes = 0.0;
        this.periodo = periodo;
        if (saldo < 100) {
            throw new IllegalArgumentException("Error: El saldo inicial no puede ser menor a 100 dólares.");
        }
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

    // Metodo para generar intereses
    public void generarInteres(double porcentaje) {
        // Validar que el porcentaje sea mayor a 0
        if (porcentaje <= 0) {
            System.out.println("El porcentaje de interés debe ser mayor que 0.");
        } else {
            // Calcular el interés generado
            double interesGenerado = getSaldo() * (porcentaje / 100);
            // Sumar el interés al saldo
            setSaldo(getSaldo() + interesGenerado);
            System.out.println("Interés generado: " + interesGenerado + ". Nuevo saldo: " + getSaldo());
        }
    }

    @Override
    public void setSaldo(double saldo) {
        if (saldo < 100) {
            System.out.println("Error: Las cuentas de ahorro deben tener al menos 100 dólares.");
        } else {
            super.setSaldo(saldo);
            System.out.println("Saldo actualizado: " + saldo);
        }
    }


    @Override
    public String toString() {
        return "CuentaAhorro{" +
                "interes=" + interes +
                ", periodo='" + periodo + '\'' +
                "} " + super.toString();
    }
}
