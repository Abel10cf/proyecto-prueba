package CursoCompletoJava.Arreglos;

public class Arreglo1 {
    public static void main(String[] args) {

       int [] prueba = new int[5];

        for (int i = 0; i < prueba.length; i++) {

            prueba[i] = i + 1;
            System.out.println(prueba[i]);
        }

        System.out.println( "*************************");
        // SINTAXIS SIMPLIFICADA PARA LA CREACIÓN E INICIALIZACIÓN DE UN ARREGLO

        int [] enteros = {100, 250, 300, 347, 500}; // sintaxis simplificada

        for (int recorridoDeIndice : enteros) {
            System.out.println(recorridoDeIndice);
        }
    }
}
