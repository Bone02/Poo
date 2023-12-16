package Cap4.Ejercicio11;

public class Triangulo extends FiguraGeometrica{
    public double base, altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    @Override
    public double areaFigura() {
        return (base * altura) / 2;
    }

    @Override
    public double perimetroFigura() {
        return base + base + base;
    }

    public void imprimir(){
        System.out.println("Área del triángulo: " + areaFigura() + " Perímetro del triángulo: " + perimetroFigura());
    }
}
