package Cap4.Ejercicio2;

public class LibroEjerc2 {
    public String tituloLibro;
    public String autorLibro;
    public float precioLibro;

    public LibroEjerc2(String tituloLibro, String autorLibro, float precioLibro) {
        this.tituloLibro = tituloLibro;
        this.autorLibro = autorLibro;
        this.precioLibro = precioLibro;
    }

    public void imprimir(){
        System.out.println("Título del libro: " + tituloLibro + " Autor(es): " + autorLibro + " Precio del Libro: " + precioLibro);
    }
    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    public float getPrecioLibro() {
        return precioLibro;
    }

    public void setPrecioLibro(float precioLibro) {
        this.precioLibro = precioLibro;
    }
}
