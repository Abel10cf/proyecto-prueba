package ProyectoOrdenCompra;

import java.util.Date;

public class OrdenCompra {

    private static Integer identificador=1;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos = new Producto[4];
    private Integer idCompra;

    //Constructor que solo inicializa descripción y se asigna el id de la orden de compra
    public OrdenCompra(String descripcion) {
        this.idCompra = OrdenCompra.identificador++;
        this.descripcion = descripcion;
    }

    //Métodos getter para todos los atributos
    public Integer getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    //Métodos set para cliente y fecha
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    //Método get para obtener el Id
    public Integer getIdCompra() {
        return idCompra;
    }

    //Método para agregar productos a la orde de compra
    public void addProducto(Producto producto){
        boolean insertado = false;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] == null) {
                productos[i] = producto;
                System.out.println("Se agregó " + productos[i].getNombre() + " a tu carrito");
                insertado = true;
                break;
            }
        }
        if (!insertado){
            System.out.println("Ya llenaste el carrito Gordo, lo siento \uD83D\uDE14");
        }
    }

    //Método que calcula el total de la compra
    public void totalCompra() {
        boolean pagado = false;
        double sumTotal = 0;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                sumTotal += productos[i].getPrecio();
                pagado = true;
            }
        }
        if (!pagado) {
            System.out.println("No has ingresado productos");
        } else {
            System.out.printf("Total a pagar: %.2f%n", sumTotal);
        }
    }

}
