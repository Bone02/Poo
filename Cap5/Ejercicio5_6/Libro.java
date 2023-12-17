package Cap5.Ejercicio5_6;

public class Libro extends Publicacion {
    public String refBibliografica;

    public Libro(String titulo, String autor, String editorial, int anioPublicacion, String refBibliografica) {
        super(titulo, autor, editorial, anioPublicacion);
        this.refBibliografica = refBibliografica;
    }

    public String getTitulo() {
        return titulo;
    }

    public void imprimir(){
        System.out.println("Título del libro: " + titulo +
                " Autor del libro: " + autor + " Editorial del libro: " + editorial
        + " Referencia Bibliográfica: " + refBibliografica + " Año de publicación: " + anioPublicacion);
    }
}
