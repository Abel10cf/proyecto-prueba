public class CalculadoraArgumentosLineaComando {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        switch (args[2]) {
            case "suma" -> {
                System.out.println("Suma: " + (a + b));
            }
            case "resta" -> {
                System.out.println("Resta: " + (a - b));
            }
            case "multi" -> {
                System.out.println("Resta: " + (a * b));
            }
            case "div" -> {
                if (b == 0){
                    System.out.println("No se puede dividir entre 0");
                    System.exit(-1);
                }
                System.out.println("Resta: " + (a / b));
            }


        }
    }
}
