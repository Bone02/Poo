package Cap4.Ejercicio11;

public class Cuadrado extends FiguraGeometrica{
    public double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double areaFigura() {
        return lado*lado;
    }

    @Override
    public double perimetroFigura() {
        return (4*lado);
    }
}
