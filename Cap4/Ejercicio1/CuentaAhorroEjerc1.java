package Cap4.Ejercicio1;


public class CuentaAhorroEjerc1 extends CuentaEjerc1 {
    private boolean cuentaActiva;


    public CuentaAhorroEjerc1(float saldo, double tasa){
        super(saldo, (float) tasa);
        if (saldo < 1000){
            cuentaActiva = false;
        } else{
            cuentaActiva = true;
        }
    }

    public void consignar(float cantidad){
        super.consigarCantidad(cantidad);
    }
    public void retirar(float cantidad){
        super.retirarDinero(cantidad);
    }
    public void extractoMensual(){
        if (retiros > 4){
            comisionMensual += (retiros - 4) * 1000;
        }
        super.extractoMensual();

        if (saldo < 10000){
            cuentaActiva = false;
        }
    }
    public void imprimir(){
        System.out.println("Saldo: " + saldo + " Comisión mensual: " + comisionMensual + " Número de transacciones: " +
                (numConsignaciones + retiros)) ;
        System.out.println();
    }
}
