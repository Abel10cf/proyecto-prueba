package CursoCompletoJava.Poo;

import java.util.Scanner;

public class Aritmetica {

    int operando1;
    int operando2;

    void sumar(){
        int resultado = operando1 + operando2;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    void restar(){
        int resultado = operando1 - operando2;
        System.out.println("El resultado de la resta es: " + resultado);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Aritmetica operacion1 = new Aritmetica();
        System.out.print("Ingresa el valor de operando1: ");
        int oper = in.nextInt();
        operacion1.operando1 = oper;

        System.out.print("Ingresa el valor de operando 2: ");
        int oper2 = in.nextInt();
        operacion1.operando2 = oper2;

        operacion1.sumar();
        operacion1.restar();

        Aritmetica operacion2 = new Aritmetica();
        System.out.print("Ingresa el valor de operando1 objeto2: ");
        int obj2Operando1 = in.nextInt();
        operacion2.operando1 = obj2Operando1;

        System.out.print("Ingresa el valor de operando 2 objeto 2: ");
        int obj2Operando2 = in.nextInt();
        operacion2.operando2 = obj2Operando2;

        operacion2.sumar();
        operacion2.restar();

    }

}

