package CursoCompletoJava.Metodos;

import java.util.Random;
import java.util.Scanner;

public class GeneradorID {
    public static void main(String[] args) {

        generadorID();

    }

    static void generadorID() {

        Scanner in = new Scanner(System.in);
        Random numRandom = new Random();

        System.out.println("*** Generador de ID único ***");
        System.out.print("Cual es tu nombre: ");
        String name = in.nextLine().substring(0, 2).toUpperCase();
        System.out.print("Cual es tu apellido: ");
        String lastName = in.nextLine().substring(0, 2).toUpperCase();
        System.out.print("Cual es tu año de nacimiento (YYYY): ");
        String birthday = in.nextLine().substring(2, 4);

        int IdAleatorio = numRandom.nextInt(0, 9999);
        String IdUnico = name + lastName + birthday + IdAleatorio;


        System.out.println("Felicidades! Tu nuevo número de ID único es: " + IdUnico);

    }
}
