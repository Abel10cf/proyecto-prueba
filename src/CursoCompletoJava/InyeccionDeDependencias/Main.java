package CursoCompletoJava.InyeccionDeDependencias;

public class Main {
    public static void main(String[] args) {

        Servicio servicio = new ServicioImpl();
        Cliente cliente = new Cliente();
        cliente.servicio = servicio;
        cliente.edad = 28;


        cliente.realizarTarea();
        //cliente2.realizarTarea();
    }
}
