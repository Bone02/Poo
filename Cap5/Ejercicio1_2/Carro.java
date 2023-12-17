package Cap5.Ejercicio1_2;

public class Carro extends Vehiculo {
    static int valorPeaje = 10000;

    public Carro(String placa) {
        super(placa);
    }

    public static int getValorPeaje() {
        return valorPeaje;
    }

    public static void setValorPeaje(int valorPeaje) {
        Carro.valorPeaje = valorPeaje;
    }

    public void imprimir(){
        System.out.println("Placa de carro: " + placa + " Valor de peaje: " + valorPeaje);
    }
}
