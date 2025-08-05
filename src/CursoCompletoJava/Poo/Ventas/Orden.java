package CursoCompletoJava.Poo.Ventas;

import java.util.Arrays;

public class Orden {

    private final int idOrden;
    private Producto producto;
    private Producto[] productos = new Producto[5];
    //private final static int LIM_MAX = 5;
    private int contadorProductos;

    public Orden() {
        System.out.print("Id Orden: ");
        System.out.println(this.idOrden = contadorProductos);
    }

    public void agregarProductos(Producto producto){
        if (contadorProductos < productos.length) {
            productos[contadorProductos] = producto;
            contadorProductos++;
        }else {
            System.out.println("Arreglo lleno, ya no puedes agregar más productos");
        }
    }

    public void calcularTotal(){
        double sumTotal = 0;
        for (int i = 0; i < contadorProductos ; i++) {
            sumTotal += productos[i].getPrecio();
        }
        System.out.println("\ttotal de la orden: $" + sumTotal);
    }

    public void mostrarOrden(){
        System.out.println("\tProductos de la orden:");
        for (int i = 0; i < contadorProductos ; i++) {
            System.out.println("\t\t" + productos[i]);
        }
    }

    @Override
    public String toString() {
        return "Orden{" +
                "productos=" + Arrays.toString(productos) +
                ", contadorProductos=" + contadorProductos +
                '}';
    }
}
