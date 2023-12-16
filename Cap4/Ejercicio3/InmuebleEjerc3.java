package Cap4.Ejercicio3;

public class InmuebleEjerc3 {
    public int identificadorInmovbiliario, areaMetrosCuadrados;
    public String direccion;
    public double precioVenta;

    public InmuebleEjerc3(int identificadorInmovbiliario, int areaMetrosCuadrados, String direccion) {
        this.identificadorInmovbiliario = identificadorInmovbiliario;
        this.areaMetrosCuadrados = areaMetrosCuadrados;
        this.direccion = direccion;
    }

    double calcularPrecioVenta(double valorArea){
        precioVenta = areaMetrosCuadrados * valorArea;
        return precioVenta;
    }

    public void imprimir(){
        System.out.println("Identificador Inmobiliario: " + identificadorInmovbiliario + " Área en metros cuadrados: " +
                areaMetrosCuadrados + " Dirección: " + direccion + " Precio Venta: " + precioVenta);
    }


}
