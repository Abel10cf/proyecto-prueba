package CursoCompletoJava.Poo.Ventas;

public class Main {
    public static void main(String[] args) {

        System.out.println("*** Sistema de ventas ***");

        //Instanciación de la clase producto, se crean varios productos
        Producto producto1 = new Producto("Camisa",50);
        Producto producto2 = new Producto("Pantalón",100);
        Producto producto3 = new Producto("Calcetines",20);

        //Instanciación de la clase Orden, se crea la primera orden
        Orden orden1 = new Orden();

        //Agregamos objetos de tipo producto a la primera orden, utilizando el método agregarProductos
        orden1.agregarProductos(producto1);
        orden1.agregarProductos(producto2);

        //Calculamos el total a pagar de la primera orden utilizando el método CalcularTotal
        orden1.calcularTotal();

        //Mostramos lo que tenemos en la primera orden utilizando el método MostrarOrden
        orden1.mostrarOrden();

        //Creamos una nueva orden y hacemos lo mismo que en la primera orden
        Orden orden2 = new Orden();
        orden2.agregarProductos(producto3);
        orden2.agregarProductos(producto1);
        orden2.agregarProductos(producto2);

        orden2.calcularTotal();
        orden2.mostrarOrden();

        Orden orden3 = new Orden();
        orden3.agregarProductos(producto2);
        orden3.agregarProductos(producto1);

        orden3.calcularTotal();
        orden3.mostrarOrden();

        Orden orde4 = new Orden();

    }
}
