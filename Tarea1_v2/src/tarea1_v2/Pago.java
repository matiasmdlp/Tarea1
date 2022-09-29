package tarea1_v2;
import java.util.Date;

public class Pago {
    private float monto;
    private Date fecha;
    private int i=0;
    public Pago(){
        fecha = new Date();
    }
    
    public float getmonto(){
        return monto;
    }
    
    public void setmonto(float m){
        monto=m;
    }
    
    public String numtran(){
        i++;
        return "i";
    }
}

class Efectivo extends Pago{
    private float p,m;
    public Efectivo(float p){
        if(this.p>0){
            this.p=this.p+p;
        }else{
            this.p=p;
        }
        
        
    }
    
    public float calcDevolucion(float d){
        super.setmonto(d);
        if(p<d){
            System.out.println("no es suficiente para realizar el pago");
            return -1;
        }else{
            m = p-super.getmonto();
            p = 0;
            return m;  
        }
    }
}

class Transferencia extends Pago{
    private String banco;
    private String numCuenta;
    
    public Transferencia(){
    }
    
    public void setbanco(String b){
        banco = b;
    }
    
    public String getbanco(){
        return banco;
    }
    
    public void setnumCuenta(String nc){
        numCuenta = nc;
    }
    
    public String getnumCuenta(){
        return numCuenta;
    }
}

class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;
    
    public Tarjeta(){
        numTransaccion = super.numtran();
    }
    
    public void settipo(String t){
        tipo = t;
    }
    public String gettipo(){
        return tipo;
    }
    
}