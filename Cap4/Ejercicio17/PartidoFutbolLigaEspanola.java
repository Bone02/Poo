package Cap4.Ejercicio17;

public class PartidoFutbolLigaEspanola implements PartidoFutbol{
    public String equipoLocal, equipoVisitante;
    public int golesEquipoVisitante, golesEquipoLocal;

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public int getGolesEquipoVisitante() {
        return golesEquipoVisitante;
    }

    public int getGolesEquipoLocal() {
        return golesEquipoLocal;
    }

    @Override
    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    @Override
    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    @Override
    public void setGolesEquipoVisitante(int golesEquipoVisitante) {
        this.golesEquipoVisitante = golesEquipoVisitante;
    }

    @Override
    public void setGolesEquipoLocal(int golesEquipoLocal) {
        this.golesEquipoLocal = golesEquipoLocal;
    }

    public void imprimir(){
        System.out.println("Equipo local: " + equipoLocal + " vs Equipo Visitante: " + equipoVisitante + " Marcador Final: " + golesEquipoLocal + " " + golesEquipoVisitante);
    }
}
