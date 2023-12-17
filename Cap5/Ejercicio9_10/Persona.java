package Cap5.Ejercicio9_10;

public class Persona extends Cliente{
    String nombre;

    public Persona(String nombre, String direccion, String telefono) {
        super(direccion, telefono);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
