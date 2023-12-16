package Cap4.Ejercicio3;

public class InmuebleApartamentoFamiliarEjerc3 extends InmuebleApartamentoEjerc3{
    protected static double valorArea = 2000000;
    public int valorAdm;

    public InmuebleApartamentoFamiliarEjerc3(int identificadorInmovbiliario, int areaMetrosCuadrados, String direccion, int numeroHabitacion, int numeroBanios, int valorAdm) {
        super(identificadorInmovbiliario, areaMetrosCuadrados, direccion, numeroHabitacion, numeroBanios);
        this.valorAdm = valorAdm;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Valor de administración: " + valorAdm);
    }
}
