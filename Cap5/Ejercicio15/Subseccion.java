package Cap5.Ejercicio15;

import java.util.Vector;

public class Subseccion extends Evaluacion {
    int id;
    Vector<Seccion> secciones;
    Vector<Parrafo> parrafos;
    public Subseccion(int id) {
        this.id = id;
        this.parrafos = new Vector<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Subseccion{" +
                "id=" + id +
                '}';
    }

    public boolean esSubseccion() {
        return true;
    }

    public void agregarParrafo(Parrafo parrafo) {
        parrafos.add(parrafo);
    }
    public Vector<Parrafo> getParrafos() {
        return parrafos;
    }


    public Vector<Seccion> getSecciones() {
        return secciones;
    }

}
