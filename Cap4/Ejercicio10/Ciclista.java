package Cap4.Ejercicio10;

public abstract class Ciclista {
    private int identificador, tiempoAcumulado, posicionGeneral;

    public int getPosicionGeneral() {
        return posicionGeneral;
    }

    public void setPosicionGeneral(int posicionGeneral) {
        this.posicionGeneral = posicionGeneral;
    }

    private String nombre;

    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }
    abstract String imprimirTipo();

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void imprimir(){
        System.out.println("Identificador " + identificador + " Nombre: " + nombre + " Tiempo acumulado: " + tiempoAcumulado);
    }
}
