import javax.swing.*;
import java.util.Scanner;

public class ObtencionNombreLargo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String nombreCompleto1 = JOptionPane.showInputDialog("Ingresa el primer nombre completo (nombre + apellido)");
        int tamanoCompleto1 = nombreCompleto1.replace(" ", "").length();
        System.out.println(tamanoCompleto1);

        String nombreCompleto2 = JOptionPane.showInputDialog("Ingresa el segundo nombre completo (nombre + apellido)");
        int tamanoCompleto2 = nombreCompleto2.replace(" ", "").length();
        System.out.println(tamanoCompleto2);

        String nombreCompleto3 = JOptionPane.showInputDialog("Ingresa el tercer nombre completo (nombre + apellido)");
        int tamanoCompleto3 =nombreCompleto3.replace(" ", "").length();
        System.out.println(tamanoCompleto3);

        if (tamanoCompleto1 > tamanoCompleto2 & tamanoCompleto1 > tamanoCompleto3){
            JOptionPane.showMessageDialog(null, nombreCompleto1 + " tiene el nombre más largo " + tamanoCompleto1);
        } else if (tamanoCompleto2 > tamanoCompleto1 & tamanoCompleto2 > tamanoCompleto3) {
            JOptionPane.showMessageDialog(null, nombreCompleto2 + " tiene el nombre más largo " + tamanoCompleto2);
        } else if (tamanoCompleto3 > tamanoCompleto1 & tamanoCompleto3 > tamanoCompleto2) {
            JOptionPane.showMessageDialog(null, nombreCompleto3 + " tiene el nombre más largo " + tamanoCompleto3);
        }
    }
}
