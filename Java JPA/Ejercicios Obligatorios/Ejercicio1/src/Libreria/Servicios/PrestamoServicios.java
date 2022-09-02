package Libreria.Servicios;

import Libreria.Constantes.Constantes;
import Libreria.Entidades.Cliente;
import Libreria.Entidades.Libro;
import Libreria.Entidades.Prestamo;
import Libreria.Persistencia.LibroDAOExt;
import Libreria.Persistencia.PrestamoDAOExt;
import java.util.Date;
import java.util.List;

public class PrestamoServicios {

    private final PrestamoDAOExt DAO = new PrestamoDAOExt();
    private final LibroDAOExt DAOLIBRO = new LibroDAOExt();
    private final LibroServicios libroServicios = new LibroServicios();
    private final ClienteServicios clienteServicios = new ClienteServicios();

    public List<Prestamo> mostrarTodosLosPrestamos() {
        return DAO.mostrarTodosLosPrestamos();
    }

    public Prestamo mostrarPrestamosPorDNICliente(String dni) throws Exception {
        try {
            if (dni == null) {
                throw new Exception(Constantes.DNI_INVALIDO);
            }
            Prestamo prestamo = DAO.buscarPrestamosPorDNICliente(dni);
            if (prestamo == null) {
                throw new Exception(Constantes.PRESTAMO_NO_ENCONTRADO);
            }
            return prestamo;
        } catch (Exception e) {
            throw e;
        }
    }

    public String prestarLibro(String titulo, String dni) throws Exception {
        try {
            Cliente cliente = clienteServicios.mostrarClientePorDNI(dni);
            if (cliente != null) {
                throw new Exception(Constantes.PRESTAMO_INVALIDO);
            } else {
                if (titulo == null || titulo.trim().isEmpty()) {
                    throw new Exception(Constantes.NOMBRE_INVALIDO);
                }
                Libro libro = libroServicios.mostrarLibroPorTitulo(titulo);
                if (libro == null) {
                    throw new Exception(Constantes.LIBRO_NO_ENCONTRADO);
                }
                libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() - 1);
                libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() + 1);
                DAOLIBRO.editar(libro);
                Prestamo prestamo = new Prestamo();
                prestamo.setLibro(libro);
                prestamo.setCliente(cliente);
                prestamo.setFechaDePrestamo(setearFecha());
                DAO.guardar(prestamo);
            }
        } catch (Exception e) {
            throw e;
        }
        return Constantes.LIBRO_PRESTADO;
    }

    public String devolverLibro(String dni) throws Exception {

        try {
            Cliente cliente = clienteServicios.mostrarClientePorDNI(dni);
            if (cliente == null) {
                throw new Exception(Constantes.PRESTAMO_NO_DISPONIBLE);
            } else {
                Prestamo prestamo = DAO.buscarPrestamosPorDNICliente(dni);
                Libro libro = prestamo.getLibro();
                libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() + 1);
                libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() - 1);
                DAOLIBRO.editar(libro);
                prestamo.setFechaDeDevolucion(setearFecha());
                DAO.guardar(prestamo);
            }
        } catch (Exception e) {
            throw e;
        }
        return Constantes.LIBRO_DEVUELTO;
    }

    public Date setearFecha() {
        Date date = new Date();
        return date;
    }

}
