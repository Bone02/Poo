package Cap4.Ejercicio9;

public class Fraccion extends Numerica{

    public int var1, var2;

    public Fraccion(int var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    @Override
    public String toString() {
        return var1 + "/" + var2;
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob){
            return true;
        }
        if(ob == null || getClass() != ob.getClass()){
            return false;
        }
        Fraccion fraccion = (Fraccion) ob;
        return var1 == fraccion.var1 && var2 == fraccion.var2;
    }

    @Override
    public Numerica sumar(Numerica numero) {
        if (numero instanceof Fraccion){
            Fraccion var3 = (Fraccion) numero;
            return new Fraccion(this.var1 * var3.var2 + var3.var1 * this.var2, this.var2 * var3.var2);
        } else{
            System.out.println("Deben ser tipos iguales");
        }
        return numero;
    }

    @Override
    public Numerica restar(Numerica numero) {
        if (numero instanceof Fraccion){
            Fraccion var3 = (Fraccion) numero;
            return new Fraccion(this.var1 * var3.var2 - var3.var1 * this.var2, this.var2 * var3.var2);
        } else{
            System.out.println("Deben ser de tipos iguales");
        }
        return numero;
    }

    @Override
    public Numerica multiplicar(Numerica numero) {
        if (numero instanceof Fraccion){
            Fraccion var3 = (Fraccion) numero;
            return new Fraccion(this.var1 * var3.var1, this.var2 * var3.var2);
        } else{
            System.out.println("Deben ser de tipos iguales");
        }
        return numero;
    }

    @Override
    public Numerica dividir(Numerica numero) {
        if (numero instanceof Fraccion){
            Fraccion var3 = (Fraccion) numero;
            return new Fraccion(this.var1 * var3.var2, this.var2 * var3.var1);
        } else{
            System.out.println("Deben ser de tipos iguales");
        }
        return numero;
    }
}
