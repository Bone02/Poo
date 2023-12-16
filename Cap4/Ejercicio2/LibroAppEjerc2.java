package Cap4.Ejercicio2;

public class LibroAppEjerc2 {
    public static void main(String[] args) {
        LibroNovelasEjerc2 libroNovelasEjerc2 = new LibroNovelasEjerc2("Don quijote", "Miguel de Cervantes",
                20.0F, "Sátira" );
        libroNovelasEjerc2.imprimir();
        System.out.println();
        LibroTextoEjerc2 libroTextoEjerc2 = new LibroTextoEjerc2("El extranjero", "Albert Camus",
                13.0F, "Literatura");
        libroTextoEjerc2.imprimir();
        System.out.println();
        LibroUnclEjerc2 libroUnclEjerc2 = new LibroUnclEjerc2("Introducción a Java", "Jaime Sayago",
                10.0F, "TIC", "Escuela de Sistemas");
        libroUnclEjerc2.imprimir();
        System.out.println();
        LibroEjerc2 libro = new LibroEjerc2("El señor de los anillos", "John Ronald Reuel Tolkien",
                30.0F);
        libro.imprimir();
    }
}
