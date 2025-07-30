package CursoCompletoJava.Arreglos;

import java.util.Scanner;

public class PromedioDeCalificaciones {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Promedio de calificaciones");

        System.out.print("Cuantas calificaciones deseas agregar? ");
        int NumCalificaciones = in.nextInt();

        double[] calificaciones = new double[NumCalificaciones];

        double sumTotal = 0;
        double promedio;

        for (int i = 0; i < NumCalificaciones; i++) {

            System.out.print("Ingresa la calificación " + (i + 1) + ": ");
            calificaciones[i] = in.nextDouble();

            sumTotal += calificaciones[i];

        }

        promedio = sumTotal / NumCalificaciones;
        System.out.println("\nPromedio de las calificaciones: " + promedio);

    }
}
