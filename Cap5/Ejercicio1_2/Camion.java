package Cap5.Ejercicio1_2;

public class Camion extends Vehiculo {
    static int valorPeaje = 5000;
    int numeroEjes;

    public Camion(String placa, int numeroEjes) {
        super(placa);
        this.numeroEjes = numeroEjes;
    }

    public static int getValorPeaje() {
        return valorPeaje;
    }

    public static void setValorPeaje(int valorPeaje) {
        Camion.valorPeaje = valorPeaje;
    }

    public void imprimir(){
        System.out.println("Placa de camión: " + placa + " Valor de peaje: " + valorPeaje + " Número de ejes: " + numeroEjes);
    }

}
