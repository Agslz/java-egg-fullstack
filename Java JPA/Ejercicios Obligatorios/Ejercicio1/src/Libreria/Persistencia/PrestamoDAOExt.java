package Libreria.Persistencia;

import Libreria.Constantes.Constantes;
import Libreria.Entidades.Prestamo;
import java.util.List;

public class PrestamoDAOExt extends DAO<Prestamo> {

    public Prestamo buscarPrestamosPorDNICliente(String DNI) {
        conectar();
        Prestamo prestamo = (Prestamo) em.createQuery(Constantes.OBTENER_PRESTAMO_POR_DNI).setParameter("DNI", DNI).getSingleResult();
        desconectar();
        return prestamo;
    }

    public Prestamo buscarPorNombreDeLibro(String titulo) {
        conectar();
        Prestamo prestamo = (Prestamo) em.createQuery(Constantes.OBTENER_PRESTAMO_POR_NOMBRE_LIBRO).setParameter("titulo", titulo).getSingleResult();
        desconectar();
        return prestamo;
    }

    public List<Prestamo> mostrarTodosLosPrestamos() {
        conectar();
        List<Prestamo> listaPrestamos = em.createQuery(Constantes.OBTENER_TODOS_LOS_PRESTAMOS).getResultList();
        desconectar();
        return listaPrestamos;
    }

    @Override
    public void guardar(Prestamo prestamo) {
        super.guardar(prestamo);
    }

    @Override
    public void editar(Prestamo prestamo) {
        super.editar(prestamo);
    }

}
