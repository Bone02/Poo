package Cap5.Ejercicio5_6;

public class AppBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca de ecuador");
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "Sudamericana", 1967, "858.67/M566");
        Libro libro2 = new Libro("Rayuela", "Julio Cortázar", "Sudamericana", 1963, "858.67/M566");
        Libro libro3 = new Libro("CLa tía julia y el escribidor", "Mario Vargas Llosa", "Seix Barral", 1977, "863.55/J667");
        Revista revista1 = new Revista("Programación en java", "Jaime Sayago", "Pucese", 2023, "mensual", "Ecuador");
        Revista revista2 = new Revista("dany en el amor", "Dany Ávila Ballesteros", "La tolita", 1900, "anual", "Ecuador");
        Revista revista3 = new Revista("mell y nahomy", "Mell Vergara & Nahomy Montaño", "John3000", 2023, "semanal", "Ecuador");
        biblioteca.agregarLibros(libro1);
        biblioteca.agregarLibros(libro2);
        biblioteca.agregarLibros(libro3);
        biblioteca.listarLibros();
        biblioteca.agregarRevistas(revista1);
        biblioteca.agregarRevistas(revista2);
        biblioteca.agregarRevistas(revista3);
        biblioteca.listarRevistas();
    }
}
