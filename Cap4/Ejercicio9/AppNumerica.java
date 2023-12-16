package Cap4.Ejercicio9;

public class AppNumerica {
    public static void main(String[] args) {
        Fraccion frac1 = new Fraccion(1,2);
        Fraccion frac2 = new Fraccion(3,4);
        System.out.println("Fracción 1: " + frac1.toString());
        System.out.println("Fracción 2: " + frac2.toString());

        System.out.println("Suma: " + frac1.sumar(frac2).toString());
        System.out.println("Resta: " + frac1.restar(frac2).toString());
        System.out.println("Multiplicación: " + frac1.multiplicar(frac2).toString());
        System.out.println("División: " + frac1.dividir(frac2).toString());
    }
}
