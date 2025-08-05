package CursoCompletoJava.Poo.persona;

public class Persona {

    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    //    public static void main(String[] args) {
//        System.out.println("Creación de objetos de la clase persona");
//
//        Persona persona1 = new Persona();
//        persona1.nombre = "Abel";
//        persona1.apellido = "Cortez";
//        persona1.mostrarPersona();
//
//        Persona persona2 = new Persona();
//        persona2.nombre = "Ian";
//        persona2.apellido = "Gomez";
//        System.out.println();
//        persona2.mostrarPersona();
//    }
}
