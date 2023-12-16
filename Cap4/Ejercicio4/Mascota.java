package Cap4.Ejercicio4;

public class Mascota {
    public String nombre, color;
    public int edad;

    public Mascota(String nombre, String color, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }

    public void imprimir(){
        System.out.println("Nombre de mascota: " + nombre + " Color de Mascota: " + color
        + " Edad de mascota: " + edad);
    }

}
