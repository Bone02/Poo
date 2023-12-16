package Cap4.Ejercicio2;

import Cap4.Ejercicio2.LibroEjerc2;

public class LibroTextoEjerc2 extends LibroEjerc2 {
    public String cursoAsociado;

    public LibroTextoEjerc2(String tituloLibro, String autorLibro, float precioLibro, String cursoAsociado) {
        super(tituloLibro, autorLibro, precioLibro);
        this.cursoAsociado = cursoAsociado;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Curso asociado: " + cursoAsociado);
    }
}
