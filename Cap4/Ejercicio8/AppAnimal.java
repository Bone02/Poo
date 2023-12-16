package Cap4.Ejercicio8;

public class AppAnimal {
    public static void main(String[] args) {
        Animal animal[] = new Animal[4];
        animal[0] = new Gato();
        animal[1] = new Leon();
        animal[2] = new Lobo();
        animal[3] = new Perro();

        for (int k = 0; k<animal.length; k++){
            System.out.println("Nombre científico: " + animal[k].getNombreCientificoAnimal() + " Hábitat: " + animal[k].getHabitatAnimal() +
                    " Sonido que hace: " + animal[k].getSonidosAnimal() + " Alimentación: " + animal[k].getAlimentosAnimal());
        }


    }
}
