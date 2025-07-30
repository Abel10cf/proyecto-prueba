package CursoCompletoJava.Ciclos;

import java.util.Scanner;

public class Menu_Interactivo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("Menú: ");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Eliminar cuenta");
            System.out.println("3. Salir del sistema");
            System.out.print("Escoja una opción: ");
            opcion = in.nextInt();

            if (opcion == 1) {
                System.out.println("creando tu cuenta...\n");
            } else if (opcion == 2) {
                System.out.println("Eliminando tu cuenta...\n");
            } else if (opcion == 3){
                System.out.println("Saliendo del sistema. Hasta pronto...!");
            } else {
                System.out.println("Opción invalida\n");
            }


        } while (opcion != 3);

    }
}

