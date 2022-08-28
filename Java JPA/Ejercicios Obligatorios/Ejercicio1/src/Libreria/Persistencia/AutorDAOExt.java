package Libreria.Persistencia;

import Libreria.Entidades.Autor;
import Libreria.Constantes.Constantes;
import java.util.List;

public class AutorDAOExt extends DAO<Autor> {

    ///ToDo Hacer metodo para dar de alta o baja un autor y verificar si el autor existe
    
    public List<Autor> mostrarTodosLosAutores() {
        try {
            conectar();
            List<Autor> listaAutores = em.createQuery(Constantes.OBTENER_TODOS_LOS_AUTORES).getResultList();
            return listaAutores;
        } catch (Exception e) {
            System.out.println(e.toString());
            throw e;
        } finally {
            desconectar();
        }
    }

    public Autor obtenerAutorPorID(Integer id) {
        try {
            conectar();
            Autor autor = (Autor) em.createQuery(Constantes.OBTENER_AUTOR_POR_ID).setParameter("id", id).getResultList();
            return autor;
        } catch (Exception e) {
            System.out.println(e.toString());
            throw e;
        } finally {
            desconectar();
        }
    }

    public Autor obtenerAutorPorNombre(String nombre) {
        try {
            conectar();
            Autor autor = (Autor) em.createQuery(Constantes.OBTENER_AUTOR_POR_NOMBRE).setParameter("nombre", nombre).getResultList();
            return autor;
        } catch (Exception e) {
            System.out.println(e.toString());
            throw e;
        } finally {
            desconectar();
        }
    }

    @Override
    public void guardar(Autor autor) {
        super.guardar(autor);
    }

    @Override
    public void editar(Autor autor) {
        super.editar(autor);
    }

}
