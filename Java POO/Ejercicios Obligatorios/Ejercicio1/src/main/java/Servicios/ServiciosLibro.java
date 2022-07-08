package Servicios;

import Entidades.Libro;
import java.util.Scanner;

public class ServiciosLibro {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro cargarLibro() {

        Libro M = new Libro();

        System.out.println("Ingrese el nombre del autor");
        M.setAutor(leer.next());

        System.out.println("Ingrese el titulo del libro");
        M.setTitulo(leer.next());

        System.out.println("Ingrese el ISBN del libro");
        M.setIsbn(leer.nextInt());

        System.out.println("Ingrese la cantidad de paginas del libro");
        M.setNumeroPaginas(leer.nextInt());

        return M;

    }

    public void mostrarLibro(Libro M) {

        System.out.println("El nombre del autor es: " + M.getAutor());
        System.out.println("El titulo del libro es: " + M.getTitulo());
        System.out.println("EL ISBN del libro es : " + M.getIsbn());
        System.out.println("La cantidad de paginas del libro son: " + M.getNumeroPaginas());

    }

}
