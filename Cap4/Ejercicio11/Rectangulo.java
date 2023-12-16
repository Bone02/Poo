package Cap4.Ejercicio11;

public class Rectangulo extends FiguraGeometrica{


    public double base, altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double areaFigura() {
        return base * altura;
    }

    @Override
    public double perimetroFigura() {
        return (2*base) + (2*altura);
    }

    public void imprimir(){
        System.out.println("Área del rectángulo: " + areaFigura() + " Perímetro del rectángulo " + perimetroFigura());
    }
}
