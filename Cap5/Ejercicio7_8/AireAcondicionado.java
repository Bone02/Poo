package Cap5.Ejercicio7_8;

public class AireAcondicionado {
    boolean estaEncendido;

    public AireAcondicionado(boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
    }

    public void imprimir(){
        System.out.println("Aire acondicionado encendido: " + estaEncendido);
    }

    public boolean isEstaEncendido() {
        return estaEncendido;
    }

    public void setEstaEncendido(boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
    }
}
