package Cap4.Ejercicio10;

public class CiclistaApp {
    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Annvv", "Belgium");
        Velocista velocista1 = new Velocista(1293912, "Elizabeth Gillies", 320, 25);
        Escalador escalador1 = new Escalador(12992, "Ariana Grande", 25, 10);
        Contrarelojista contrarelojista = new Contrarelojista(12821, "Josh Peck", 120);
        equipo1.anadirCiclista(velocista1);
        equipo1.anadirCiclista(escalador1);
        equipo1.anadirCiclista(contrarelojista);
        velocista1.setTiempoAcumulado(365);
        escalador1.setTiempoAcumulado(385);
        contrarelojista.setTiempoAcumulado(370);
        equipo1.calcularTiempo();
        equipo1.imprimir();
        equipo1.listarEquipo();
    }
}
