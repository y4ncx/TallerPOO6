package Ejercicio2.Vehiculos;

public class Vehiculo {
    protected String tipo;
    protected String marca;

    // Constructor
    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    // Métodos getters para acceder a las propiedades
    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }
}
