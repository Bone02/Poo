package Cap4.Ejercicio4;

import java.util.SortedMap;

public class Gatos extends Mascota{
    public float alturaSalto, longitudSalto;

    public Gatos(String nombre, String color, int edad, float alturaSalto, float longitudSalto) {
        super(nombre, color, edad);
        this.alturaSalto = alturaSalto;
        this.longitudSalto = longitudSalto;
    }

    public static void sonido(){
        System.out.println("Los gatos maullan y ronronean");
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Altura de salto del gato: " + alturaSalto + " Longitud de salto del gato: " + longitudSalto);
    }
}
