import java.util.Scanner;

public class ProgramaOrdenarNumeros {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = in.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = in.nextInt();

        if (numero2 > numero1) {
            System.out.println(numero2 + ", " + numero1);
        } else {
            System.out.println(numero1 + ", " + numero2);
        }
    }
}
