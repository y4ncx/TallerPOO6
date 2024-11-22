
package Ejercicio2.Vehiculos;

public class Moto extends Vehiculo {
    protected int cilindrada;

    //constructor
    public Moto(String tipo, String marca, int cilindrada){
       super(tipo,marca );
        this.cilindrada = cilindrada;
    }

    public int getCilindrada(){
        return cilindrada;
    }



}
