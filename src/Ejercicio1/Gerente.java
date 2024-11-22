package Ejercicio1;

public class Gerente extends Empleado {
    protected String departamento;

    // le metemos constructor

    public Gerente(String nombre, int salario, String departamento){
        super(nombre,salario);  // llamamos al constructor de la clase empleado
        this.departamento = departamento;

    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Departamento = " + departamento);
    }
}
