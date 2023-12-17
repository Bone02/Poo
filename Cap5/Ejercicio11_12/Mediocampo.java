package Cap5.Ejercicio11_12;

public class Mediocampo extends Jugador{
    int numeroAsistencias;

    public Mediocampo(String nombre, String apellidos, int edad, boolean esTitular, int numeroAsistencias) {
        super(nombre, apellidos, edad, esTitular);
        this.numeroAsistencias = numeroAsistencias;
    }

    @Override
    public String toString() {
        return "Mediocampo{" +
                "numeroAsistencias=" + numeroAsistencias +
                ", esTitular=" + esTitular +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}
