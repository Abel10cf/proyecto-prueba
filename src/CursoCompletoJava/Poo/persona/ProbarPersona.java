package CursoCompletoJava.Poo.persona;

public class ProbarPersona {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Abel","Cortez");

        System.out.println(persona1.getNombre());
        persona1.setNombre("Joaquin");

        System.out.println(persona1.getNombre());


    }
}
