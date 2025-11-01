package CursoCompletoJava.Exceptions;

public class MainExceptions {
    public static void main(String[] args) {

        try {
            double resultado = DivisionPorCeroException.divisionPorCeroUnchecked(10, 3);
            System.out.println("Resultado de la división: " + resultado);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Se revisó la división");
        }

    }
}
