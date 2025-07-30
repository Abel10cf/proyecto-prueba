package CursoCompletoJava.Matrices;

import java.util.Scanner;

public class EjercicioSumaDiagonal {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Proporciona las filas: ");
        int filas = in.nextInt();

        System.out.print("Proporciona las columnas: ");
        int columnas = in.nextInt();

        int[][] matriz = new int[filas][columnas];

        int sumaDiagonal = 0;


        //Solicitar los valores
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                //Ingresamos los valores de nuestra matriz
                System.out.print("Valor [" + i + "]" + "[" + j + "] = ");
                matriz[i][j] = in.nextInt();

                // hacemos la condición para que la suma se lleve a cabo
                if (i == j) {
                    sumaDiagonal += matriz[i][j];
                }
            }
        }

        System.out.println("\nSuma diagonal: " + sumaDiagonal);

    }
}