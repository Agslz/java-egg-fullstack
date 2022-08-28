package Libreria.Persistencia;

import Libreria.Entidades.Libro;
import Libreria.Constantes.Constantes;
import java.util.List;

public class LibroDAOExt extends DAO<Libro> {

    //ToDo metodo borrar libro por su isbn y verficar querys de buscar libro por editorial y autor
    
    public List<Libro> obtenerTodosLosLibros() {
        try {
            conectar();
            List listaLibros = em.createQuery(Constantes.OBTENER_TODOS_LOS_LIBROS).getResultList();
            return listaLibros;
        } catch (Exception e) {
            System.out.println(e.toString());
            throw e;
        } finally {
            desconectar();
        }
    }

    public Libro obtenerLibroPorTitulo(String titulo) {
        try {
            conectar();
            Libro libro = (Libro) em.createQuery(Constantes.OBTENER_LIBRO_POR_TITULO).setParameter("titulo", titulo).getResultList();
            return libro;
        } catch (Exception e) {
            System.out.println(e.toString());
            throw e;
        } finally {
            desconectar();
        }
    }

    public Libro obtenerLibroPorISBN(Integer isbn) {
        try {
            conectar();
            Libro libro = (Libro) em.createQuery(Constantes.OBTENER_LIBRO_POR_ISBN).setParameter("isbn", isbn).getResultList();
            return libro;
        } catch (Exception e) {
            System.out.println(e.toString());
            throw e;
        } finally {
            desconectar();
        }
    }

    public Libro obtenerLibroPorEditorial(String editorial) {
        try {
            //ToDo verificar query editorial
            conectar();
            Libro libro = (Libro) em.createQuery(Constantes.OBTENER_LIBRO_POR_EDITORIAL).setParameter("EDITORIAL_id_editorial", editorial).getResultList();
            return libro;
        } catch (Exception e) {
            System.out.println(e.toString());
            throw e;
        } finally {
            desconectar();
        }
    }

    public Libro obtenerLibroPorAutor(String nombreAutor) {
        try {
            //ToDo verificar query nombre autor
            conectar();
            Libro libro = (Libro) em.createQuery(Constantes.OBTENER_LIBRO_POR_AUTOR).setParameter("AUTOR_id_autor", nombreAutor).getResultList();
            return libro;
        } catch (Exception e) {
            System.out.println(e.toString());
            throw e;
        } finally {
            desconectar();
        }
    }

    @Override
    public void guardar(Libro libro) {
        super.guardar(libro);
    }

    @Override
    public void editar(Libro libro) {
        super.editar(libro);
    }

}
