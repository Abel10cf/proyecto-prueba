import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

class Mammal {
    public void miPrueba(int n, Predicate<Integer> predicate) {

        if (predicate.test(n)) {
            System.out.println("Has pasado la prueba");
        } else {
            System.out.println("No has pasado la prueba");
        }
    }

    public class MyClass {
        public static void main(String[] args) {

            Collection<Object> names = new ArrayList<>();
            System.out.println(names.add("Jhon"));


        }
    }
}