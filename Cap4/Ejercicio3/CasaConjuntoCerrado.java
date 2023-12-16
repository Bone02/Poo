package Cap4.Ejercicio3;

public class CasaConjuntoCerrado extends InmuebleCasaUrbanaEjerc3{
    public static double valorArea = 2500000;
    public int valorAdm;
    public boolean tienePiscina, tieneCamposDeportivos;

    public CasaConjuntoCerrado(int identificadorInmovbiliario, int areaMetrosCuadrados, String direccion, int numeroHabitacion, int numeroBanios, int cantidadPisos,
    int valorAdm, boolean tienePiscina, boolean tieneCamposDeportivos) {
        super(identificadorInmovbiliario, areaMetrosCuadrados, direccion, numeroHabitacion, numeroBanios, cantidadPisos);
        this.valorAdm = valorAdm;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Valor de la administración: " + valorAdm+
                " ¿Tiene piscina? " + tienePiscina + " ¿Tiene campos deportivos?" + tieneCamposDeportivos);
    }
}
