package Cap5.Ejercicio15;

public class Parrafo extends Evaluacion {
    int cantidadLineas, cantidadPalabras;

    public Parrafo(int cantidadLineas, int cantidadPalabras) {
        this.cantidadLineas = cantidadLineas;
        this.cantidadPalabras = cantidadPalabras;
    }

    public int getCantidadLineas() {
        return cantidadLineas;
    }

    public void setCantidadLineas(int cantidadLineas) {
        this.cantidadLineas = cantidadLineas;
    }

    public int getCantidadPalabras() {
        return cantidadPalabras;
    }

    public void setCantidadPalabras(int cantidadPalabras) {
        this.cantidadPalabras = cantidadPalabras;
    }

    @Override
    public String toString() {
        return "Parrafo{" +
                "cantidadLineas=" + cantidadLineas +
                ", cantidadPalabras=" + cantidadPalabras +
                '}';
    }
}
