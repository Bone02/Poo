package Cap4.Ejercicio6;

import java.util.SortedMap;

public class Profesor extends Persona{

    public String departamento, categoria;
    public Profesor(String nombre, String direccion, String departamento, String categoria) {
        super(nombre, direccion);
        this.departamento = departamento;
        this.categoria = categoria;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Departamento: " + departamento + " Categoría: " + categoria);
    }
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
