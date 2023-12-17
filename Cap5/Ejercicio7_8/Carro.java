package Cap5.Ejercicio7_8;

import java.util.Vector;

public class Carro {

    Motor motor;
    Chasis chasis;
    Llanta[] llantas;
    Carroceria carroceria;

    Vector asiento, airbag, frenosAbs, vidriosElectricos, espejosElectricos, sunRoof, aireAcondiconado;



    public Carro(int volumen, TipoChasis claseChasis, String color, TipoCarroceria claseCarroceria, String marca, double diametro, double altura, double anchura){
        motor = new Motor(volumen);
        chasis = new Chasis(claseChasis);
        llantas = new Llanta[4];
        for (int k = 0; k< llantas.length; k++){
            llantas[k] = new Llanta(marca,diametro,altura,anchura);
        }
        carroceria = new Carroceria(claseCarroceria, color);
        asiento = new Vector<>();
        airbag = new Vector<>();
        frenosAbs = new Vector<>();
        vidriosElectricos = new Vector<>();
        espejosElectricos = new Vector<>();
        sunRoof = new Vector<>();
        aireAcondiconado = new Vector<>();
    }

    public void imprimir(){
        System.out.println("Datos del carro: ");
        System.out.println("Motor - Cilindros: " + motor.volumen);
        System.out.println("Chasis - Tipo: " + chasis.tipo);
        System.out.println("Carroceria - Tipo: " + carroceria.tipo + " Color: " + carroceria.color);
        System.out.println("Cantidad de llantas: "+ llantas.length);
        for (int k = 0; k<llantas.length; k++){
            llantas[k].imprimir();
        }
    }


    public void agregarAsiento(Asientos asientos){
        asiento.add(asientos);
    }

    public void mostrarAsiento(){
        for (int k = 0; k<asiento.size(); k++){
            Asientos asientos = (Asientos) asiento.elementAt(k);
            asientos.imprimir();
        }
    }

    public void agregarAirbag(Airbags airbags){
        airbag.add(airbags);
    }
    public void mostrarAirbags(){
        for (int k = 0; k<airbag.size(); k++){
            Airbags airbags = (Airbags) airbag.elementAt(k);
            airbags.impirmir();
        }
    }

    public void agregarFrenosAbs(FrenosAbs frenos){
        frenosAbs.add(frenos);
    }
    public void mostrarFrenosAbs() {
        for (int k = 0; k < frenosAbs.size(); k++) {
            FrenosAbs frenos = (FrenosAbs) frenosAbs.elementAt(k);
            frenos.imprimir();
        }
    }

    public void agregarVidriosElectricos(VidriosElectricos vidriosElectric){
        vidriosElectricos.add(vidriosElectric);
    }
    public void mostrarVidriosElectrico(){
        for (int k = 0; k < vidriosElectricos.size(); k++){
            VidriosElectricos vidriosElectricos1 = (VidriosElectricos) vidriosElectricos.elementAt(k);
            vidriosElectricos1.imprimir();
        }
    }

    public void agregarEspejosElectricos(EspejosElectricos espejosElectric){
        espejosElectricos.add(espejosElectric);
    }

    public void mostrarEspejosElectricos(){
        for (int k = 0; k<espejosElectricos.size(); k++){
            EspejosElectricos espejosElectricos1 = (EspejosElectricos) espejosElectricos.elementAt(k);
            espejosElectricos1.imprimir();
        }
    }

    public void agregarSunroof(Sunroof sunroof){
        sunRoof.add(sunroof);
    }

    public void mostrarSunroof(){
        for(int k = 0; k<sunRoof.size(); k++){
            Sunroof sunroof = (Sunroof) sunRoof.elementAt(k);
            sunroof.imprimir();
        }
    }
    public void agregarAireAcondicionado(AireAcondicionado aireAcondicionado){
        aireAcondiconado.add(aireAcondicionado);
    }

    public void mostrarAireAcondicionado(){
        for (int k = 0; k<aireAcondiconado.size(); k++){
            AireAcondicionado aireAcondicionado = (AireAcondicionado) aireAcondiconado.elementAt(k);
            aireAcondicionado.imprimir();
        }
    }
}
