import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Ingresa el nombre de la factura: ");
        String nameFactura = in.nextLine();

        System.out.print("Ingresa el precio del primer producto: ");
        double firstProduct = in.nextDouble();

        System.out.print("Ingresa el precio del segundo producto: ");
        double secondProduct = in.nextDouble();

        double totalBruto = firstProduct + secondProduct;

        double impuestoAgregado = totalBruto * 0.19;

        double montoTotal = totalBruto + impuestoAgregado;

        String mensajeCompleto = "La factura: " + nameFactura + " Tiene un total bruto de: "
                                 + totalBruto + " Con un impuesto de: " + impuestoAgregado
                                 + " y el monto después de impuesto es de: " + montoTotal;

        System.out.println(mensajeCompleto);

    }
}
