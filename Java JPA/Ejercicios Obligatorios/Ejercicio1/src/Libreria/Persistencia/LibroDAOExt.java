package Libreria.Persistencia;

import Libreria.Entidades.Libro;
import Libreria.Constantes.Constantes;
import java.util.List;

public class LibroDAOExt extends DAO<Libro> {

    public List<Libro> obtenerTodosLosLibros() {
        conectar();
        List listaLibros = em.createQuery(Constantes.OBTENER_TODOS_LOS_LIBROS).getResultList();
        desconectar();
        return listaLibros;

    }

    public Libro obtenerLibroPorTitulo(String titulo) {
        conectar();
        Libro libro = (Libro) em.createQuery(Constantes.OBTENER_LIBRO_POR_TITULO).setParameter("titulo", titulo).getSingleResult();
        desconectar();
        return libro;

    }

    public Libro obtenerLibroPorISBN(String isbn) {
        conectar();
        Libro libro = (Libro) em.createQuery(Constantes.OBTENER_LIBRO_POR_ISBN).setParameter("isbn", isbn).getSingleResult();
        desconectar();
        return libro;

    }

    public List<Libro> obtenerLibrosPorEditorial(String nombre) {
        conectar();
        List <Libro> listaLibros = em.createQuery(Constantes.OBTENER_LIBRO_POR_EDITORIAL).setParameter("nombre", nombre).getResultList();
        desconectar();
        return listaLibros;

    }

    public List<Libro> obtenerLibrosPorAutor(String nombre) {
        conectar();
        List<Libro> listaLibros = em.createQuery(Constantes.OBTENER_LIBRO_POR_AUTOR).setParameter("nombre", nombre).getResultList();
        desconectar();
        return listaLibros;
    }
    
    public void EliminarLibroPorIsbn(String isbn) throws Exception{
        Libro libroBorrar = obtenerLibroPorISBN(isbn);
        if (isbn == null) {
            throw new Exception(Constantes.LIBRO_NO_ENCONTRADO);
        }
        System.out.println(Constantes.LIBRO_ELIMINADO);
        super.eliminar(libroBorrar);
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
