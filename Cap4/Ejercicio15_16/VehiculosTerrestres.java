package Cap4.Ejercicio15_16;

public class VehiculosTerrestres extends Vehiculo implements Motor{

    public int cantLlantas;
    public String usoVehiculo;

    public VehiculosTerrestres(int velocidadActual, int velocidadMaxima, int cantLlantas, String usoVehiculo) {
        super(velocidadActual, velocidadMaxima);
        this.cantLlantas = cantLlantas;
        this.usoVehiculo = usoVehiculo;
    }

    @Override
    public int calcularRevoluciones(int fuerza, int radio) {
        return fuerza*radio;
    }

    @Override
    public void acelerar(int velocidad) {
        int acelerar = velocidadActual + velocidad;
        if (acelerar > velocidadMaxima){
            System.out.println("La velocidad actual no puede superar a la velocidad máxima");
        } else{
            velocidadActual = acelerar;
        }
    }

    @Override
    public void frenar(int velocidad) {
        int frenar = velocidadActual - velocidad;
        if (frenar < 0){
            System.out.println("La velocidad no puede ser negativa");
        } else{
            velocidadActual = frenar;
        }
    }

    public void imprimir(){
        super.imprimir();
        System.out.println(" Cantidad de llantas:" + cantLlantas + " Uso vehículo: " + usoVehiculo);

    }
}
