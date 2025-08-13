import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Ingresa el nombre del primer integrante de tu familia: ");
        String nombre1 = in.nextLine();

        System.out.print("Ingresa el nombre del segundo integrante de tu familia: ");
        String nombre2 = in.nextLine();

        System.out.print("Ingresa el nombre del tercer integrante de tu familia: ");
        String nombre3 = in.nextLine();

        nombre1 = nombre1.substring(1,2).toUpperCase().concat(".").concat(nombre1.substring(nombre1.length()-2));
        nombre2 = nombre2.substring(1,2).toUpperCase().concat(".").concat(nombre2.substring(nombre2.length()-2));
        nombre3 = nombre3.substring(1,2).toUpperCase().concat(".").concat(nombre3.substring(nombre3.length()-2));

        String resultado = nombre1 + "_" + nombre2 + "_"+ nombre3;
        System.out.println(resultado);

    }
}
