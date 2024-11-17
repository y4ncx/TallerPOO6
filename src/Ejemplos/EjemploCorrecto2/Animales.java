package Ejemplos.EjemploCorrecto2;

package animales;
public class Animal {
    protected String especie;
    public Animal(String especie) {
        this.especie = especie;
    }
    protected void emitirSonido() {
        System.out.println("El animal hace un sonido.");
    }
}
 package animales;
public class Perro extends Animal {
    public Perro(String especie) {
        super(especie);
    }
    @Override
    protected void emitirSonido() {
        System.out.println("El perro ladra.");
    }
}