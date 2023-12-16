package Cap4.Ejercicio4;

public class Perros extends Mascota{
    public float peso;
    public boolean siMuerde;

    public Perros(String nombre, String color, int edad, float peso, boolean siMuerde) {
        super(nombre, color, edad);
        this.peso = peso;
        this.siMuerde = siMuerde;
    }

    public static void sonido(){
        System.out.println("Los perros ladran");
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Peso del perro: " + peso + " ¿Muerde? " + siMuerde);
    }
}
