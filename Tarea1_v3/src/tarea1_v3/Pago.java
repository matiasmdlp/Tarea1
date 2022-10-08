package tarea1_v3;

import java.util.Date;

public class Pago {

    private float monto;
    private Date fecha;
    private int i = 0;

    public Pago() {
        fecha = new Date();
    }

    public float getmonto() {
        return monto;
    }

    public void setmonto(float m) {
        monto = m;
    }

    public String numtran() {
        i++;
        return "i";
    }
}


