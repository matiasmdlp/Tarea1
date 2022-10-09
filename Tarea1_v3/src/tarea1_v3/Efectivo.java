package tarea1_v3;

public class Efectivo extends Pago {

    public Efectivo(float p, OrdenCompra o) {
        super(o, p);
    }

    public float calcDevolucion() {
            float devolucion;
            devolucion = super.getprecio() - super.getmonto();
            return devolucion;
        }
}
