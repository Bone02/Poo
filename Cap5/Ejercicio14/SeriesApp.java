package Cap5.Ejercicio14;

import java.util.Vector;

public class SeriesApp {
    public static void main(String[] args) {
        Vector series = new Vector();

        Series series1 = new Series("Sam y Cat", "Comedia", "EEUU", 2013);
        Series series2 = new Series("Victorious", "Comedia", "EEUU", 2010);
        Series series3 = new Series("iCarly", "Musical", "EEUU", 2007);
        Series series4 = new Series("Big Time Rush", "Musical", "EEUU", 2009);
        Series series5 = new Series("Drake y Josh", "Comedia", "EEUU", 2004);

        SeriesCrud seriesCrud = new SeriesCrud();
        seriesCrud.agregarSerie(series1);
        seriesCrud.agregarSerie(series2);
        seriesCrud.agregarSerie(series3);
        seriesCrud.agregarSerie(series4);
        seriesCrud.agregarSerie(series5);


        seriesCrud.agregarSerie(series1);
        System.out.println("Por título: ");
        seriesCrud.buscarSerieTitulo("Big Time Rush");
        System.out.println("Por género: ");
        seriesCrud.buscarSerieGenero("Comedia");
        System.out.println("Por país: ");
        seriesCrud.buscarSeriePais("EEUU");

        System.out.println("Eliminando una serie: " );
        seriesCrud.eliminarSeries(series1);
        seriesCrud.eliminarSeries(series4);


    }
}
