package Cap5.Ejercicio7_8;

public class EspejosElectricos {
    boolean tieneEspejosElectricos;

    public EspejosElectricos(boolean tieneEspejosElectricos) {
        this.tieneEspejosElectricos = tieneEspejosElectricos;
    }
    public void imprimir(){
        System.out.println("Tiene espejos eléctricos: " + tieneEspejosElectricos);
    }

    public boolean isTieneEspejosElectricos() {
        return tieneEspejosElectricos;
    }

    public void setTieneEspejosElectricos(boolean tieneEspejosElectricos) {
        this.tieneEspejosElectricos = tieneEspejosElectricos;
    }
}
