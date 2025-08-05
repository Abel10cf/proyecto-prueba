package CursoCompletoJava.Poo.Ventas;

public class Main {
    public static void main(String[] args) {

        System.out.println("*** Sistema de ventas ***");
        Producto producto1 = new Producto("Camisa",50);
        Producto producto2 = new Producto("Pantalón",100);
        Producto producto3 = new Producto("Calcetines",20);

        Orden orden1 = new Orden();
        orden1.agregarProductos(producto1);
        orden1.agregarProductos(producto2);

        orden1.calcularTotal();
        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        orden2.agregarProductos(producto3);
        orden2.agregarProductos(producto1);

        orden2.calcularTotal();
        orden2.mostrarOrden();

        //orden1.traerPrecio(producto1);

    }
}
