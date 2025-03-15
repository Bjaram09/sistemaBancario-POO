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
    private double interes;

    public CuentaDebito() {
        super();
        this.limiteRetiro = 0.0;
    }

    public CuentaDebito(String numeroCuenta, boolean activa, double saldo, String tipo, double limiteRetiro, double interes) {
        super(numeroCuenta, activa, saldo, tipo);
        this.limiteRetiro = limiteRetiro;
        this.interes = 0.0;
    }

    public double getLimiteRetiro() {
        return limiteRetiro;
    }

    public void setLimiteRetiro(double limiteRetiro) {
        this.limiteRetiro = limiteRetiro;
    }

    public void generarInteres(double porcentaje) {
        // Validar que el porcentaje sea mayor a 0
        if (porcentaje <= 0) {
            System.out.println("El porcentaje de interés debe ser mayor que 0.");
        }
        // Calcular el interés generado
        double interesGenerado = getSaldo() * (porcentaje / 100);
        // Sumar el interés al saldo
        setSaldo(getSaldo() + interesGenerado);
        System.out.println("Interés generado: " + interesGenerado + ". Nuevo saldo: " + getSaldo());
    }

    @Override
    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("Error: Las cuentas de débito no pueden tener saldo negativo.");
        } else {
            super.setSaldo(saldo);
            System.out.println("Saldo actualizado: " + saldo);
        }
    }

    @Override
    public String toString() {
        return "CuentaDebito{" +
                "limiteRetiro=" + limiteRetiro +
                "} " + super.toString();
    }
}
