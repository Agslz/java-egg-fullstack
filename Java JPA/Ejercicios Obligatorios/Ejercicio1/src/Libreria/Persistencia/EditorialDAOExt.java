package Libreria.Persistencia;

import Libreria.Entidades.Editorial;
import Libreria.Constantes.Constantes;
import java.util.List;

public class EditorialDAOExt extends DAO<Editorial> {

    public Integer contarEditoriales() {
        return em.createQuery(Constantes.CONTAR_EDITORIALES).getFirstResult();
    }

    public List<Editorial> mostrarTodasLasEditoriales() {
        conectar();
        List<Editorial> listaEditoriales = em.createQuery(Constantes.OBTENER_TODAS_LAS_EDITORIALES).getResultList();
        desconectar();
        return listaEditoriales;
    }

    public Editorial obtenerEditorialPorID(Integer id) {
        conectar();
        Editorial editorial = (Editorial) em.createQuery(Constantes.OBTENER_EDITORIAL_POR_ID).setParameter("id", id).getResultList();
        desconectar();
        return editorial;
    }

    public Editorial obtenerEditorialPorNombre(String nombre) {
        conectar();
        Editorial editorial = (Editorial) em.createQuery(Constantes.OBTENER_EDITORIAL_POR_NOMBRE).setParameter("nombre", nombre).getResultList();
        desconectar();
        return editorial;

    }

    public void darDeBajaEditorial(Integer id) throws Exception {

        if (id == null || id <= 0) {
            throw new Exception(Constantes.ID_INVALIDO);
        }

        Editorial editorialBaja = obtenerEditorialPorID(id);

        if (editorialBaja == null || editorialBaja.getAlta() == false) {
            throw new Exception(Constantes.EDITORIAL_NO_DISPONIBLE);
        }

        System.out.println(Constantes.BAJA_EDITORIAL_EXITOSA);

        editorialBaja.setAlta(false);
        super.editar(editorialBaja);

    }

    public void darDeAltaEditorial(Integer id) throws Exception {

        if (id == null || id <= 0) {
            throw new Exception(Constantes.ID_INVALIDO);
        }

        Editorial editorialAlta = obtenerEditorialPorID(id);

        if (editorialAlta == null || editorialAlta.getAlta() == true) {
            throw new Exception(Constantes.EDITORIAL_DISPONIBLE);
        }

        System.out.println(Constantes.ALTA_EDITORIAL_EXITOSA);

        editorialAlta.setAlta(true);
        super.editar(editorialAlta);
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
