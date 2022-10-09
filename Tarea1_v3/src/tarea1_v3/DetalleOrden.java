
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
        return articulo.getPeso();
    }
    
    public float calcPrecio() {
        return calcPrecioSinIVA()+CalcIVA();
    }

    public float calcPrecioSinIVA() {
        return articulo.getPrecio(); 
    }

    public float CalcIVA() {
        return articulo.getPrecio() * (float) 0.19;
    }

}
