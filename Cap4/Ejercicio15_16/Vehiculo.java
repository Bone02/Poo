package Cap4.Ejercicio15_16;

public abstract class Vehiculo {
    int velocidadActual, velocidadMaxima;

    public Vehiculo(int velocidadActual, int velocidadMaxima) {
        this.velocidadActual = velocidadActual;
        this.velocidadMaxima = velocidadMaxima;
    }
    public void imprimir(){
        System.out.println("Velocidad actual: " + velocidadActual + " Velocidad máxima: " + velocidadMaxima);
    }

    public abstract void acelerar(int velocidad);
    public abstract void frenar(int velocidad);
}
