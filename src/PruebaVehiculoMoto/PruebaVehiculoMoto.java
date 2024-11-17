package PruebaVehiculoMoto;

public class PruebaVehiculoMoto {
    public static void main(String[] args) {

        // se crea un objeto moto
     Moto moto1 = new Moto("Yamaha", "R7", 689);

        System.out.println("información de la Moto = ");
        System.out.println();
        moto1.mostrarMoto();

        System.out.println();

        Vehiculo vehiculo = new Vehiculo("Hyundai", "Genesis");

        System.out.println(vehiculo.marca);
        System.out.println(vehiculo.modelo);

    }
}
