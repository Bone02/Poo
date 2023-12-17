package Cap5.Ejercicio11_12;

import java.util.Arrays;
import java.util.Comparator;

public class AppFutbol {
    public static void main(String[] args) {
        Tecnico tecnico = new Tecnico("Félix", "Sánchez", 48, 29, false);
        Portero portero = new Portero("Gilmer", "Napa", 20, true, 0);
        Defensa[] defensa = new Defensa[4];
        Mediocampo[] mediocampos = new Mediocampo[4];
        Delantero[] delanteros = new Delantero[2];
        defensa[0] = new Defensa("Pervis", "Estupiñán", 25, true);
        defensa[1] = new Defensa("Byron" , "Castillo", 25, true);
        defensa[2] = new Defensa("Joel", "Ordoñez", 19, false);
        defensa[3] = new Defensa("Robert", "Arboleda", 32, true);
        mediocampos[0] = new Mediocampo("Gonzalo", "Plata", 23, true, 10);
        mediocampos[1] = new Mediocampo("Moisés", "Caicedo", 20, true, 15);
        mediocampos[2] = new Mediocampo("Pedro", "Vibe", 21, true, 3);
        mediocampos[3] = new Mediocampo("Jeremy", "Sarmiento", 21, true, 14);
        delanteros[0] = new Delantero("Michael", "Estrada", 27, true, 0);
        delanteros[1] = new Delantero("Ayrton", "Preciado", 29, true, 3);

        EquipoFutbol equipoFutbol0 = new EquipoFutbol("Selección de Ecuador", "Ecuador", tecnico,portero,defensa,mediocampos,delanteros);
        equipoFutbol0.imprimir();

        EquipoFutbol[] equipos = new EquipoFutbol[10];

        System.out.println();

        equipos[0] = crearEquipo("Ecuador", "Ecuador");
        equipos[1] = crearEquipo("Colombia", "Colombia");
        equipos[2] = crearEquipo("Perú", "Perú");
        equipos[3] = crearEquipo("Venezuela", "Venezuela");
        equipos[4] = crearEquipo("Argentina", "Argentina");
        equipos[5] = crearEquipo("Paraguay", "Paraguay");
        equipos[6] = crearEquipo("Chile", "Chile");
        equipos[7] = crearEquipo("Uruguay", "Uruguay");
        equipos[8] = crearEquipo("Bolivia", "Bolivia");
        equipos[9] = crearEquipo("México", "México");


        simularPartido(equipos[0], equipos[1], 3,2);
        simularPartido(equipos[2], equipos[3], 5,1);
        simularPartido(equipos[4], equipos[5], 0,0);
        simularPartido(equipos[6], equipos[7], 2,2);
        simularPartido(equipos[8], equipos[9], 2,1);

        tablaPosiciones(equipos);

    }
    static EquipoFutbol crearEquipo (String nombre, String pais){
        return new EquipoFutbol(nombre,pais);
    }
    static void simularPartido(EquipoFutbol equipo1, EquipoFutbol equipo2, int golesEquipo1, int golesEquipo2){
        equipo1.registrarPartido(golesEquipo1, golesEquipo2);
        equipo2.registrarPartido(golesEquipo2, golesEquipo1);
    }
    static void tablaPosiciones(EquipoFutbol[] equipoFutbols){
        Arrays.sort(equipoFutbols, Comparator.comparingInt(EquipoFutbol::getPuntos).reversed());
        System.out.println("Tabla de posiciones");
        System.out.printf("%-20s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%n", "Equipo", "Puntos", "PG", "PE", "PP", "GF", "GC", "Dif. Goles");

        for (EquipoFutbol equipoFutbol : equipoFutbols){
            System.out.printf("%-20s%-10d%-10d%-10d%-10d%-10d%-10d%-10d%n", equipoFutbol.getNombre(), equipoFutbol.getPuntos(),
                    equipoFutbol.getPartidosGanados(), equipoFutbol.getPartidosEmpatados(), equipoFutbol.getPartidosPerdidos(),
                    equipoFutbol.getGolesAnotados(), equipoFutbol.getGolesRecibidos(), equipoFutbol.getDiferenciaGoles());
            equipoFutbol.resultadosFinales();
        }
    }
}
