package tarea1_v3;

public class Transferencia extends Pago {

    private String banco;
    private String numCuenta;

    public Transferencia(String banc, String numc, float p, OrdenCompra o) {
        super(o, p);
        banco=banc;
        numCuenta=numc;
    }

    public String getbanco() {
        return banco;
    }

    public String getnumCuenta() {
        return numCuenta;
    }
}

