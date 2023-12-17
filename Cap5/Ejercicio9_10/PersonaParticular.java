package Cap5.Ejercicio9_10;

public class PersonaParticular extends Cliente{

    String nombre; int cedula;
    public PersonaParticular(String nombre, String direccion, String telefono, int cedula) {
        super(direccion, telefono);
        this.nombre = nombre;
        this.cedula = cedula;
    }


}
