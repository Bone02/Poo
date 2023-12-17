package Cap5.Ejercicio14;

import java.util.Vector;

public class SeriesCrud {
    String titulo;
    Vector series;

    boolean serieEncontrada;
    public SeriesCrud() {
        series = new Vector<>();
    }

    public void agregarSerie(Series nombre){
        series.add(nombre);
    }

    public void eliminarSeries(Series nombre){
        series.remove(nombre);

        while (series.remove(nombre)) {}

        System.out.println("Nueva lista: ");
        for (int k = 0; k < series.size(); k++) {
            Series series1 = (Series) series.elementAt(k);
            series1.imprimir();
        }
    }

    public void buscarSerieTitulo(String titulo){
        for (int k = 0; k<series.size(); k++){
            Series series1 = (Series) series.elementAt(k);
            if(titulo.equals(series1.getTitulo())){
                series1.imprimir();
                serieEncontrada = true;
                break;
            }
        }
        if (!serieEncontrada){
            System.out.println("Serie no encontrada");
        }
    }

    public void buscarSerieGenero(String genero){
        for (int k = 0; k<series.size(); k++){
            Series series1 = (Series) series.elementAt(k);
            if(genero.equals(series1.getGenero())){
                series1.imprimir();
                serieEncontrada = true;
            }
        }
        if (!serieEncontrada){
            System.out.println("Serie no encontrada");
        }
    }

    public void buscarSeriePais(String pais){
        for (int k = 0; k<series.size(); k++){
            Series series1 = (Series) series.elementAt(k);
            if(pais.equals(series1.getPais())){
                series1.imprimir();
                serieEncontrada = true;
            }
        }
        if (!serieEncontrada){
            System.out.println("Serie no encontrada");
        }
    }
}
