package Libreria.Persistencia;

import Libreria.Entidades.Libro;
import Libreria.Constantes.Constantes;
import java.util.List;

public class LibroDAOExt extends DAO<Libro> {

    //ToDo verficar querys de buscar libro por editorial y autor
    public List<Libro> obtenerTodosLosLibros() {
        conectar();
        List listaLibros = em.createQuery(Constantes.OBTENER_TODOS_LOS_LIBROS).getResultList();
        desconectar();
        return listaLibros;

    }

    public Libro obtenerLibroPorTitulo(String titulo) {
        conectar();
        Libro libro = (Libro) em.createQuery(Constantes.OBTENER_LIBRO_POR_TITULO).setParameter("titulo", titulo).getResultList();
        desconectar();
        return libro;

    }

    public Libro obtenerLibroPorISBN(Integer isbn) {
        conectar();
        Libro libro = (Libro) em.createQuery(Constantes.OBTENER_LIBRO_POR_ISBN).setParameter("isbn", isbn).getResultList();
        desconectar();
        return libro;

    }

    public List<Libro> obtenerLibrosPorEditorial(String editorial) {
        //ToDo verificar query editorial
        conectar();
        List <Libro> listaLibros = em.createQuery(Constantes.OBTENER_LIBRO_POR_EDITORIAL).setParameter("EDITORIAL_id_editorial", editorial).getResultList();
        desconectar();
        return listaLibros;

    }

    public List<Libro> obtenerLibrosPorAutor(String nombreAutor) {
        //ToDo verificar query nombre autor
        conectar();
        List<Libro> listaLibros = em.createQuery(Constantes.OBTENER_LIBRO_POR_AUTOR).setParameter("AUTOR_id_autor", nombreAutor).getResultList();
        desconectar();
        return listaLibros;
    }
    
    public void EliminarLibroPorIsbn(Integer isbn) throws Exception{
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
