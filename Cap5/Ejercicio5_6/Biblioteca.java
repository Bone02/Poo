package Cap5.Ejercicio5_6;

import java.util.Vector;

public class Biblioteca {
    String nombre;
    Vector coleccionLibros;
    Vector coleccionRevistas;


    public Biblioteca(String nombre) {
        this.nombre = nombre;
        coleccionLibros = new Vector<>();
        coleccionRevistas = new Vector<>();
    }

    public void agregarLibros(Libro libro){
        coleccionLibros.add(libro);
    }

    public void listarLibros(){
        for (int k = 0; k<coleccionLibros.size(); k++){
            Libro libro = (Libro) coleccionLibros.elementAt(k);
            libro.imprimir();
        }
    }

    public void agregarRevistas(Revista revista){
        coleccionRevistas.add(revista);
    }

    public void listarRevistas(){
        for(int k =0; k<coleccionRevistas.size(); k++){
            Revista revista = (Revista) coleccionRevistas.elementAt(k);
            revista.imprimir();
        }
    }
}
