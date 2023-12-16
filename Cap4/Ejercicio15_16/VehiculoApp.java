package Cap4.Ejercicio15_16;

public class VehiculoApp {
    public static void main(String[] args) {
        VehiculosTerrestres vehiculosTerrestres = new VehiculosTerrestres(100, 250, 4, "Uso militar");
        vehiculosTerrestres.imprimir();
        vehiculosTerrestres.acelerar(50);
        System.out.println("Velocidad actual actualizada: " + vehiculosTerrestres.velocidadActual);
        System.out.println();

        VehiculosAcuaticos vehiculosAcuaticos = new VehiculosAcuaticos(50, 110);
        System.out.println("Moto Acuática");
        vehiculosAcuaticos.imprimir();
        System.out.println("Revoluciones del motor: " + vehiculosAcuaticos.calcularRevoluciones(1200,2));
        vehiculosAcuaticos.recomendarVelocidad(20);
        System.out.println();

        VehiculoAereo vehiculoAereo = new VehiculoAereo();
        vehiculoAereo.aterrizar();
        vehiculoAereo.despegar();
        vehiculoAereo.volar();
        vehiculoAereo.apagar();
        vehiculoAereo.encender();
        vehiculoAereo.soltarTren();
        vehiculoAereo.subirTren();
    }
}
