package Libreria.Persistencia;

import Libreria.Entidades.Cliente;
import Libreria.Constantes.Constantes;
import java.util.List;

public class ClienteDAOExt extends DAO<Cliente> {

    public List<Cliente> mostrarTodosLosClientes() {
        conectar();
        List<Cliente> listaClientes = em.createQuery(Constantes.OBTENER_TODOS_LOS_CLIENTES).getResultList();
        desconectar();
        return listaClientes;
    }

    public Cliente obtenerClientePorDNI(String dni) {
        conectar();
        Cliente cliente = (Cliente) em.createQuery(Constantes.OBTENER_PRESTAMO_POR_DNI).setParameter("DNI", dni).getSingleResult();
        desconectar();
        return cliente;
    }

    public List<Cliente> obtenerClientePorNombre(String nombre) throws Exception {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new Exception(Constantes.NOMBRE_INVALIDO);
        }
        conectar();
        List<Cliente> listacliente = em.createQuery(Constantes.OBTENER_CLIENTE_POR_NOMBRE).setParameter("nombre", nombre).getResultList();
        desconectar();
        return listacliente;
    }

    public Cliente obtenerClientePorID(String id) throws Exception {
        if (id == null) {
            throw new Exception(Constantes.ID_INVALIDO);
        }
        conectar();
        Cliente cliente = (Cliente) em.createQuery(Constantes.OBTENER_CLIENTE_POR_ID).setParameter("id", id).getSingleResult();
        desconectar();
        return cliente;
    }

    @Override
    public void guardar(Cliente cliente) {
        super.guardar(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        super.editar(cliente);
    }

}
