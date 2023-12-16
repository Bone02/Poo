package Cap4.Ejercicio12;

public class Ortopedista extends Medico{
    enum Tipologia{MAXILOFACIAL, PEDIATRICA};
    Tipologia tipo;

    public Tipologia getTipo() {
        return tipo;
    }

    public void setTipo(Tipologia tipo) {
        this.tipo = tipo;
    }
}
