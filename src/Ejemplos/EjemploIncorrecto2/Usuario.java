package Ejemplos.EjemploIncorrecto2;

package seguridad;
public class Usuario {
    protected String contraseña; // No debería ser `protected`
    public Usuario(String contraseña) {
        this.contraseña = contraseña;
    }
}