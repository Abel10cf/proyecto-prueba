package CursoCompletoJava.Ciclos;

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {

        System.out.println("\uD83D\uDC7BCajero\uD83E\uDD11Automático\uD83D\uDC7B");

        Scanner in = new Scanner(System.in);
        int opc;

        double saldoTotal = 1350.50;

        boolean salir = false;
        double deposito;

        while (!salir) {
            System.out.print("""
                    Menu:
                    1. Consultar saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoge una opción:\s""");

            opc = in.nextInt();

            switch (opc) {
                case 1 -> System.out.println("Tu saldo actual es de: $" + saldoTotal);
                case 2 -> {
                    System.out.print("Ingresa el monto a retirar: ");
                    double retirar = in.nextDouble();
                    if (retirar <= saldoTotal){
                        saldoTotal -= retirar;
                        System.out.println("Tu nuevo saldo es: $" + saldoTotal);
                    }else {
                        System.out.println("No cuentas con suficiente saldo\uD83D\uDE14");
                    }

                }
                case 3 -> {
                    System.out.print("Ingresa el monto a depositar: ");
                    deposito = in.nextDouble();
                    saldoTotal += deposito;
                    System.out.println("Tu nuevo saldo es: $" + saldoTotal);
                }
                case 4 -> {
                    System.out.println("Saliendo del cajero. Hasta pronto!\uD83D\uDC4B\uD83C\uDFFD");
                    salir = true;
                }
                default -> System.out.println("❌Opción no valida\uD83D\uDE14");
            }
            System.out.println();
        }
    }
}
