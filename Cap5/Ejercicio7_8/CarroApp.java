package Cap5.Ejercicio7_8;

import java.util.Vector;

public class CarroApp {
    public static void main(String[] args) {
        Carro carro = new Carro(2, TipoChasis.MONOCASCO, "Rojo", TipoCarroceria.TUBULAR, "goodyear", 25,10,15);
        carro.imprimir();

        Asientos asientoConductor = new Asientos("Cuero", false);
        Asientos asientoAcompanante = new Asientos("Cuero", false);
        Asientos asientoAtras = new Asientos("Cuero", true);
        carro.agregarAsiento(asientoConductor);
        carro.agregarAsiento(asientoAcompanante);
        carro.agregarAsiento(asientoAtras);
        carro.mostrarAsiento();
        Airbags airbags = new Airbags(30, 6, false);
        carro.agregarAirbag(airbags);
        carro.mostrarAirbags();
        FrenosAbs frenos = new FrenosAbs(false, false);
        carro.agregarFrenosAbs(frenos);
        carro.mostrarFrenosAbs();
        EspejosElectricos espejosElectricos = new EspejosElectricos(true);
        carro.agregarEspejosElectricos(espejosElectricos);
        carro.mostrarEspejosElectricos();
        VidriosElectricos vidriosElectricos = new VidriosElectricos(true, false);
        carro.agregarVidriosElectricos(vidriosElectricos);
        carro.mostrarVidriosElectrico();
        Sunroof sunroof = new Sunroof(true, true);
        carro.agregarSunroof(sunroof);
        carro.mostrarSunroof();
        AireAcondicionado aireAcondicionado = new AireAcondicionado(false);
        carro.agregarAireAcondicionado(aireAcondicionado);
        carro.mostrarAireAcondicionado();
    }
}
