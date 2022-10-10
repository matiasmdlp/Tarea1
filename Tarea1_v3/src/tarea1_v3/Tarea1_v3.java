package tarea1_v3;

public class Tarea1_v3 {
    
    public static void main(String[] args) {
        Articulo Zapato = new Articulo("Zapato", 40, "Calzado", 0.4f);
        Articulo Polera = new Articulo("Polera", 15, "Ropa", 0.1f);
        Articulo Reloj = new Articulo("Reloj", 80, "Accesorio", 0.3f);
        Articulo Calcetin = new Articulo("Calcetin", 5, "", 0.1f);
        Articulo Poleron = new Articulo("Poleron", 60, "Ropa", 0.5f);
        Articulo Polera2 = new Articulo("Polera Deportiva", 45, "Ropa", 0.2f);
        DocTributario Trib = new Boleta("572135845", "21205648-8");
        Cliente c1 = new Cliente("Joaquin Avalos", "21205648-8", "Edmundo Larenas");
        OrdenCompra a = new OrdenCompra(Trib, c1);

        a.setDetalleOrden(Zapato, 2);
        a.setDetalleOrden(Polera, 3);
        a.setDetalleOrden(Reloj, 1);
        a.setDetalleOrden(Calcetin, 2);

        System.out.println(a.toString() + "\nPrecio: " + a.calcprecio() + "\npeso:" + a.calcpeso());

        System.out.println("----------");

        Cliente c2 = new Cliente("Matias Medina", "22313913-8", "Victor Lamas");
        DocTributario Trib2 = new Boleta("6438238", "3388384-8");
        OrdenCompra b = new OrdenCompra(Trib2, c2);

        b.setDetalleOrden(Polera2, 4);
        b.setDetalleOrden(Calcetin, 1);
        b.setDetalleOrden(Reloj, 1);

        System.out.println(b.toString() + "\nPrecio: " + b.calcprecio() + "\npeso:" + b.calcpeso());

        System.out.println("----------");

        Cliente c3 = new Cliente("Fernando Flores", "28339333-3", "Freire");
        DocTributario Trib3 = new Boleta("63738823", "23225748-9");
        OrdenCompra c = new OrdenCompra(Trib3, c3);

        c.setDetalleOrden(Polera, 1);
        c.setDetalleOrden(Zapato, 2);
        c.setDetalleOrden(Calcetin, 1);

        System.out.println(c.toString() + "\nPrecio: " + c.calcprecio() + "\npeso:" + c.calcpeso());

        System.out.println("----------");

        Cliente c4 = new Cliente("Nicolas Araya", "56272839-7", "Los Carrera");
        DocTributario Trib4 = new Boleta("8738392", "72875362-6");
        OrdenCompra d = new OrdenCompra(Trib4, c4);

        d.setDetalleOrden(Polera2, 5);
        d.setDetalleOrden(Zapato, 3);
        d.setDetalleOrden(Reloj, 1);
        d.setDetalleOrden(Poleron, 3);
        

        System.out.println(d.toString() + "\nPrecio: " + d.calcprecio() + "\npeso:" + d.calcpeso());

        System.out.println("----------");
    }
}
