
package tarea1_v3;

public class Articulo {
    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;

    public Articulo(String nom, float prec, String des, float p){
        nombre=nom;
        peso=p;
        descripcion=des;
        precio=prec;
    }
    
    public String toString(){
        return "nombre: "+nombre+"\nprecio: "+precio+"\ndescripcion: "+descripcion+"\npeso: "+peso;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public float getPeso(){
        return peso;
    }
     
    public String getDescripcion(){
        return descripcion;
    }
    
    public float getPrecio(){
        return precio;
    }
    
}
