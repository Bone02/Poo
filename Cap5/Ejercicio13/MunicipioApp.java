package Cap5.Ejercicio13;

import Cap5.Ejercicio11_12.Delantero;

import java.util.Vector;

public class MunicipioApp {
    public static void main(String[] args) {
        Municipio municipio1 = new Municipio("Manizales", 400000, 17.5, 2200, 0.95);
        Municipio municipio2 = new Municipio("La Dorada", 98000, 28.5, 1000, 1.10);
        Municipio municipio3 = new Municipio("Neira", 30000, 20.5, 1969, 1.23);

        Vector municipioss = new Vector();
        municipioss.add(municipio1);
        municipioss.add(municipio2);
        municipioss.add(municipio3);

        Departamento departamento = new Departamento("Caldas", municipioss);

        System.out.println("Censo de: " + departamento.getNombre() + " es: " + departamento.calcularPoblacion());
        System.out.println("Municipios con mayor población a 50000: " );
        departamento.buscarMunicipioPoblMayor(50000);
        System.out.println("Búsqueda de municipio de Manizales: ");
        departamento.buscarMunicipio("Manizales");
    }
}
