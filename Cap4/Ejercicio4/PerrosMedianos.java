package Cap4.Ejercicio4;

public class PerrosMedianos extends  Perros{
    public String raza;

    public PerrosMedianos(String nombre, String color, int edad, float peso, boolean siMuerde, String raza) {
        super(nombre, color, edad, peso, siMuerde);
        this.raza = raza;
    }
    public void imprimir(){
        super.imprimir();
        System.out.println("Raza: " + raza);
    }
}
