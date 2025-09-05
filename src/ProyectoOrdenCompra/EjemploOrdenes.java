package ProyectoOrdenCompra;

public class EjemploOrdenes {
    public static void main(String[] args) {

        System.out.println("\uD83D\uDCB8 Sistema De compras Don Baraton \uD83D\uDED2");
        System.out.println("\uD83D\uDC7B Donde asustamos a los precios bajos \uD83D\uDC7B");

        OrdenCompra orden1 = new OrdenCompra("");
        OrdenCompra orden2 = new OrdenCompra("");
        OrdenCompra orden5 = new OrdenCompra("");

        System.out.println("Id de la compra: " + orden1.getIdCompra());

        Producto producto1 = new Producto("kubaza","jabón",23.3);
        Producto producto2 = new Producto("kubaza","champu",45.6);
        Producto producto3 = new Producto("kubaza","frijoles",24.6);
        Producto producto4 = new Producto("kubaza","leche deslactosada",42);


        orden1.addProducto(producto1);
        orden1.addProducto(producto2);
        orden1.addProducto(producto3);
        orden1.addProducto(producto4);
        orden1.addProducto(producto1);

        orden1.totalCompra();




    }
}

