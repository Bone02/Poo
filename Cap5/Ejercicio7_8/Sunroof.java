package Cap5.Ejercicio7_8;

import java.io.FilterOutputStream;

public class Sunroof {
    boolean tieneSunroof, estaAbierto;

    public Sunroof(boolean tieneSunroof, boolean estaAbierto) {
        this.tieneSunroof = tieneSunroof;
        this.estaAbierto = estaAbierto;
    }

    public void imprimir(){
        System.out.println("Tiene sunroof: " + tieneSunroof + " Está abierto: " + estaAbierto);
    }

    public boolean isTieneSunroof() {
        return tieneSunroof;
    }

    public void setTieneSunroof(boolean tieneSunroof) {
        this.tieneSunroof = tieneSunroof;
    }

    public boolean isEstaAbierto() {
        return estaAbierto;
    }

    public void setEstaAbierto(boolean estaAbierto) {
        this.estaAbierto = estaAbierto;
    }
}
