package Libreria.Persistencia;

import Libreria.Entidades.Editorial;
import Libreria.Constantes.Constantes;
import java.util.List;

public class EditorialDAOExt extends DAO<Editorial> {

    public List<Editorial> mostrarTodasLasEditoriales() {
        conectar();
        List<Editorial> listaEditoriales = em.createQuery(Constantes.OBTENER_TODAS_LAS_EDITORIALES).getResultList();
        desconectar();
        return listaEditoriales;
    }

    public Editorial obtenerEditorialPorID(String id) {
        conectar();
        Editorial editorial = (Editorial) em.createQuery(Constantes.OBTENER_EDITORIAL_POR_ID).setParameter("id", id).getSingleResult();
        desconectar();
        return editorial;
    }

    public Editorial obtenerEditorialPorNombre(String nombre) {
        conectar();
        Editorial editorial = (Editorial) em.createQuery(Constantes.OBTENER_EDITORIAL_POR_NOMBRE).setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return editorial;

    }

    public String darDeBajaEditorial(String id) throws Exception {

        if (id == null) {
            throw new Exception(Constantes.ID_INVALIDO);
        }

        Editorial editorialBaja = obtenerEditorialPorID(id);

        if (editorialBaja == null || editorialBaja.getAlta() == false) {
            throw new Exception(Constantes.EDITORIAL_NO_DISPONIBLE);
        }

        editorialBaja.setAlta(false);
        super.editar(editorialBaja);
        return Constantes.BAJA_EDITORIAL_EXITOSA;

    }

    public String darDeAltaEditorial(String id) throws Exception {

        if (id == null) {
            throw new Exception(Constantes.ID_INVALIDO);
        }

        Editorial editorialAlta = obtenerEditorialPorID(id);

        if (editorialAlta == null || editorialAlta.getAlta() == true) {
            throw new Exception(Constantes.EDITORIAL_DISPONIBLE);
        }

        editorialAlta.setAlta(true);
        super.editar(editorialAlta);
        return Constantes.ALTA_EDITORIAL_EXITOSA;
    }

    @Override
    public void guardar(Editorial editorial) {
        super.guardar(editorial);
    }

    @Override
    public void editar(Editorial editorial) {
        super.editar(editorial);
    }

}
