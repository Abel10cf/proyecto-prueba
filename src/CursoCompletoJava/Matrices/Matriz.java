package CursoCompletoJava.Matrices;

public class Matriz {
    public static void main(String[] args) {

        //Definir constantes
        final int FILAS = 2;
        final int COLUMNAS = 3;

        //Definimos la matriz
        int [][] matriz = new int[FILAS][COLUMNAS];

        //Llenado de matriz
        matriz [0][0] = 100;
        matriz [0][1] = 200;
        matriz [0][2] = 300;
        matriz [1][0] = 400;
        matriz [1][1] = 500;
        matriz [1][2] = 600;

        // Recorrido de matriz en FILAS
        for (int i = 0; i < FILAS ; i++) {
            // Recorrido de matriz en COLUMNAS
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.println("Valor [" + i + "] [" + j + "] = " + matriz[i][j]);
            }
        }

        System.out.println("");

        // SINTAXIS SIMPLIFICADA DE MATRIZ
        int[][] matriz2 = {{100,200,300},{400,500,600}};

        // Recorrido de matriz en FILAS
        for (int i = 0; i < matriz2.length ; i++) {
            // Recorrido de matriz en COLUMNAS
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.println("Valor [" + i + "] [" + j + "] = " + matriz[i][j]);
            }
        }

    }
}
