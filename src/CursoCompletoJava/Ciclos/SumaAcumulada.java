package CursoCompletoJava.Ciclos;

public class SumaAcumulada {
    public static void main(String[] args) {

        int j = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Proceso de suma -> " + j + " + " + i);


            System.out.println("Resultado: "+ (j += + i));

        }
    }
}
