package PruebasDeCodigo;

public class Metodos {

    private String nombre;
    private Integer edad;
    private Integer id;

    public Metodos() {
    }

    public Metodos(String nombre, Integer edad, Integer id) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
