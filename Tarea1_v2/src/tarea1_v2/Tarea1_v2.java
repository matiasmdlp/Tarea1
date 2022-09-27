
package tarea1_v2;

/**
 *
 * @author jackfeels matiasmdlp
 */
public class Tarea1_v2 {

    public static void main(String[] args) {
    }
    
}
class Articulo {

    float peso;
    String nombre;
    String descripcion;
    float precio;

    public Articulo() {
    }
    public float getPrecio() {
        return this.precio;
    }
    public float getPeso(){
        return this.peso;
    }
}





class DetalleOrden {

    private int cantidad;

    public DetalleOrden() {
    }

    public float calcPrecio(Articulo a) {
        return 0;
    }

    public float calcPrecioSinIVA(Articulo a) {
        float precio = a.getPrecio();
        return precio;
    }
    public float CalcIVA(Articulo a){
        float p = a.getPrecio() * (float)1.19;
        return p;
    }
}
