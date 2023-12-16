package Cap4.Ejercicio3;

public class InmuebleViviendaEjerc3 extends InmuebleEjerc3{
    public int numeroHabitacion, numeroBanios;

    public InmuebleViviendaEjerc3(int identificadorInmovbiliario, int areaMetrosCuadrados, String direccion, int numeroHabitacion, int numeroBanios) {
        super(identificadorInmovbiliario, areaMetrosCuadrados, direccion);
        this.numeroHabitacion = numeroHabitacion;
        this.numeroBanios = numeroBanios;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Número de habitaciones: " + numeroHabitacion + " Número de baños: " + numeroBanios);
    }


}
