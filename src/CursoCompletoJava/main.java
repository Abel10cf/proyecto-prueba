package CursoCompletoJava;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        var entradaDeDatos = new Scanner(System.in);

        System.out.println("***Identificador de estación del año***");

        System.out.println("Ingresa el mes en número donde 1 es enero y 12 diciembre:");
        var mes = entradaDeDatos.nextInt();


        System.out.println(
                (mes == 1 || mes == 2 || mes == 12) ? "El mes pertenece a invierno ":
                (mes >= 3 && mes <= 5) ? "El mes pertenece a primavera" :
                (mes >= 6 && mes <= 8) ? "El mes pertenece a verano" :
                (mes >= 9 && mes <= 11) ? "El mes pertenece a otoño" :
                "Estación desconocida"
        );

    }
}