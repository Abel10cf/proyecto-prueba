package CursoCompletoJava;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        var entradaDeDatos = new Scanner(System.in);

        //Opción para que el usuario ingresa datos mediante una ventana
        String inDatos = JOptionPane.showInputDialog("Ingresa el mes en número donde 1 es enero y 12 diciembre:");
        int meS = Integer.parseInt(inDatos);

        System.out.println("***Identificador de estación del año***");

//        System.out.println("Ingresa el mes en número donde 1 es enero y 12 diciembre:");
//        var mes = entradaDeDatos.nextInt();


//        System.out.println(
//                (meS == 1 || meS == 2 || meS == 12) ? "El mes pertenece a invierno ":
//                (meS >= 3 && meS <= 5) ? "El mes pertenece a primavera" :
//                (meS >= 6 && meS <= 8) ? "El mes pertenece a verano" :
//                (meS >= 9 && meS <= 11) ? "El mes pertenece a otoño" :
//                "Estación desconocida"
//        );

        //Se agrega otra opción para mandar la respuesta en una ventana
        JOptionPane.showMessageDialog(null,
                (meS == 1 || meS == 2 || meS == 12) ? "El mes pertenece a invierno ":
                (meS >= 3 && meS <= 5) ? "El mes pertenece a primavera" :
                (meS >= 6 && meS <= 8) ? "El mes pertenece a verano" :
                (meS >= 9 && meS <= 11) ? "El mes pertenece a otoño" :
                "Estación desconocida"
        );

    }
}