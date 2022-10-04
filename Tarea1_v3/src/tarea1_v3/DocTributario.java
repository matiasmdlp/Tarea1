
package tarea1_v3;

import java.util.Date;


public class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;
    
    public DocTributario(){
        fecha = new Date();
    }
    
    public void setnumero(String n){
        numero = n;
    }
    
    public String getnumero(){
        return numero;
    }
    
    public void setrut(String r){
        numero = r;
    }
    
    public String getrut(){
        return rut;
    }
}

class Boleta extends DocTributario{
    public Boleta(){
    }
}

class Factura extends DocTributario{
    public Factura(){
    }
}

