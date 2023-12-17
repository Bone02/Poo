package Cap5.Ejercicio1_2;

public class VehiculoApp {
    public static void main(String[] args) {
        Peaje peaje = new Peaje("La lizana" , "Santander");
        Camion camion = new Camion("mmi21", 2);
        peaje.anadirVehiculos(camion);
        peaje.calcularPeaje(camion);
        Camion camion1 = new Camion("mmkk2", 3);
        peaje.anadirVehiculos(camion1);
        peaje.calcularPeaje(camion1);
        Camion camion2 = new Camion("qlkw2", 4);
        peaje.anadirVehiculos(camion2);
        peaje.calcularPeaje(camion2);

        System.out.println();

        Moto moto = new Moto("mmskd255");
        peaje.anadirVehiculos(moto);
        peaje.calcularPeaje(moto);
        Moto moto1 = new Moto("iunonk3");
        peaje.anadirVehiculos(moto1);
        peaje.calcularPeaje(moto1);
        Moto moto2 = new Moto("8u9in");
        peaje.anadirVehiculos(moto2);
        peaje.calcularPeaje(moto2);

        System.out.println();

        Carro carro = new Carro("ijiommd");
        peaje.anadirVehiculos(carro);
        peaje.calcularPeaje(carro);
        Carro carro1 = new Carro("klllrtm");
        peaje.anadirVehiculos(carro1);
        peaje.calcularPeaje(carro1);
        Carro carro2 = new Carro("qqmmed");
        peaje.anadirVehiculos(carro2);
        peaje.calcularPeaje(carro2);
        peaje.imprimir();

        System.out.println();
        Persona persona = new Persona("Abigail ", " Dupont", "09/11/2002", "0833447132");

        persona.asignarVehiculo(moto2);
        System.out.println("Total de peaje de: " + persona.nombre + " es de:" + persona.calcularPeajePersona());

    }
}
