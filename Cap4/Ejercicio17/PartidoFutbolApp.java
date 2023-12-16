package Cap4.Ejercicio17;

public class PartidoFutbolApp {
    public static void main(String[] args) {
        PartidoFutbolLigaEspanola partidoFutbolLigaEspanola = new PartidoFutbolLigaEspanola();
        System.out.println("Duración del partido: " + PartidoFutbol.duracionPartidoFutbol);
        partidoFutbolLigaEspanola.setEquipoLocal("Ecuador");
        partidoFutbolLigaEspanola.setEquipoVisitante("Bélgica");
        partidoFutbolLigaEspanola.setGolesEquipoLocal(0);
        partidoFutbolLigaEspanola.setGolesEquipoVisitante(1);
        partidoFutbolLigaEspanola.imprimir();
        System.out.println();
        PartidoBaloncestoLigaColombiana partidoBaloncestoLigaColombiana = new PartidoBaloncestoLigaColombiana();
        System.out.println("Duración del partido: " + PartidoBaloncesto.duracionPartidoBaloncesto);
        partidoBaloncestoLigaColombiana.setEquipoLocal("Lakers");
        partidoBaloncestoLigaColombiana.setEquipoVisitante("Bulldogs");
        partidoBaloncestoLigaColombiana.setCestasEquipoLocal(30);
        partidoBaloncestoLigaColombiana.setCestasEquipoVisitante(20);
        partidoBaloncestoLigaColombiana.imprimir();
    }
}
