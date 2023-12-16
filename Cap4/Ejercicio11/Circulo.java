package Cap4.Ejercicio11;

public class Circulo extends FiguraGeometrica{

    public double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double areaFigura() {
        return Math.PI*(Math.pow(radio,2));
    }

    @Override
    public double perimetroFigura() {
        return 2*Math.PI*radio;
    }

    public void imprimir(){
        System.out.println("Área del círculo es: " + areaFigura() + " Perímetro del círculo es: " + perimetroFigura());
    }
}
