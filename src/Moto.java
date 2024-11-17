public class Moto extends Vehiculo {
    protected int cilindrada;

    //constructor
    public Moto(String marca, String modelo, int cilindrada){
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    //metodo para mostrar la informacion
    public void mostrarMoto(){
        super.mostrarVehiculo();
        System.out.println("Cilindrada = " + cilindrada);
    }




}
