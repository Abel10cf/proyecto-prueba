public class ArgumentosLineaComando {
    public static void main(String[] args) {

        String palabra = "hola mundo";
        System.out.println(palabra.length());

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumentos no: " + i + ": " + args[i]);
        }

    }
}
