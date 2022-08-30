package Libreria.Servicios;

import Libreria.Entidades.*;
import Libreria.Persistencia.LibroDAOExt;
import Libreria.Constantes.Constantes;
import Libreria.Persistencia.AutorDAOExt;
import Libreria.Persistencia.EditorialDAOExt;
import java.util.List;
import java.util.Scanner;

public class LibroServicios {

    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private final LibroDAOExt DAO = new LibroDAOExt();
    private final AutorDAOExt autorDAO = new AutorDAOExt();
    private final EditorialDAOExt editorialDAO = new EditorialDAOExt();

    public void mostrarTodosLosLibros() {
        DAO.obtenerTodosLosLibros().forEach(System.out::println);
    }

    public void guardarLibro() throws Exception {
        DAO.guardar(crearLibro());
        System.out.println(Constantes.LIBRO_ANADIDO);
    }

    public Libro crearLibro() throws Exception {

        Libro libro = new Libro();

        System.out.println(Constantes.INGRESE_ISBN);
        libro.setIsbn(leer.nextLong());

        System.out.println(Constantes.INGRESE_TITULO);
        libro.setTitulo(leer.next());

        System.out.println(Constantes.INGRESE_ANIO_LANZAMIENTO);
        libro.setAnio(leer.nextInt());

        System.out.println(Constantes.INGRESE_COPIAS_LIBROS);
        Integer copias = leer.nextInt();
        libro.setEjemplares(copias);
        libro.setEjemplaresRestantes(copias);
        libro.setEjemplaresPrestados(0);
        libro.setAlta(Boolean.TRUE);

        Autor autor = pedirAutor();
        libro.setAutor(autor);

        Editorial editorial = pedirEditorial();
        libro.setEditorial(editorial);

        return libro;
    }

    private Autor pedirAutor() throws Exception {
        Autor autor;
        String nombre;

        try {
            do {
                System.out.println(Constantes.INGRESE_NOMBRE_AUTOR);
                nombre = leer.next();
                autor = autorDAO.obtenerAutorPorNombre(nombre);
                if (autor == null) {
                    throw new Exception(Constantes.AUTOR_NO_ENCONTRADO);
                }
            } while (autor == null);
            return autor;

        } catch (Exception e) {
            System.out.println(Constantes.ERROR);
            System.out.println(e.toString());
            return null;
        }

    }

    private Editorial pedirEditorial() throws Exception {
        try {
            Editorial editorial;
            String nombre;
            do {
                System.out.println(Constantes.INGRESE_NOMBRE_EDITORIAL);
                nombre = leer.next();
                editorial = editorialDAO.obtenerEditorialPorNombre(nombre);
                if (editorial == null) {
                    throw new Exception(Constantes.EDITORIAL_NO_ENCONTADA);
                }
            } while (editorial == null);
            return editorial;

        } catch (Exception e) {
            System.out.println(Constantes.ERROR);
            System.out.println(e.toString());
            return null;
        }
    }

    public void mostrarLibroPorIsbn() {
        try {
            System.out.println(Constantes.INGRESE_ISBN);
            String isbn = leer.next();

            if (isbn == null) {
                throw new Exception(Constantes.ISBN_INVALIDO);
            }

            Libro libro = DAO.obtenerLibroPorISBN(isbn);

            if (libro == null) {
                throw new Exception(Constantes.LIBRO_NO_ENCONTRADO);
            }

            System.out.println(libro);

        } catch (Exception e) {
            System.out.println(Constantes.ERROR);
            System.out.println(e.toString());
        }

    }

    public void mostrarLibroPorTitulo() {
        try {
            System.out.println(Constantes.INGRESE_TITULO);
            String titulo = leer.next();

            if (titulo == null || titulo.trim().isEmpty()) {
                throw new Exception(Constantes.TITULO_LIBRO_INVALIDO);
            }
            Libro libro = DAO.obtenerLibroPorTitulo(titulo);

            if (libro == null) {
                throw new Exception(Constantes.LIBRO_NO_ENCONTRADO);
            }
            System.out.println(libro);

        } catch (Exception e) {
            System.out.println(Constantes.ERROR);
            System.out.println(e.toString());
        }
    }

    public void mostrarLibrosDeUnAutor() {
        try {
            System.out.println(Constantes.INGRESE_NOMBRE_AUTOR);
            String nombre = leer.next();
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception(Constantes.NOMBRE_INVALIDO);
            }
            List<Libro> listaLibros = DAO.obtenerLibrosPorAutor(nombre);
            listaLibros.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(Constantes.ERROR);
            System.out.println(e.toString());
        }

    }

    public void mostrarLibrosDeUnaEditorial() {
        try {
            System.out.println(Constantes.INGRESE_NOMBRE_EDITORIAL);
            String nombre = leer.next();
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception(Constantes.NOMBRE_INVALIDO);
            }
            List<Libro> listaLibros = DAO.obtenerLibrosPorEditorial(nombre);
            listaLibros.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(Constantes.ERROR);
            System.out.println(e.toString());
        }
    }

    public void darLibro() throws Exception {
        try {
            System.out.println(Constantes.INGRESE_TITULO);
            String titulo = leer.next();

            Libro libro = DAO.obtenerLibroPorTitulo(titulo);

            if (libro == null || titulo.trim().isEmpty()) {
                throw new Exception(Constantes.LIBRO_NO_ENCONTRADO);
            }

            if (libro.getEjemplaresRestantes() == 0) {
                throw new Exception(Constantes.LIBROS_AGOTADOS);
            }

            libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() - 1);
            libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() + 1);
            System.out.println(Constantes.LIBRO_PRESTADO);
            DAO.editar(libro);

        } catch (Exception e) {
            System.out.println(Constantes.ERROR);
            System.out.println(e.toString());
        }
    }

    public void devolverLibro() throws Exception {
        try {
            System.out.println(Constantes.INGRESE_TITULO);
            String titulo = leer.next();

            Libro libro = DAO.obtenerLibroPorTitulo(titulo);

            if (libro == null || titulo.trim().isEmpty()) {
                throw new Exception(Constantes.LIBRO_NO_ENCONTRADO);
            }

            if (libro.getEjemplaresPrestados() == 0) {
                throw new Exception(Constantes.LIBROS_LLENOS);
            }

            libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() + 1);
            libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() - 1);
            System.out.println(Constantes.LIBRO_DEVUELTO);
            DAO.editar(libro);
            
        } catch (Exception e) {
            System.out.println(Constantes.ERROR);
            System.out.println(e.toString());
        }
    }
}
