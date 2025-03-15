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

    public CuentaCredito() {
        super();
        limiteCredito = 0.0;
    }

    public CuentaCredito(String numeroCuenta, boolean activa, double saldo, String tipo, double limiteCredito) {
        super(numeroCuenta, activa, saldo, tipo);
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        if (limiteCredito < 0) {
            System.out.println("Error: El límite de crédito no puede ser negativo.");
        } else {
            this.limiteCredito = limiteCredito;
            System.out.println("Límite de crédito actualizado: " + this.limiteCredito);
        }
    }

    @Override
    public void retiro(double retiro) {
        // Verificar si el monto es válido
        if (retiro <= 0) {
            System.out.println("El monto a retirar debe ser mayor que cero.");
            return;
        }

        // Verificar si el saldo disponible + límite de crédito es suficiente para el retiro
        if (getSaldo() - retiro < limiteCredito) {
            System.out.println("Error: No puedes retirar más allá del límite de crédito. Saldo actual: " + getSaldo());
            return;
        }

        // Realizar el retiro
        setSaldo(getSaldo() - retiro);
        System.out.println("Retiro exitoso. Saldo actual: " + getSaldo());
    }

    @Override
    public void pago(double monto) {
        // Verificar si el monto es válido
        if (monto <= 0) {
            System.out.println("El monto a pagar debe ser mayor a 0.");
            return;
        }

        // Verificar que el saldo actualizado no exceda 0 (no puede ser positivo)
        if (getSaldo() + monto > 0) {
            System.out.println("Error: No puedes pagar más allá del límite permitido (saldo positivo). Saldo actual: " + getSaldo());
            return;
        }

        // Realizar el pago (sumar el monto porque el saldo es negativo)
        setSaldo(getSaldo() + monto);
        System.out.println("Pago exitoso. Nuevo saldo: " + getSaldo());
    }



    @Override
    public void setSaldo(double saldo) {
        if (saldo > 0) {
            System.out.println("Error: Las cuentas de crédito no pueden tener saldo positivo.");
        } else {
            super.setSaldo(saldo); // Llama al metodo de la clase padre
            System.out.println("Saldo actualizado: " + saldo);
        }
    }

    @Override
    public String toString() {
        return "CuentaCredito{" +
                "limiteCredito=" + limiteCredito +
                "} " + super.toString();
    }
}
