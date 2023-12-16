package Cap4.Ejercicio3;

public class CasaIndependiente extends InmuebleCasaUrbanaEjerc3{
    public static double valorArea = 3000000;

    public CasaIndependiente(int identificadorInmovbiliario, int areaMetrosCuadrados, String direccion, int numeroHabitacion, int numeroBanios, int cantidadPisos) {
        super(identificadorInmovbiliario, areaMetrosCuadrados, direccion, numeroHabitacion, numeroBanios, cantidadPisos);
    }

    public void imprimir(){
        super.imprimir();
    }
}
