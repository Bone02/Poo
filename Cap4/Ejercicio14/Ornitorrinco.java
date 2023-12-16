package Cap4.Ejercicio14;

public class Ornitorrinco extends Mamiferos implements Oviparos{

    @Override
    public void amamantarCrias() {
        System.out.println("Ornitorrinco amamanta sus crías");
    }

    @Override
    public void ponerHuevos() {
        System.out.println("Ornitorrinco coloca huevos");
    }
}
