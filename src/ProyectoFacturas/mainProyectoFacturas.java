package ProyectoFacturas;

import ProyectoFacturas.Modelo.Cliente;
import ProyectoFacturas.Modelo.Factura;
import ProyectoFacturas.Modelo.ItemFactura;
import ProyectoFacturas.Modelo.Producto;

public class mainProyectoFacturas {
    public static void main(String[] args) {

        //Se crean dos productos
        Producto producto1 = new Producto("cloralex", 12.5);
        Producto producto2 = new Producto("Axe Desodorante", 56.98);

        //Se crean dos facturas unitarias y a cada una se le pasan la cantidad de los productos comprados
        ItemFactura facturaUnitaria = new ItemFactura(2, producto1);
        ItemFactura facturaUnitaria2 = new ItemFactura(3, producto2);

        //se crea un cliente
        Cliente cliente = new Cliente("Abel", "cofa827");
        Cliente cliente2 = new Cliente("Daniel", "jejeje");

        //Se crea una factura donde contiene toda la información de la compra
        Factura facturaCompleta = new Factura("Probando el tipo de factura", cliente);
        Factura facturaCompleta2 = new Factura("Probando el tipo de factura", cliente2);

        //Se agregan las facturas unitarias a la factura principal
        facturaCompleta.addItemFactura(facturaUnitaria);
        facturaCompleta.addItemFactura(facturaUnitaria2);

        System.out.println("Pagar por el producto " + facturaUnitaria.getProducto().getNombre() + " $" + facturaUnitaria.calcularImporte());
        System.out.println("Pagar por el producto " + facturaUnitaria2.getProducto().getNombre() + " $" +facturaUnitaria2.calcularImporte());


        System.out.println("El total a pagar por todo es de: $" + facturaCompleta.cuentaTotal());

        System.out.println(facturaCompleta.detalleCompra());


    }
}
