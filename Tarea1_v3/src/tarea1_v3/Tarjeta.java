package tarea1_v3;

public class Tarjeta extends Pago {

    private String tipo;
    private String numTransaccion;

    public Tarjeta(String tip, String numtrans, float p, OrdenCompra o){
        super(o, p);
        tipo=tip;
        numTransaccion=numtrans;  
    }

    public String gettipo() {
        return tipo;
    }
    
    public String getnumtrans(){
        return numTransaccion;
    }

}
