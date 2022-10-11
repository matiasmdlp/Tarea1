package tarea1_v3;

public class Transferencia extends Pago {

    private String banco;
    private String numCuenta;
    public Transferencia(OrdenCompra o, float p) {
        super(o,p);
        numCuenta = "44221124";
        banco = "Banco Santander";
    }

    public String getbanco() {
        return banco;
    }

    public String getnumCuenta() {
        return numCuenta;
    }
}

