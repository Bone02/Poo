package Cap5.Ejercicio9_10;

import java.util.Vector;

public class Orden {
    int identificador;
    Vector itemsPedido;
    Cliente cliente;


    public Orden(int identificador, Cliente cliente) {
        this.identificador = identificador;
        itemsPedido = new Vector<>();
        this.cliente = cliente;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int calcularOrdenPedido(){
        int totalOrden = 0;
        for (int k = 0; k<itemsPedido.size(); k++){
            LineaPedido pedido = (LineaPedido) itemsPedido.elementAt(k);
            totalOrden += pedido.calcularSubtotalLineaPedido();
        }
        return totalOrden;
    }

    @Override
    public String toString() {
        return "Orden{" +
                "identificador=" + identificador +
                ", itemsPedido=" + itemsPedido +
                '}' + " Total orden: " + calcularOrdenPedido() ;
    }

    public void anadirItem(int identificador, int cantidad, Producto producto){
        LineaPedido linea = new LineaPedido(identificador,cantidad,producto);
        itemsPedido.add(linea);
    }
}
