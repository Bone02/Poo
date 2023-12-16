package Cap4.Ejercicio17;

public class PartidoBaloncestoLigaColombiana implements PartidoBaloncesto{

    public String equipoLocal, equipoVisitante;
    public int cestasEquipoLocal, cestasEquipoVisitante;

    public String getEquipoLocal() {
        return equipoLocal;
    }

    @Override
    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    @Override
    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getCestasEquipoLocal() {
        return cestasEquipoLocal;
    }

    @Override
    public void setCestasEquipoLocal(int cestasEquipoLocal) {
        this.cestasEquipoLocal = cestasEquipoLocal;
    }

    public int getCestasEquipoVisitante() {
        return cestasEquipoVisitante;
    }

    @Override
    public void setCestasEquipoVisitante(int cestasEquipoVisitante) {
        this.cestasEquipoVisitante = cestasEquipoVisitante;
    }

    public void imprimir(){
        System.out.println("Equipo local: " + equipoLocal + " vs Equipo Visitante: " + equipoVisitante + " Marcador Final: " + cestasEquipoLocal + " " + cestasEquipoVisitante);
    }
}
