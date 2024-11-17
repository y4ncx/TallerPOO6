package Ejemplos.EjemploIncorrecto1;

 package paquete1;
public class Persona {
    protected String nombre;
    public Persona(String nombre) {
        this.nombre = nombre;
    }
}
// Paquete: paquete2
 package paquete2;

 import paquete1.Persona;


public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Juan");
        System.out.println(p.nombre); // Error de compilación: nombre tiene acceso protegido
    }
}