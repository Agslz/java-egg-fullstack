package Libreria.Servicios;

import Libreria.Entidades.Cliente;
import Libreria.Persistencia.ClienteDAOExt;
import Libreria.Constantes.Constantes;
import java.util.List;
import java.util.Scanner;

public class ClienteServicios {

    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private final ClienteDAOExt DAO = new ClienteDAOExt();

    public String crearCliente(Long dni, String nombre, String apellido, String telefono) {
        DAO.guardar(new Cliente(dni, nombre, apellido, telefono));
        return Constantes.CLIENTE_ANADIDO;
    }

    public String modificarClientePorID(String id, String nombre, String apellido, Long dni, String telefono) throws Exception {
        try {
            if (id == null) {
                throw new Exception(Constantes.ID_INVALIDO);
            }
            Cliente cliente = mostrarClientePorID(id);
            if (cliente == null) {
                throw new Exception(Constantes.CLIENTE_NO_ENCONTRADO);
            }
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setDNI(dni);
            cliente.setTelefono(telefono);
            DAO.editar(cliente);
            return Constantes.CLIENTE_MODIFICADO;
        } catch (Exception e) {
            throw e;
        }
    }

    public List<Cliente> mostrarTodosLosClientes() {
        return DAO.mostrarTodosLosClientes();
    }

    public List<Cliente> mostrarClientePorNombre(String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception(Constantes.NOMBRE_INVALIDO);
            }
            List<Cliente> listaClientes = DAO.obtenerClientePorNombre(nombre);
            if (listaClientes == null) {
                throw new Exception(Constantes.CLIENTE_NO_ENCONTRADO);
            }
            return listaClientes;
        } catch (Exception e) {
            throw e;
        }
    }

    public Cliente mostrarClientePorID(String id) throws Exception {
        try {
            if (id == null) {
                throw new Exception(Constantes.ID_INVALIDO);
            }
            Cliente cliente = DAO.obtenerClientePorID(id);
            if (cliente == null) {
                throw new Exception(Constantes.CLIENTE_NO_ENCONTRADO);
            }
            return cliente;
        } catch (Exception e) {
            throw e;
        }
    }

    public Cliente mostrarClientePorDNI(String dni) throws Exception {
        try {
            if (dni == null ) {
                throw new Exception(Constantes.DNI_INVALIDO);
            }
            Cliente cliente = DAO.obtenerClientePorDNI(dni);
            if (cliente == null) {
                throw new Exception(Constantes.CLIENTE_NO_ENCONTRADO);
            }
            return cliente;
        } catch (Exception e) {
            throw e;
        }
    }
}
