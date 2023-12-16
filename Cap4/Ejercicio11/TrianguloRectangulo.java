package Cap4.Ejercicio11;

public class TrianguloRectangulo extends Triangulo{

    public TrianguloRectangulo(double base, double altura) {
        super(base, altura);
    }

    public double areaTrianguloRec(){
        return (base * altura) / 2;
    }

    public double perimetroTrianguloRec(){
        return (base + altura + calcularHipotenusa());
    }

    double calcularHipotenusa(){
        return Math.pow(base*base + altura*altura, 0.5);
    }

    public void imprimir(){
        System.out.println("Área del Triángulo Rectángulo: " + areaTrianguloRec() + " Perímetro del Triángulo Rectángulo: " +
                perimetroTrianguloRec());
    }
}
