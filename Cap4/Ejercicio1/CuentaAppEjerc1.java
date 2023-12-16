package Cap4.Ejercicio1;

import Cap4.Ejercicio1.CuentaAhorroEjerc1;

public class CuentaAppEjerc1 {
    public static void main(String[] args) {
        CuentaAhorroEjerc1 cuentaAhorros = new CuentaAhorroEjerc1(100000, 0.10);
        cuentaAhorros.consignar(50000);
        cuentaAhorros.retirar(70000);
        cuentaAhorros.extractoMensual();
        cuentaAhorros.imprimir();
    }
}
