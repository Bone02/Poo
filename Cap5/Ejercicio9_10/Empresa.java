package Cap5.Ejercicio9_10;

public class Empresa extends Cliente{

    String NombrerazonSocial, nit;
    public Empresa(String NombrerazonSocial, String telefono, String direccion, String nit) {
        super(telefono, direccion);
        this.NombrerazonSocial = NombrerazonSocial;
        this.nit = nit;
    }

    public String getNombrerazonSocial() {
        return NombrerazonSocial;
    }

    public void setNombrerazonSocial(String nombrerazonSocial) {
        NombrerazonSocial = nombrerazonSocial;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
