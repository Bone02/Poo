package Cap4.Ejercicio3;

public class InmuebleCasaRuralEjerc3 extends InmuebleCasasEjerc3{
    public static double valorArea = 1500000;
    public int distanciaCabecera, altitud;


    public InmuebleCasaRuralEjerc3(int identificadorInmovbiliario, int areaMetrosCuadrados, String direccion, int numeroHabitacion, int numeroBanios,
                                   int cantidadPisos, int distanciaCabecera, int altitud) {
        super(identificadorInmovbiliario, areaMetrosCuadrados, direccion, numeroHabitacion, numeroBanios, cantidadPisos);
        this.distanciaCabecera = distanciaCabecera;
        this.altitud = altitud;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Distancia cabecera: " + numeroHabitacion + " km " + " Altitud: " + altitud);
    }
}
