package Libreria.Persistencia;

import Libreria.Entidades.Autor;
import Libreria.Constantes.Constantes;
import java.util.List;

public class AutorDAOExt extends DAO<Autor> {

    ///ToDo Hacer metodo para dar de alta o baja un autor y verificar si el autor existe
    public List<Autor> mostrarTodosLosAutores() {
        conectar();
        List<Autor> listaAutores = em.createQuery(Constantes.OBTENER_TODOS_LOS_AUTORES).getResultList();
        desconectar();
        return listaAutores;
    }

    public Autor obtenerAutorPorID(Integer id) {
        conectar();
        Autor autor = (Autor) em.createQuery(Constantes.OBTENER_AUTOR_POR_ID).setParameter("id", id).getResultList();
        desconectar();
        return autor;
    }

    public Autor obtenerAutorPorNombre(String nombre) {
        conectar();
        Autor autor = (Autor) em.createQuery(Constantes.OBTENER_AUTOR_POR_NOMBRE).setParameter("nombre", nombre).getResultList();
        desconectar();
        return autor;
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
