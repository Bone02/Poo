package Cap4.Ejercicio7;

public class ProfesorTitular extends Profesor{

    int aniosProf = 0;

    public void imprimir(){
        System.out.println("Es un profesor titular");
    }

    public void imprimirAnios(){
        System.out.println("Edad: " + aniosProf);
    }

}
