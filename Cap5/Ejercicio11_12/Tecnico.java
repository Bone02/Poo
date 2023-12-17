package Cap5.Ejercicio11_12;

public class Tecnico extends Persona {
    int aniosExperiencia;
    boolean esNacional;
    public Tecnico(String nombre, String apellidos, int edad, int aniosExperiencia, boolean esNacional) {
        super(nombre, apellidos, edad);
        this.aniosExperiencia = aniosExperiencia;
        this.esNacional = esNacional;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "aniosExperiencia=" + aniosExperiencia +
                ", esNacional=" + esNacional +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}
