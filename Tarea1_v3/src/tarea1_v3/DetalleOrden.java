
package tarea1_v3;

public class DetalleOrden {
    private int cantidad;
    private Articulo articulo;

    public DetalleOrden(Articulo art, int n) {
        articulo=art;
        cantidad=n;
    }
    
    public String toString() {
        return "articulo: "+articulo.getNombre()+"("+cantidad+")";
    }
    
    public float calcPeso() {
        return cantidad * articulo.getPeso();
    }
    
    public float calcPrecio() {
        return cantidad * calcPrecioSinIVA()+CalcIVA();
    }

    public float calcPrecioSinIVA() {
        return cantidad * articulo.getPrecio(); 
    }

    public float CalcIVA() {
        return cantidad * (float) 0.19;
    }

}
