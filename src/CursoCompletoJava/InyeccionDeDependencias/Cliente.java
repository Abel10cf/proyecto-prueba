package CursoCompletoJava.InyeccionDeDependencias;

public class Cliente {

    public Servicio servicio;
    public int edad;

    /*public Cliente(Servicio servicio) {
        this.servicio = servicio;
    }*/

    public void realizarTarea(){
        servicio.ejecutar();
    }
}
