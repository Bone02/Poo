package Cap4.Ejercicio1;

public class CuentaEjerc1 {
    protected float saldo;
    protected int numConsignaciones = 0;
    protected int retiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;


    public CuentaEjerc1(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;

    }

    public void consigarCantidad(float cantidad){
        saldo += cantidad;
        System.out.println("Saldo actual: " + saldo);
        numConsignaciones = numConsignaciones + 1;
    }

    public void retirarDinero(float cantidad){
        float nuevoSaldo = saldo - cantidad;
        if (nuevoSaldo >= 0){
            saldo -= cantidad;
            retiros+= 1;
        } else {
            System.out.println("Su cantidad " + "<<" + cantidad + ">>  excede el saldo actual");
        }
    }

    public void calcularInterers(){
        float tasaMensual = tasaAnual / 12;
        float interesMensual = saldo * tasaMensual;
        saldo += interesMensual;
    }
    public void extractoMensual(){
        saldo -= comisionMensual;
        calcularInterers();
    }
    public void imprimir(){
        System.out.println("Saldo: " + saldo + " Número de consignaciones: " + numConsignaciones + " Retiros: " + retiros + " Tasa Anual: " + tasaAnual +
                " Comisión mensual: " + comisionMensual);
    }
}
