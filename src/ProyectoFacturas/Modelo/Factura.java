package ProyectoFacturas.Modelo;

import java.util.Date;

public class Factura {

    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;
    public static final int MAX_ITEMS = 4;
    private static int contador;
    public String nombre;

    public Factura() {
    }

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.folio = ++contador;
        this.fecha = new Date();
    }

    public int getFolio() {
        return folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void addItemFactura(ItemFactura item){
        if (indiceItems < MAX_ITEMS) {
            this.items[indiceItems++] = item;
        }
    }

    public double cuentaTotal() {
        double total = 0;

        for (int i = 0; i < MAX_ITEMS; i++) {
            if (items[i] != null) {
                total += items[i].calcularImporte();
            }
        }
        return total;
    }

    public String detalleCompra(){
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < MAX_ITEMS; i++) {

            if (items[i] != null){
                sb.append("\nfolio: ")
                        .append(folio)
                        .append("\nCliente: ")
                        .append(this.cliente.getNombre())
                        .append("\t NIF: ")
                        .append(cliente.getNif())
                        .append("\tDescripción: ")
                        .append(descripcion)
                        .append("\n#" + items[i].getProducto().getCodigo() + "\tNombre: " + items[i].getProducto().getNombre() + "\tCant: " + items[i].getCantidad() + "\tTotal: " + items[i].calcularImporte() +"\n");

            }
        }

        return sb.toString();
    }

}
