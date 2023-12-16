package Cap4.Ejercicio3;

public class Local extends InmuebleEjerc3{
    public Local(int identificadorInmovbiliario, int areaMetrosCuadrados, String direccion, tipo tipoLocal) {
        super(identificadorInmovbiliario, areaMetrosCuadrados, direccion);
        this.tipoLocal = tipoLocal;
    }

    enum tipo {INTERNO, CALLE};
    public tipo tipoLocal;

    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo de local: " + tipoLocal);
    }
}
