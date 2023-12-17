package Cap5.Ejercicio11_12;

abstract public class Jugador extends Persona {

    boolean esTitular;

    public Jugador(String nombre, String apellidos, int edad, boolean esTitular) {
        super(nombre, apellidos, edad);
        this.esTitular = esTitular;
    }

    public boolean isEsTitular() {
        return esTitular;
    }

    public void setEsTitular(boolean esTitular) {
        this.esTitular = esTitular;
    }
}
