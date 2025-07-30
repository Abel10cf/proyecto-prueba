package CursoCompletoJava.Ciclos;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        System.out.println("\uD83D\uDC7BCalculadora en Java☕");

        Scanner in = new Scanner(System.in);
        int opc;
        double valor1, valor2;

        boolean salir = false;

        while (!salir) {
            System.out.print("""
                    Menu:
                    1. Sumar
                    2. Restar
                    3. Multiplicar
                    4. Dividir
                    5. Salir
                    Escoge una opción:\s""");

            opc = in.nextInt();

            switch (opc) {
                case 1 -> {
                    System.out.print("Ingresa el valor 1: ");
                    valor1 = in.nextDouble();
                    System.out.print("Ingresa el valor 2: ");
                    valor2 = in.nextDouble();
                    System.out.println("El resultado de la suma es: " + (valor1 + valor2));
                }
                case 2 -> {
                    System.out.print("Ingresa el valor 1: ");
                    valor1 = in.nextDouble();
                    System.out.print("Ingresa el valor 2: ");
                    valor2 = in.nextDouble();
                    System.out.println("El resultado de la resta es: " + (valor1 - valor2));
                }
                case 3 -> {
                    System.out.print("Ingresa el valor 1: ");
                    valor1 = in.nextDouble();
                    System.out.print("Ingresa el valor 2: ");
                    valor2 = in.nextDouble();
                    System.out.println("El resultado de la multiplicación es: " + (valor1 * valor2));
                }
                case 4 -> {
                    System.out.print("Ingresa el valor 1: ");
                    valor1 = in.nextDouble();
                    System.out.print("Ingresa el valor 2: ");
                    valor2 = in.nextDouble();
                    if (valor2 != 0){
                        System.out.println("El resultado de la división es: " + (valor1 / valor2));
                    }else {
                        System.out.println("No puedes dividir entre 0");
                    }

                }
                case 5 -> {
                    System.out.println("Saliendo de la calculadora. Hasta pronto!\uD83D\uDC4B\uD83C\uDFFD");
                    salir = true;
                }
                default -> System.out.println("❌Opción no valida\uD83D\uDE14");
            }
            System.out.println();
        }

    }
}
