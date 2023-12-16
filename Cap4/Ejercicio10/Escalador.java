package Cap4.Ejercicio10;

public class Escalador extends Ciclista{

    private double promedioAceleracion, gradoRampa;

    public double getPromedioAceleracion() {
        return promedioAceleracion;
    }

    public void setPromedioAceleracion(double promedioAceleracion) {
        this.promedioAceleracion = promedioAceleracion;
    }

    public double getGradoRampa() {
        return gradoRampa;
    }

    public void setGradoRampa(double gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    public Escalador(int identificador, String nombre, double promedioAceleracion, double gradoRampa) {
        super(identificador, nombre);
        this.gradoRampa = gradoRampa;
        this.promedioAceleracion = promedioAceleracion;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Promedio de aceleración: " + promedioAceleracion + " Grado rampa: " + gradoRampa);
    }
    @Override
    String imprimirTipo() {
        return "Es un escalador";
    }
}
