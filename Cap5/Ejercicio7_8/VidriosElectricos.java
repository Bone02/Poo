package Cap5.Ejercicio7_8;

public class VidriosElectricos {
    boolean tieneVidriosElectricos, vidriosEstanBajados;

    public VidriosElectricos(boolean tieneVidriosElectricos, boolean vidriosEstanBajados) {
        this.tieneVidriosElectricos = tieneVidriosElectricos;
        this.vidriosEstanBajados = vidriosEstanBajados;
    }

    public void imprimir(){
        System.out.println("Tiene vídrios eléctricos: " + tieneVidriosElectricos + " Los vídrios están bajados: " + vidriosEstanBajados);
    }

    public boolean isTieneVidriosElectricos() {
        return tieneVidriosElectricos;
    }

    public void setTieneVidriosElectricos(boolean tieneVidriosElectricos) {
        this.tieneVidriosElectricos = tieneVidriosElectricos;
    }

    public boolean isVidriosEstanBajados() {
        return vidriosEstanBajados;
    }

    public void setVidriosEstanBajados(boolean vidriosEstanBajados) {
        this.vidriosEstanBajados = vidriosEstanBajados;
    }
}
