package Cap5.Ejercicio7_8;

public class Llanta {
    String marca;
    double diametroRin, altura, anchura;

    public Llanta(String marca, double diametroRin, double altura, double anchura) {
        this.marca = marca;
        this.diametroRin = diametroRin;
        this.altura = altura;
        this.anchura = anchura;
    }

    public void imprimir(){
        System.out.println("Marca: " + marca + " Diametro del rin: " + diametroRin + " Altura: " + altura + " Anchura: " + anchura);
    }
}
