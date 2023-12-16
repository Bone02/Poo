package Cap4.Ejercicio6;

public class AppPersona {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Abigail", "namur 0-3", "nurse", 8);
        estudiante.imprimir();
        System.out.println();
        Profesor profesor = new Profesor("Abigail", "namur 0-3", "namur 28812", " director");
        profesor.imprimir();
    }
}
