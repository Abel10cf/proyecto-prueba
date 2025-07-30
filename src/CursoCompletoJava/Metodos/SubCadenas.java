package CursoCompletoJava.Metodos;

import java.util.Random;

public class SubCadenas {
    public static void main(String[] args) {

        String palabra = "Hola Mundo";

        String subCadena = palabra.substring(5, 10);
        System.out.println(subCadena);

        Random valorRandom = new Random();

        int numeroAleatorio = valorRandom.nextInt(100,201);

        while (numeroAleatorio != 199){
            System.out.println(numeroAleatorio);
            numeroAleatorio = valorRandom.nextInt(100,201);

            if (numeroAleatorio == 199) {
                System.out.println("Lo encontré bro, lo encontré :O " + numeroAleatorio);
            }
        }

    }
}
