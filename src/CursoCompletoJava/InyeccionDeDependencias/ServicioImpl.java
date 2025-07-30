package CursoCompletoJava.InyeccionDeDependencias;

public class ServicioImpl implements Servicio{
    @Override
    public void ejecutar() {
        System.out.println("Ejecutando servicio...");
    }
}
