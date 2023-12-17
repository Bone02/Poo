package Cap5.Ejercicio7_8;

public class Airbags {
    int tiempoInflarse, cantidadAirbags;
    boolean estaActivo;

    public Airbags(int tiempoInflarse, int cantidadAirbags, boolean estaActivo) {
        this.tiempoInflarse = tiempoInflarse;
        this.cantidadAirbags = cantidadAirbags;
        this.estaActivo = estaActivo;
    }

    public void impirmir(){
        System.out.println("Tiempo en inflarse en milisegundos: " + tiempoInflarse + " Cantidad de airbags: " + cantidadAirbags + " Están activos: " + estaActivo);
    }

    public int getTiempoInflarse() {
        return tiempoInflarse;
    }

    public void setTiempoInflarse(int tiempoInflarse) {
        this.tiempoInflarse = tiempoInflarse;
    }

    public boolean isEstaActivo() {
        return estaActivo;
    }

    public void setEstaActivo(boolean estaActivo) {
        this.estaActivo = estaActivo;
    }
}
