package Cap4.Ejercicio3;

public class LocalComercial extends Local{
    public static double valorArea = 3000000;
    public String centroComencial;

    public LocalComercial(int identificadorInmovbiliario, int areaMetrosCuadrados, String direccion, tipo tipoLocal, String centroComencial) {
        super(identificadorInmovbiliario, areaMetrosCuadrados, direccion, tipoLocal);
        this.centroComencial = centroComencial;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Centro comercial: " + centroComencial);
    }
}
