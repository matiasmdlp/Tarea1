
package tarea1_v3;

public class DetalleOrden {
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

    public float CalcIVA(Articulo a) {
        float p = a.getPrecio() * (float) 1.19;
        return p;
    }

    public float calcPeso(Articulo a) {
        return a.getPeso();
    }
}
