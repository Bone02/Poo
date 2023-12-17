package Cap5.Ejercicio15;

import java.util.Vector;

public class EvaluacionApp {
    public static void main(String[] args) {
        // Crear un artículo
        Articulo articulo = new Articulo();

        // Agregar secciones al artículo
        Seccion seccion1 = new Seccion();
        seccion1.setTitulo("Introducción");
        seccion1.agregarAutor("Melanie");
        seccion1.agregarAutor("Federico");
        articulo.agregarSeccion(seccion1);

        Seccion seccion2 = new Seccion();
        seccion2.setTitulo("Desarrollo");
        seccion2.agregarAutor("Andrew");
        articulo.agregarSeccion(seccion2);

        Subseccion subseccion = new Subseccion(1);
        seccion2.agregarSubseccion(subseccion);

        Parrafo parrafo = new Parrafo(10, 150);
        subseccion.agregarParrafo(parrafo);

        seccion1.agregarComentario(new Comentario("Buena introducción."));
        seccion1.agregarComentario(new Comentario("Revisar la redacción."));

        subseccion.agregarComentario(new Comentario("Contenido interesante."));
        subseccion.agregarComentario(new Comentario("Agregar más ejemplos."));

        parrafo.agregarComentario(new Comentario("Argumento débil"));
        parrafo.agregarComentario(new Comentario("Explicar con más detalle"));

        articulo.setComentado("aceptado con modificaciones");

        imprimirComentarios(articulo.getSecciones());

        System.out.println("\nConcepto: " + articulo.getConcepto());
    }

    private static void imprimirComentarios(Vector<Seccion> secciones) {
        if (secciones != null) {
            for (Seccion seccion : secciones) {
                System.out.println(seccion);
                System.out.println("Comentarios de la sección:");
                if (seccion.getComentarioVector() != null) {
                    for (Comentario comentario : seccion.getComentarioVector()) {
                        System.out.println("- " + comentario.getTexto());
                    }
                }

                for (Subseccion subseccion : seccion.getSubsecciones()) {
                    System.out.println("Comentarios de la subsección:");
                    if (subseccion.getComentarioVector() != null) {
                        for (Comentario comentario : subseccion.getComentarioVector()) {
                            System.out.println("  - " + comentario.getTexto());
                        }
                    }
                    for (Parrafo parrafo : subseccion.getParrafos()) {
                        System.out.println("Comentarios del párrafo:");
                        if (parrafo.getComentarioVector() != null) {
                            for (Comentario comentario : parrafo.getComentarioVector()) {
                                System.out.println("    - " + comentario.getTexto());
                            }
                        }
                    }
                }
                if (seccion.getSubsecciones() != null) {
                    for (Subseccion subseccion : seccion.getSubsecciones()) {
                        imprimirComentarios(subseccion.getSecciones());
                    }
                }
            }
        }
    }
}
