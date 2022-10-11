
package tarea1_v3;

import java.io.IOException;
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
    private Pago efectivo;
    private Pago transferencia;
    private Pago tarjeta;
    
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
    public void setYaPagado(OrdenCompra oc){
        oc.estado = "Pago realizado";
    }
    public void CallToPago(OrdenCompra oc,float p) throws IOException {

        System.out.println("¿Cual metodo de Pago desea usar para pagar la orden de : \n" + oc.cliente + "\n?");
        System.out.println("Responda 1 para Efectivo, 2 para Transferencia o 3 para Tarjeta");
        int num = System.in.read();
        switch (num) {
            case 1:
                efectivo = new Efectivo(p,oc);
                setYaPagado(oc);
                break;
            case 2:
                transferencia = new Transferencia(oc,p);
                setYaPagado(oc);
                break;

            case 3:
                System.out.println("Responda 1 para Debito o 2 para Credito");
                Scanner sc = new Scanner(System.in);
                String tipo = sc.nextLine();
                tarjeta = new Tarjeta(tipo,p,oc); 
                setYaPagado(oc);
                break;
        }
    }
}
        
