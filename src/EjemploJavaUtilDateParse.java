import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        SimpleDateFormat ejemploFormato = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date fecha = ejemploFormato.parse("2020-01-05");
            System.out.println("fecha = " + fecha);
            System.out.println("ejemploFormato.format(fecha) = " + ejemploFormato.format(fecha));

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
