package PruebasDeCodigo;

import PruebasDeCodigo.libro.Modelo.Config;
import PruebasDeCodigo.libro.Modelo.Libro;
import PruebasDeCodigo.libro.Repository.LibroRepositorio;
import PruebasDeCodigo.libro.Service.LibroService;

public class main {
    public static void main(String[] args) {

//        int edad;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Ingresa tu edad");
//        edad = scanner.nextInt();
//
//        if (edad >= 18) {
//            System.out.println("Ya eres mayor de edad");
//        }else {
//            System.out.println("Aun eres un peque");
//        }

        LibroRepositorio libroRepositorio = new LibroRepositorio();
        LibroService libroService = new LibroService();
        Libro libroNuevo = new Libro("hay nanita", "Abel el indomable");

        libroService.actualizandoRepository(libroRepositorio);
        libroService.guardarLibro(libroNuevo);

        Config config = new Config();
        config.configBook();


    }
}
