package PruebasDeCodigo.libro.Service;

import PruebasDeCodigo.libro.Modelo.Libro;
import PruebasDeCodigo.libro.Repository.LibroRepositorio;

public class LibroService {

    private LibroRepositorio libroRepositorio;

    public void actualizandoRepository(LibroRepositorio repository){
        this.libroRepositorio = repository;
    }

    public void guardarLibro(Libro libro){
        System.out.println("Guardando libro...");
        libroRepositorio.guardar(libro);
    }



}
