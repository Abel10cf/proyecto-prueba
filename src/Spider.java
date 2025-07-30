import java.util.*;
import java.util.function.Predicate;

@FunctionalInterface
interface Animal {
    boolean tesT(int n);
}

public class Spider {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Jhon", 25),
                new Person("Geo" +
                        "rge", 20),
                new Person("Ben", 30)
        );
        Collections.sort(people);
        System.out.println(people);

//        String[] names = new String[] {"jhon", "George", "Luke"};
//
//        List<String> nameAsList = Arrays.asList(names);
//        List<String> nameOf = List.of(names);
//        List<String> namesCopyOf = List.copyOf(nameAsList);
//
//        //names[1] = "Ben";
//
//
//        System.out.println(nameAsList);
//        System.out.println(nameOf);
//        System.out.println(namesCopyOf);
//
//        nameAsList.add("Mike");



    }
}