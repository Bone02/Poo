package Cap5.Ejercicio11_12;

public class Defensa extends Jugador{

    public Defensa(String nombre, String apellidos, int edad, boolean esTitular) {
        super(nombre, apellidos, edad, esTitular);
    }

    @Override
    public String toString() {
        return "Defensa{" +
                "esTitular=" + esTitular +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}
