package Ejercicio3;

public class Banco {
    protected double saldo;

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double obtenerSaldo() {
        return saldo;
    }
}
