package Cap5.Ejercicio3_4;

public class Circulo {

    Punto centro;
    double radio;

    public Circulo(double x, double y, double radio){
        centro = new Punto(x,y);
        this.radio=radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void imprimir(){
        System.out.println("El centro del círculo es la coordenada: " + centro.getX() + " " +  centro.getY() +
                " y el radio es: " + radio);
    }
}
