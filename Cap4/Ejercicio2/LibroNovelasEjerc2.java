package Cap4.Ejercicio2;

public class LibroNovelasEjerc2 extends LibroEjerc2 {

    public String tipoNovelas;

    public LibroNovelasEjerc2(String tituloLibro, String autorLibro, float precioLibro, String tipoNovelas) {
        super(tituloLibro, autorLibro, precioLibro);
        this.tipoNovelas = tipoNovelas;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo de novela: " + tipoNovelas);
    }


}
