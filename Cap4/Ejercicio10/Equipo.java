package Cap4.Ejercicio10;

import java.util.Scanner;
import java.util.Vector;

public class Equipo {
    private String nombreEquipo, paisEquipo;
    private static double tiempoTotal;
    Vector listaCiclistas;

    public Equipo(String nombreEquipo, String paisEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.paisEquipo = paisEquipo;
        tiempoTotal = 0;
        listaCiclistas = new Vector();
    }

    public void anadirCiclista(Ciclista ciclista){
        listaCiclistas.add(ciclista);
    }

    public void listarEquipo(){
        for (int k =0 ; k<listaCiclistas.size(); k++){
            Ciclista c = (Ciclista) listaCiclistas.elementAt(k);
            System.out.println(c.getNombre());
        }
    }

    public void buscarCiclista(){
        Scanner scanner = new Scanner(System.in);
        String nombreCiclista = scanner.nextLine();
        for (int k = 0; k < listaCiclistas.size(); k++){
            Ciclista c = (Ciclista) listaCiclistas.elementAt(k);
            if (c.getNombre().equals(nombreCiclista)){
                System.out.println(c.getNombre());
            }
        }
    }

    public void calcularTiempo(){
        for (int k = 0; k<listaCiclistas.size(); k++){
            Ciclista c = (Ciclista) listaCiclistas.elementAt(k);
            tiempoTotal += c.getTiempoAcumulado();
        }
    }

    public void imprimir(){
        System.out.println("Nombre del equipo: " + nombreEquipo + " País del equipo: " + paisEquipo + " Tiempo total del equipo: " + tiempoTotal);
    }
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getPaisEquipo() {
        return paisEquipo;
    }

    public void setPaisEquipo(String paisEquipo) {
        this.paisEquipo = paisEquipo;
    }
}
