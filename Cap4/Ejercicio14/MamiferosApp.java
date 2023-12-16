package Cap4.Ejercicio14;

import Cap4.Ejercicio12.Ortopedista;

public class MamiferosApp {
    public static void main(String[] args) {
        Ornitorrinco ornitorrinco = new Ornitorrinco();
        ornitorrinco.amamantarCrias();
        ornitorrinco.ponerHuevos();
        System.out.println();
        Ballena ballena = new Ballena();
        ballena.amamantarCrias();
    }
}
