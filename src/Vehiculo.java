public class Vehiculo {
    protected String marca;
    protected  String modelo;

    //contructor
    public Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    //metodo para mostrar la informacion
    public void mostrarVehiculo(){
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
    }
}
