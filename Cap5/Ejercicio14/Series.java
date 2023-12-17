package Cap5.Ejercicio14;

import java.util.Vector;

public class Series {
     String titulo, genero, pais;
     int anioPublicacion;


    public Series(String titulo, String genero, String pais, int anioPublicacion) {
        this.titulo = titulo;
        this.genero = genero;
        this.pais = pais;
        this.anioPublicacion = anioPublicacion;
    }


    public void imprimir(){
        System.out.println("Título de serie: " + titulo + " Género de serie: " + genero + " País de serie: " + pais + " Año de publicación: " + anioPublicacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
