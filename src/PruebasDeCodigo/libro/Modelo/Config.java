package PruebasDeCodigo.libro.Modelo;

public class Config {

    public Libro crearLibro(){
        Libro libro1 = new Libro("El pajarillo sarniento", "Juan Manuel");
        return libro1;
    }

    public Libro configBook() {
        Libro libro2 = new Libro();
        libro2.setTitulo("los 3 tristres tigres");
        libro2.setAutor("Liovardo");

        return libro2;
    }
}
