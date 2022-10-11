package tarea1_v3;

import java.util.Random;

public class Tarjeta extends Pago {

    Random rand = new Random();
    private String tipo;
    private String numTransaccion = String.valueOf((rand.nextInt(10000)));
    public Tarjeta(String tip, float p, OrdenCompra o) {
        super(o, p);
        tipo = tip;
    }

    public String gettipo() {
        return tipo;
    }

    public String getnumtrans() {
        return numTransaccion;
    }

}
