package Ejercicio2.PruebaVehiculoMoto;

import Ejercicio2.Vehiculos.Moto;
import Ejercicio2.Vehiculos.Vehiculo;

public class PruebaVehiculoMoto {
    public static void main(String[] args) {


        // se crea un objeto moto


        Moto moto1 = new Moto("Deportiva", "Yamaha", 689);

        // se crea un objeto Vehiculo

        Vehiculo vehiculo = new Vehiculo("Carro", "Hyundai");

        //forma correcta de acceder
        System.out.println("Tipo = " + moto1.getTipo());
        System.out.println("Marca = " + moto1.getMarca());
        System.out.println("Cilindrada = " + moto1.getCilindrada());

        //forma incorrecta de acceder
        System.out.println("Marca del vehiculo = " + vehiculo.getMarca());
        System.out.println("Tipo de vehiculo = " + vehiculo.getTipo());

    }
}



