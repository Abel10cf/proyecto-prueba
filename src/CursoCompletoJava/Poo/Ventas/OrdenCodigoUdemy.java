package CursoCompletoJava.Poo.Ventas;

public class OrdenCodigoUdemy {

    private final int idOrden;
    private Producto[] productos;
    private int contadorProductos;
    private static final int MAX_VALOR = 5;
    private static int contadorOrdenes;

    public OrdenCodigoUdemy() {
        this.productos = new Producto[OrdenCodigoUdemy.MAX_VALOR];
        this.idOrden = ++OrdenCodigoUdemy.contadorOrdenes;
    }

    public void agregarProductos(Producto producto){
        if (contadorProductos < MAX_VALOR){
            this.productos[this.contadorProductos++] = producto;
        }else
            System.out.println("Se ha superado el máximo de productos: "
             + OrdenCodigoUdemy.MAX_VALOR);
    }

    public double calcularTotal(){
        double sumTotal = 0;
        for (int i = 0; i < contadorProductos; i++) {
            sumTotal += productos[i].getPrecio();
        }
        return sumTotal;
    }

    public void mostrarOrden(){
        System.out.println("Id Orden: " + idOrden);
        var totalOrden = this.calcularTotal();
        System.out.println("\tTotal de la orden: " + totalOrden);
        System.out.println("\tProductos de la orden:");
        for (int i = 0; i < contadorProductos; i++) {
            System.out.println("\t\t"+ productos[i]);
        }
    }
}
