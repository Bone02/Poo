package Cap4.Ejercicio7;

import java.util.Vector;

public class AppProfesor {
    Vector profesores;
    public static void main(String[] args) {


        Profesor profesor = new ProfesorTitular();
        Profesor profeosr2 = (Profesor) profesor;
        profeosr2.imprimir();

        AppProfesor appProfesor = new AppProfesor();
        appProfesor.profesores = new Vector();
        Profesor profesor1 = new Profesor();
        ProfesorTitular profesorTitular = new ProfesorTitular();
        appProfesor.profesores.add(profesor1);
        appProfesor.profesores.add(profesorTitular);

        for (int k = 0; k<appProfesor.profesores.size(); k++){
            Profesor p = (Profesor) appProfesor.profesores.elementAt(k);
            p.imprimir();
        }

    }


    //Compilación: "Es un profesor titular"

    /*
    Es un profesor
    Es un profesor titular
     */
}
