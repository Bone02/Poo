package Cap4.Ejercicio3;


public class InmuebleApp {
    public static void main(String[] args) {
        InmuebleApartamentoFamiliarEjerc3 apartamentoFamiliarEjerc3 = new InmuebleApartamentoFamiliarEjerc3(
                103067, 120, "Avenida Santander 45-45", 3, 2, 200000
        );
        System.out.println("Datos del apartamento");
        apartamentoFamiliarEjerc3.calcularPrecioVenta(InmuebleApartamentoFamiliarEjerc3.valorArea);
        apartamentoFamiliarEjerc3.imprimir();
        System.out.println();

        System.out.println("Datos del apartamento");
        ApartaEstudio apartaEstudio = new ApartaEstudio(12345, 50, "AvenidaCaracas 30-15",
                1, 1);
        apartaEstudio.calcularPrecioVenta(ApartaEstudio.valorArea);
        apartaEstudio.imprimir();
    }
}
