package Cap4.Ejercicio12;

public class Pediatra extends Medico{
    enum Tipologia {NEUROLOGO, PSICOLOGO};
    Tipologia tipo;

    public Tipologia getTipo() {
        return tipo;
    }

    public void setTipo(Tipologia tipo) {
        this.tipo = tipo;
    }
}
