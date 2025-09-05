import java.util.Scanner;

public class MedidoDeGasolina {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Ingresa la medida actual del tanque de gasolina: ");
        double medida = in.nextDouble();

        if (medida == 70) {
            System.out.println("Estanque lleno");
        } else if (medida >= 60 & medida < 70) {
            System.out.println("Estanque casi lleno");
        } else if (medida >= 40 & medida < 60) {
            System.out.println("Estanque 3/4");
        } else if (medida >= 35 & medida < 40) {
            System.out.println("Medio estanque");
        } else if (medida >= 20 & medida < 35) {
            System.out.println("Suficiente");
        } else if (medida >= 1 & medida < 20) {
            System.out.println("insuficiente");
        }
    }
}
