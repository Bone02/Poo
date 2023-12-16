package Cap4.Ejercicio15_16;

public class VehiculosAcuaticos extends Vehiculo implements Motor, Vela{


    public VehiculosAcuaticos(int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
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

    @Override
    public void recomendarVelocidad(int velocidadViento) {
        if (velocidadViento > 80 || velocidadViento < 10){
            velocidadActual = 0;
        }
    }


}
