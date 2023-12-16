package Cap4.Ejercicio1;

public class CuentaCorrienteEjerc1 extends CuentaEjerc1 {

    float sobregiro;
    public CuentaCorrienteEjerc1(float saldo, float tasa) {
        super(saldo, tasa);
        sobregiro = 0;
    }

    public void retirar(float cantidad){
        float resultado = saldo - cantidad;
        if (resultado < 0){
            sobregiro -= resultado;
        } else {
            super.retirarDinero(cantidad);
        }
    }
    public void consignar(float cantidad){
        float residuo = sobregiro - cantidad;
        if (sobregiro > 0 ){
            if (residuo > 0){
                sobregiro = 0;
                saldo = residuo;
            } else{
                sobregiro = -residuo;
                saldo = 0;
            }
        } else{
            super.consigarCantidad(cantidad);
        }
    }

    public void imprimir(){
        System.out.println("Saldo: " + saldo + " Cargo Mensual: " + comisionMensual + " Número de transacciones: " + (numConsignaciones + retiros)
        + " Valor de sobregiro: " + (numConsignaciones + retiros));
        System.out.println();
    }
}
