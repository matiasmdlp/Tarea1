package tarea1_v3;

import java.util.Date;

public class Tarea1_v3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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

    public float getPeso() {
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

    public float CalcIVA(Articulo a) {
        float p = a.getPrecio() * (float) 1.19;
        return p;
    }

    public float calcPeso(Articulo a) {
        return a.getPeso();
    }
}

class OrdenCompra {

    private Date fecha;
    private String estado;
    private Articulo articulo;
    public OrdenCompra(Articulo articulo) {
        this.articulo = articulo;
    }
}
