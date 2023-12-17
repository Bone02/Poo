package Cap5.Ejercicio3_4;

import java.util.Vector;

public class Poligono{

    String nombrePoligono;
    Vector<Punto> puntos;
    public Poligono(String nombrePoligono, Vector puntos) {
        if (puntos.size() <3){
            System.out.println("Mínimo 3 puntos");
        }
        this.nombrePoligono = nombrePoligono;
        this.puntos = puntos;
    }


}
