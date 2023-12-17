package Cap5.Ejercicio3_4;

public class Recta extends Punto {

    public double x2, y2;
    public Recta(double x, double y, double x2, double y2) {
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
    }

    public double calcularPendiente(){
        double m = (y2-y) / (x2-x);
        return m;
    }

    public double calcularLongitud(){
        double longitud = Math.sqrt(Math.pow(x2-x,2) + Math.pow(y2-y,2));
        return longitud;
    }

    public void imprimir(){
        System.out.println("La pendiente es: " + calcularPendiente() + " La longitud es: " + calcularLongitud());
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
}
