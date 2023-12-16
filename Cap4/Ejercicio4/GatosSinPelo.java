package Cap4.Ejercicio4;

public class GatosSinPelo extends Gatos {

    public String raza;

    public GatosSinPelo(String nombre, String color, int edad, float alturaSalto, float longitudSalto, String raza) {
        super(nombre, color, edad, alturaSalto, longitudSalto);
        this.raza = raza;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Raza: " + raza);
    }
}
