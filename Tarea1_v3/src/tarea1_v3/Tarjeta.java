package tarea1_v3;

public class Tarjeta extends Pago {

    private String tipo;
    private String numTransaccion;

    public Tarjeta() {
        numTransaccion = super.numtran();
    }

    public void settipo(String t) {
        tipo = t;
    }

    public String gettipo() {
        return tipo;
    }

}
