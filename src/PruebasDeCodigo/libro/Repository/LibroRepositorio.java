package PruebasDeCodigo.libro.Repository;

import PruebasDeCodigo.libro.Modelo.Libro;

public class LibroRepositorio {

    public void guardar(Libro libro){
        System.out.println("Libro guardado: " + libro.getTitulo());
    }
}
