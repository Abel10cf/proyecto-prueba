package CursoCompletoJava.Metodos;

import java.util.Scanner;

public class GeneradorEmail {
    public static void main(String[] args) {

        System.out.println("*** Generador Email ***");
        generadorEmail();

    }

    static void generadorEmail(){

        Scanner in = new Scanner(System.in);

        System.out.print("Cuál es tu nombre?: ");
        String name = in.nextLine().toLowerCase();

        System.out.print("Cuál es tu apellido?: ");
        String lastName = in.nextLine().toLowerCase();

        String emailGenerado = name + "." + lastName + "@capgemini.com";

        System.out.println("Felicidades! Tu email es: " + emailGenerado);

    }
}
