package tarea1_v3;

import java.util.Date;

public class Pago {
    private OrdenCompra orden;
    private float monto;
    private Date fecha;
    
    public Pago(OrdenCompra ord,float m) {
        fecha = new Date();
        monto = m;
        orden=ord;
    }
    
    public String toString() {
        return "fecha: "+fecha+"\nmonto: "+monto;
    }
        
    public float getmonto() {
        return monto;
    }
    
    public float getprecio(){
        return orden.calcprecio(); 
    }
    
    public Date getfecha() {
        return fecha;
    }
}


