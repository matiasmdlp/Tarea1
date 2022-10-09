
package tarea1_v3;

import java.util.Date;


public class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;
    
    public DocTributario(String num, String r){
        fecha = new Date();
        numero=num;
        rut=r;
    }
    
    public String toString(){
        return "Numero: "+numero+"\nfecha: "+fecha+"\n Rut"+rut;
    }
    
    public String getnumero(){
        return numero;
    }
       
    public String getrut(){
        return rut;
    }
    
    public Date getFecha(){
        return fecha;
    }
}

