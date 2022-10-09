
package tarea1_v3;

public class Cliente {
    private String nombre;
    private String rut;
    private Direccion direccion;
    
    public Cliente(String n, String r, String d){
        nombre = n;
        rut = r;
        direccion = new Direccion(d); 
    }
    
    public String toString(){
        return "Nombre: "+nombre+"\nRut: "+rut+"\nDireccion: "+direccion.getdireccion();
    }
    
    public String getnombre(){
        return nombre;
    }
    public String getrut(){
        return rut;
    }
    public String getdireccion(){
        return direccion.getdireccion();
    }
    
}
