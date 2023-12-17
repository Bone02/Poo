package Cap5.Ejercicio3_4;

import java.util.Vector;

public class PuntoApp {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2,3,5);
        circulo.imprimir();

        Recta recta = new Recta(-2, 1, 4, 5);
        recta.imprimir();


        Punto poligono = new Punto(2,3);
        Punto poligono1 = new Punto(3,4);
        Punto poligono2 = new Punto(4,5);

        Vector<Punto> poligonos = new Vector<>();
        poligonos.add(poligono1);
        poligonos.add(poligono);
        poligonos.add(poligono2);

        Punto poligon = new Punto(5,6);
        Punto poligon1 = new Punto(6,7);
        Punto poligon2 = new Punto(7,8);
        Punto poligon3 = new Punto(8,9);
        Punto poligon4 = new Punto(9,10);

        Vector<Punto> poligons = new Vector<>();
        poligons.add(poligon);
        poligons.add(poligon1);
        poligons.add(poligon2);
        poligons.add(poligon3);
        poligons.add(poligon4);

        System.out.println();

        Poligono triangle = new Poligono("Triángulo: ", poligonos);
        Poligono pentagono = new Poligono("Pentágono: ", poligons);
        System.out.println("Nombre poligono: " + triangle.nombrePoligono);
        System.out.println("Puntos del polígono");
        for (int k = 0; k<triangle.puntos.size(); k++){
            Punto puntos = triangle.puntos.get(k);
            System.out.println("Punto: " + (k + 1 ) + " x: " + puntos.x + " y: " + puntos.y);
        }
        System.out.println();
        System.out.println("Nombre polígono: " + pentagono.nombrePoligono);
        System.out.println("Puntos del polígono");
        for (int k = 0; k<pentagono.puntos.size(); k++){
            Punto puntos = pentagono.puntos.get(k);
            System.out.println("Punto: " + (k + 1 ) + " x: " + puntos.x + " y: " + puntos.y);
        }
    }
}
