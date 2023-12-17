package Cap5.Ejercicio5_6;

public class Revista extends Publicacion{
    public String periodicidad, pais;

    public Revista(String titulo, String autor, String editorial, int anioPublicacion, String periodicidad, String pais) {
        super(titulo, autor, editorial, anioPublicacion);
        this.periodicidad = periodicidad;
        this.pais = pais;
    }

    public void imprimir(){
        System.out.println("Título de la revista: " + titulo +
                " Autor de la revista: " + autor + " Editorial del libro: " + editorial
                + " Periodicidad: " + periodicidad + " Año de publicación: " + anioPublicacion + " País: " + pais);
    }

}
