package tarea1_v3;
import java.util.Random; 

public class Tarjeta extends Pago {
    Random rand = new Random();
    private String tipo;
    private String numTransaccion = String.valueOf((rand.nextInt(10000)));;

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
