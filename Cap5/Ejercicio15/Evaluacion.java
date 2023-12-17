package Cap5.Ejercicio15;


import java.util.Vector;

public class Evaluacion {
    Vector<Comentario> comentarioVector;

    public Evaluacion() {
        this.comentarioVector = new Vector<>();
    }

    public void agregarComentario(Comentario comentario) {
        comentarioVector.add(comentario);
    }

    public Vector<Comentario> getComentarioVector() {
        return comentarioVector;
    }

    public void setComentarioVector(Vector<Comentario> comentarioVector) {
        this.comentarioVector = comentarioVector;
    }
}
