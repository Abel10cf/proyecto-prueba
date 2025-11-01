package CursoCompletoJava.Exceptions;

public class DivisionPorCeroException {

    // Excepción en tiempo de ejecución (unchecked)
    // Se vuelve excepción no verificada cuando agregamos el tipo de excepción, en este caso de ArithmeticException
    public static double divisionPorCeroUnchecked(double numerador, double denominador){
        if (denominador == 0){
            throw new ArithmeticException("No se puede dividir entre 0");
        }
        return numerador /denominador;
    }

    // Excepción en tiempo de compilación (checked)
    // Se vuelve excepción verificada cuando solo agregamos la excepción general y no una especifica
    public static double divisionPorCeroChecked(double numerador, double denominador) throws Exception{
        if (denominador == 0){
            throw new Exception("No se puede dividir entre 0");
        }
        return numerador /denominador;
    }
}
