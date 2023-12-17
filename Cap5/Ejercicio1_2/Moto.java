package Cap5.Ejercicio1_2;

public class Moto extends Vehiculo {
    static int valorPeaje = 5000;

    public Moto(String placa) {
        super(placa);
    }

    public static int getValorPeaje() {
        return valorPeaje;
    }

    public static void setValorPeaje(int valorPeaje) {
        Moto.valorPeaje = valorPeaje;
    }

    public void imprimir(){
        System.out.println("Placa de moto: " + placa + " Valor de peaje: " + valorPeaje);
    }
}
