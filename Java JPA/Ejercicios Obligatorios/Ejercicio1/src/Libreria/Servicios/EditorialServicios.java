package Libreria.Servicios;

import Libreria.Constantes.Constantes;
import Libreria.Entidades.Editorial;
import Libreria.Persistencia.EditorialDAOExt;
import java.util.List;
import java.util.Scanner;

public class EditorialServicios {

    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private final EditorialDAOExt DAO = new EditorialDAOExt();

    public String crearEditorial(String nombre, Boolean alta) throws Exception {
        DAO.guardar(new Editorial(nombre, alta));
        return Constantes.EDITORIAL_ANADIDA;
    }

    public List<Editorial> mostrarTodasEditoriales() {
        return DAO.mostrarTodasLasEditoriales();
    }

    public String DarEditorialDeBaja(String id) throws Exception {
        try {
            if (id == null) {
                throw new Exception(Constantes.ID_INVALIDO);
            }
            DAO.darDeBajaEditorial(id);
            return Constantes.BAJA_EDITORIAL_EXITOSA;
        } catch (Exception e) {
            throw e;
        }
    }

    public String DarEditorialDeAlta(String id) throws Exception {
        try {
            if (id == null) {
                throw new Exception(Constantes.ID_INVALIDO);
            }
            DAO.darDeAltaEditorial(id);
            return Constantes.ALTA_EDITORIAL_EXITOSA;
        } catch (Exception e) {
            throw e;
        }
    }

    public Editorial modificarEditorialPorID(String id) throws Exception {
        try {
            if (id == null) {
                throw new Exception(Constantes.ID_INVALIDO);
            }

            Editorial editorial = mostrarEditorialPorId(id);

            if (editorial == null) {
                throw new Exception(Constantes.EDITORIAL_NO_ENCONTADA);
            }
            System.out.println(Constantes.INGRESE_NOMBRE_EDITORIAL);
            editorial.setNombre(leer.next());
            pedirAltaEditorial();
            DAO.editar(editorial);
            return editorial;
        } catch (Exception e) {
            throw e;
        }
    }

    public Editorial mostrarEditorialPorId(String id) throws Exception {
        try {
            if (id == null) {
                throw new Exception(Constantes.ID_INVALIDO);
            }
            Editorial editorial = DAO.obtenerEditorialPorID(id);
            if (editorial == null) {
                throw new Exception(Constantes.EDITORIAL_NO_ENCONTADA);
            }
            return editorial;
        } catch (Exception e) {
            throw e;
        }
    }

    public Editorial mostrarEditorialPorNombre(String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception(Constantes.NOMBRE_INVALIDO);
            }
            Editorial editorial = DAO.obtenerEditorialPorNombre(nombre);
            if (editorial == null) {
                throw new Exception(Constantes.EDITORIAL_NO_ENCONTADA);
            }
            return editorial;
        } catch (Exception e) {
            throw e;
        }
    }

    public Boolean pedirAltaEditorial() {
        System.out.println(Constantes.PREGUNTA_EDITORIAL_DISPONIBLE);
        String opc = leer.next().substring(0, 1);
        return opc.equalsIgnoreCase("S") ? Boolean.TRUE : Boolean.FALSE;
    }

}
