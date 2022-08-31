package Libreria.Persistencia;

import Libreria.Entidades.Autor;
import Libreria.Constantes.Constantes;
import java.util.List;

public final class AutorDAOExt extends DAO<Autor> {

    public List<Autor> mostrarTodosLosAutores() {
        conectar();
        List<Autor> listaAutores = em.createQuery(Constantes.OBTENER_TODOS_LOS_AUTORES).getResultList();
        desconectar();
        return listaAutores;
    }

    public Autor obtenerAutorPorID(String id) throws Exception {
        if (id == null) {
            throw new Exception(Constantes.ID_INVALIDO);
        }
        conectar();
        Autor autor = (Autor) em.createQuery(Constantes.OBTENER_AUTOR_POR_ID).setParameter("id", id).getSingleResult();
        desconectar();
        return autor;
    }

    public Autor obtenerAutorPorNombre(String nombre) throws Exception {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new Exception(Constantes.NOMBRE_INVALIDO);
        }
        conectar();
        Autor autor = (Autor) em.createQuery(Constantes.OBTENER_AUTOR_POR_NOMBRE).setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return autor;
    }

    public String DardeBajaAutor(String id) throws Exception {

        if (id == null) {
            throw new Exception(Constantes.ID_INVALIDO);
        }

        Autor autorBaja = obtenerAutorPorID(id);

        if (autorBaja == null || autorBaja.getAlta() == false) {
            throw new Exception(Constantes.AUTOR_NO_DISPONIBLE);
        }

        autorBaja.setAlta(false);
        super.editar(autorBaja);
        return Constantes.BAJA_AUTOR_EXITOSA;
    }

    public String darDeAltaAutor(String id) throws Exception {
        if (id == null) {
            throw new Exception(Constantes.ID_INVALIDO);
        }

        Autor autorAlta = obtenerAutorPorID(id);

        if (autorAlta == null || autorAlta.getAlta() == true) {
            throw new Exception(Constantes.AUTOR_DISPONIBLE);
        }

        autorAlta.setAlta(true);
        super.editar(autorAlta);
        return Constantes.ALTA_AUTOR_EXITOSA;
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
