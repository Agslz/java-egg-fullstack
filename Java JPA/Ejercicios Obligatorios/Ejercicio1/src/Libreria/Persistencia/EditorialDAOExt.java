package Libreria.Persistencia;

import Libreria.Entidades.Editorial;
import Libreria.Constantes.Constantes;
import java.util.List;

public class EditorialDAOExt extends DAO<Editorial> {

    //ToDo Hacer metodo para dar de alta o baja una editorial y verificar si la editorial existe
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

    @Override
    public void guardar(Editorial editorial) {
        super.guardar(editorial);
    }

    @Override
    public void editar(Editorial editorial) {
        super.editar(editorial);
    }

}
