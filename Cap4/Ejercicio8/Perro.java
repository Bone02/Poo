package Cap4.Ejercicio8;

public class Perro extends Canidos{

    @Override
    public String getNombreCientificoAnimal() {
        return "Canis lupus familiaris";
    }

    @Override
    public String getSonidosAnimal() {
        return "Ladrido";
    }

    @Override
    public String getAlimentosAnimal() {
        return "Carnívoro";
    }

    @Override
    public String getHabitatAnimal() {
        return "Doméstico";
    }
}
