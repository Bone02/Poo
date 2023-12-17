package Cap5.Ejercicio11_12;

public class Delantero extends Jugador{
    int golesAnotados;

    public Delantero(String nombre, String apellidos, int edad, boolean esTitular, int golesAnotados) {
        super(nombre, apellidos, edad, esTitular);
        this.golesAnotados = golesAnotados;
    }

    @Override
    public String toString() {
        return "Delantero{" +
                "golesAnotados=" + golesAnotados +
                ", esTitular=" + esTitular +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}
