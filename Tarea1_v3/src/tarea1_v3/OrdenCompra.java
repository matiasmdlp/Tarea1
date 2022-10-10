
package tarea1_v3;

import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class OrdenCompra { 
    private Date fecha;
    private String estado;
    private ArrayList<DetalleOrden> detalles;
    private ArrayList<Pago> pagos;
    private Cliente cliente;
    private DocTributario documentoTrib;
    
    public OrdenCompra(DocTributario docTrib, Cliente c) {
        fecha = new Date();
        detalles = new ArrayList<DetalleOrden>();
        pagos = new ArrayList<Pago>();
        estado = "Pago Pendiente";
        documentoTrib = docTrib;
        cliente = c;
    }
    
    public String toString(){
        return cliente.toString()+"\n"+documentoTrib.toString()+"\nEstado: "+estado;
    }
    
    public String getestado() {
        return estado;
    }

    public void setestado(int num) {
        switch (num){
            case 1:
                this.estado = "Pagado";
        }
    }
    
    public float calcpeso(){
        float peso = 0;
        for(DetalleOrden detalle: detalles){
            peso = peso+detalle.calcPeso();
        }
        return peso;
    }
    
    public float calcIVA(){
        return calcprecioSinIVA() * (float) 0.19;
    }
    
    public float calcprecioSinIVA(){
        float sum = 0;
        for(DetalleOrden detalle: detalles){
            sum = sum+detalle.calcPrecioSinIVA();
        }
        return sum;
    }
      
    public float calcprecio(){
        return calcprecioSinIVA() + calcIVA();
    }
    
    public void setpagos(Pago pago){
        pagos.add(pago);
    }
    
    public void setDetalleOrden(Articulo articulo, int cantidad){
        DetalleOrden aux = new DetalleOrden(articulo,cantidad);
        detalles.add(aux);
    }
    /*public void CallToPago(Pago pago){
        System.out.println("¿Cual metodo de Pago desea usar?");
        System.out.println("Responda 1 para Efectivo, 2 para Transferencia o 3 para Tarjeta");
        int num = System.in.read();
        switch(num){
            case 1: 
                
                
        }
        
    }*/
}
