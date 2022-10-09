package tarea1_v3;

public class Tarea1_v3 {
    
    public static void main(String[] args) {
        Articulo Zapato= new Articulo("Zapato",40,"Calzado",0.4f);
        Articulo Polera= new Articulo("Polera",15,"Ropa",0.1f);
        Articulo Reloj= new Articulo("Reloj",80,"Accesorio",0.3f);
        Articulo Calcetin= new Articulo("Calcetin",5,"",0.1f);
        DocTributario Trib = new Boleta("572135845","21205648-8");
        Cliente c1 = new Cliente("Joaquin Avalos","21205648-8","Edmundo Larenas");
        OrdenCompra O1 = new OrdenCompra(Trib,c1);
        
        O1.setDetalleOrden(Zapato,2);
        O1.setDetalleOrden(Polera,3);
        O1.setDetalleOrden(Reloj,1);
        O1.setDetalleOrden(Calcetin,2);
        
        System.out.println(O1.toString()+"\nPrecio: "+O1.calcprecio()+"\npeso:"+O1.calcpeso());
    }

}
