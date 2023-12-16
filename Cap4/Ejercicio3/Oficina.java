package Cap4.Ejercicio3;

import java.util.SortedMap;

public class Oficina extends Local{
    public boolean gobierno;
    public static double valorArea = 3500000;

    public Oficina(int identificadorInmovbiliario, int areaMetrosCuadrados, String direccion, tipo tipoLocal, boolean gobierno) {
        super(identificadorInmovbiliario, areaMetrosCuadrados, direccion, tipoLocal);
        this.gobierno = gobierno;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Es oficina del gobierno: " + gobierno);
    }
}
