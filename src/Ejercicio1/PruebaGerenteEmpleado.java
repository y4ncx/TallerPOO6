package Ejercicio1;

public class PruebaGerenteEmpleado {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Carlos", 2500000);

        System.out.println();
        System.out.println("Informacion del empleado = ");
        empleado.mostrarInformacion();

        System.out.println();
        System.out.println("Informacion del Gerente = ");
        Gerente gerente = new Gerente("Randy", 3000000, "Bolivar");
        gerente.mostrarInformacion();

    }
}
