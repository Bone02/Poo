package Cap4.Ejercicio2;

import Cap4.Ejercicio2.LibroTextoEjerc2;

public class LibroUnclEjerc2 extends LibroTextoEjerc2 {

    public String facPublicacion;

    public LibroUnclEjerc2(String tituloLibro, String autorLibro, float precioLibro, String cursoAsociado, String facPublicacion) {
        super(tituloLibro, autorLibro, precioLibro, cursoAsociado);
        this.facPublicacion = facPublicacion;
    }


    public void imprimir(){
        super.imprimir();
        System.out.println("Facultad que publicó el libro: " + facPublicacion);
    }

}
