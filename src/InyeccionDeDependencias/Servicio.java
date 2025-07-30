package InyeccionDeDependencias;

import java.util.*;

public class Servicio {
    public static void main(String[] args) {

        Map<Integer, Cliente> probandoMap = new HashMap<>();

        probandoMap.put(1, new Cliente(1, "Melchor", "Cortez"));
        probandoMap.put(5, new Cliente(2,"Gricelda","Flores"));

        for (Integer cMap : probandoMap.keySet()){
            System.out.println(cMap);
        }

        System.out.println("________________");


        List<Cliente> probandoCliente = new LinkedList<>();
        probandoCliente.add(new Cliente(1, "Daniel", "Cortez"));
        probandoCliente.add(new Cliente(2, "Eduardo", "sancho"));


        if (probandoCliente.isEmpty()) {
            System.out.println("No hay nada agregado a la lista");
        } else {
            for (Cliente c : probandoCliente) {
                System.out.println(c);
            }
        }


    }
}