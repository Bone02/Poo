package Cap4.Ejercicio10;

public class Contrarelojista extends Ciclista{

    private double velMaxima;

    public Contrarelojista(int identificador, String nombre, double velMaxima) {
        super(identificador, nombre);
        this.velMaxima = velMaxima;
    }

    public double getVelMaxima() {
        return velMaxima;
    }

    public void setVelMaxima(double velMaxima) {
        this.velMaxima = velMaxima;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Velocidad máxima: " + velMaxima);
    }
    @Override
    String imprimirTipo() {
        return "Es un relojista";
    }
}
