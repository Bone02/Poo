package Cap5.Ejercicio1_2;

import java.util.Vector;

public class Peaje {
    String nombre, departamento;
    Vector vehiculos;
    int totalPeaje= 0;
    static int totalCamiones = 0, totalCarros = 0, totalMotos = 0;

    public Peaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        vehiculos = new Vector();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void anadirVehiculos(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }

    public int calcularPeaje(Vehiculo vehiculo){
        if (vehiculo instanceof Carro){
            totalCarros++;
            totalPeaje+= Carro.valorPeaje;
            return Carro.valorPeaje;
        }
        else if (vehiculo instanceof Moto){
            totalMotos++;
            totalPeaje += Moto.valorPeaje;
            return Moto.valorPeaje;
        }
        else if (vehiculo instanceof Camion){
            totalCamiones++;
            Camion camion = (Camion) vehiculo;
            totalPeaje += camion.numeroEjes * Camion.valorPeaje;
        }
        else
            return -1;
        return totalPeaje;
    }

    public void imprimir(){
        System.out.println("Peaje; " + getNombre() + " Ubicación: " + getDepartamento() + " Total carros: " + totalCarros
        + " Total motos: " + totalMotos + " Total camiones: " + totalCamiones);
        int totalVehiculos = totalCamiones+totalMotos+totalCarros;
        System.out.println("Total de vehículos: " + totalVehiculos + " Dinero total: " + totalPeaje);

    }
}
