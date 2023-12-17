package Cap5.Ejercicio7_8;

public class Asientos {
    String tipoMaterial;
    boolean tieneFunda;

    public Asientos(String tipoMaterial, boolean tieneFunda) {
        this.tipoMaterial = tipoMaterial;
        this.tieneFunda = tieneFunda;
    }

    public void imprimir(){
        System.out.println("Material del asiento: " + tipoMaterial + " Tiene funda: " + tieneFunda);
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public boolean isTieneFunda() {
        return tieneFunda;
    }

    public void setTieneFunda(boolean tieneFunda) {
        this.tieneFunda = tieneFunda;
    }
}
