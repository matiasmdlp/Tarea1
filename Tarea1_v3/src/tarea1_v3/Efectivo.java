package tarea1_v3;

public class Efectivo extends Pago {

    private float p, m;

    public Efectivo(float p) {
        if (this.p > 0) {
            this.p = this.p + p;
        } else {
            this.p = p;
        }

    }

    public float calcDevolucion(float d) {
        super.setmonto(d);
        if (p < d) {
            System.out.println("no es suficiente para realizar el pago");
            return -1;
        } else {
            m = p - super.getmonto();
            p = 0;
            return m;
        }
    }
}
