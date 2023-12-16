package Cap4.Ejercicio3;

public class InmuebleCasasEjerc3 extends InmuebleViviendaEjerc3{
    public int cantidadPisos;

    public InmuebleCasasEjerc3(int identificadorInmovbiliario, int areaMetrosCuadrados, String direccion, int numeroHabitacion, int numeroBanios, int cantidadPisos) {
        super(identificadorInmovbiliario, areaMetrosCuadrados, direccion, numeroHabitacion, numeroBanios);
        this.cantidadPisos = cantidadPisos;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Cantidad de pisos: " + cantidadPisos);
    }
}
