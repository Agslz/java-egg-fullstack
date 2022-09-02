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

    public List<Libro> mostrarTodosLosLibros() {
        return DAO.obtenerTodosLosLibros();
    }

    public String crearLibro(Long isbn, String titulo, Integer anio, Integer ejemplares, Autor autor, Editorial editorial) throws Exception {
        DAO.guardar(new Libro(isbn, titulo, anio, ejemplares, 0, ejemplares, Boolean.TRUE, autor, editorial));
        return Constantes.LIBRO_ANADIDO; 
    }

    public Autor pedirAutor(String nombre) throws Exception {
        try {
            Autor autor;
            do {
                autor = autorDAO.obtenerAutorPorNombre(nombre);
                if (autor == null) {
                    throw new Exception(Constantes.AUTOR_NO_ENCONTRADO);
                }
            } while (autor == null);
            return autor;
        } catch (Exception e) {
            throw e;
        }
    }

    public Editorial pedirEditorial(String nombre) throws Exception {
        try {
            Editorial editorial;
            do {
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

    public Libro mostrarLibroPorIsbn(String isbn) throws Exception {
        try {
            if (isbn == null) {
                throw new Exception(Constantes.ISBN_INVALIDO);
            }
            Libro libro = DAO.obtenerLibroPorISBN(isbn);
            if (libro == null) {
                throw new Exception(Constantes.LIBRO_NO_ENCONTRADO);
            }
            return libro;
        } catch (Exception e) {
            throw e;
        }
    }

    public Libro mostrarLibroPorTitulo(String titulo) throws Exception {
        try {
            if (titulo == null || titulo.trim().isEmpty()) {
                throw new Exception(Constantes.TITULO_LIBRO_INVALIDO);
            }
            Libro libro = DAO.obtenerLibroPorTitulo(titulo);

            if (libro == null) {
                throw new Exception(Constantes.LIBRO_NO_ENCONTRADO);
            }
            return libro;
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Libro> mostrarLibrosDeUnAutor(String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception(Constantes.NOMBRE_INVALIDO);
            }
            return DAO.obtenerLibrosPorAutor(nombre);
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Libro> mostrarLibrosDeUnaEditorial(String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception(Constantes.NOMBRE_INVALIDO);
            }
            return DAO.obtenerLibrosPorEditorial(nombre);
        } catch (Exception e) {
            throw e;
        }
    }

    public String darLibro(String titulo) throws Exception {
        try {
            Libro libro = mostrarLibroPorTitulo(titulo);
            if (libro == null || titulo.trim().isEmpty()) {
                throw new Exception(Constantes.LIBRO_NO_ENCONTRADO);
            }
            if (libro.getEjemplaresRestantes() == 0) {
                throw new Exception(Constantes.LIBROS_AGOTADOS);
            }
            libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() - 1);
            libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() + 1);
            DAO.editar(libro);
            return Constantes.LIBRO_PRESTADO;
        } catch (Exception e) {
            throw e;
        }
    }

    public String devolverLibro(String titulo) throws Exception {
        try {
            Libro libro = mostrarLibroPorTitulo(titulo);
            if (libro == null || titulo.trim().isEmpty()) {
                throw new Exception(Constantes.LIBRO_NO_ENCONTRADO);
            }
            if (libro.getEjemplaresPrestados() == 0) {
                throw new Exception(Constantes.LIBROS_LLENOS);
            }
            libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() + 1);
            libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() - 1);
            DAO.editar(libro);
            return Constantes.LIBRO_DEVUELTO;

        } catch (Exception e) {
            throw e;
        }
    }
}
