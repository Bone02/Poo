package Cap5.Ejercicio7_8;

public class FrenosAbs {
    boolean tieneFrenosAbs, estaActivo;

    public FrenosAbs(boolean tieneFrenosAbs, boolean estaActivo) {
        this.tieneFrenosAbs = tieneFrenosAbs;
        this.estaActivo = estaActivo;
    }

    public void imprimir(){
        System.out.println("Tiene frenos abs: " + tieneFrenosAbs + " Está activo: " + estaActivo);
    }

    public boolean isEstaActivo() {
        return estaActivo;
    }

    public void setEstaActivo(boolean estaActivo) {
        this.estaActivo = estaActivo;
    }

    public boolean isTieneFrenosAbs() {
        return tieneFrenosAbs;
    }

    public void setTieneFrenosAbs(boolean tieneFrenosAbs) {
        this.tieneFrenosAbs = tieneFrenosAbs;
    }
}
