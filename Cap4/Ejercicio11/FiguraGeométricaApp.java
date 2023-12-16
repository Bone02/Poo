package Cap4.Ejercicio11;

public class FiguraGeométricaApp {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3);
        circulo.imprimir();

        Rectangulo rectangulo = new Rectangulo(4, 2);
        rectangulo.imprimir();

        Triangulo triangulo = new Triangulo(3,4);
        triangulo.imprimir();

        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo(7, 9.5);
        trianguloRectangulo.imprimir();

    }
}
