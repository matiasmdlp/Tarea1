package tarea1_v3;

public class Transferencia extends Pago {

    private String banco;
    private String numCuenta;

    public Transferencia() {
    }

    public void setbanco(String b) {
        banco = b;
    }

    public String getbanco() {
        return banco;
    }

    public void setnumCuenta(String nc) {
        numCuenta = nc;
    }

    public String getnumCuenta() {
        return numCuenta;
    }
}

