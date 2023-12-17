package Cap5.Ejercicio11_12;

public class Portero extends Jugador{

    int golesRecibidos;

    public Portero(String nombre, String apellidos, int edad, boolean esTitular, int golesRecibidos) {
        super(nombre, apellidos, edad, esTitular);
        this.golesRecibidos = golesRecibidos;
    }


    @Override
    public String toString() {
        return "Portero{" +
                "golesRecibidos=" + golesRecibidos +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }
}
