package Libreria.Servicios;

import Libreria.Constantes.Constantes;
import Libreria.Entidades.Editorial;
import Libreria.Persistencia.EditorialDAOExt;
import java.util.Scanner;

public class EditorialServicios {

    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private final EditorialDAOExt DAO = new EditorialDAOExt();

    public Editorial crearEditorial() throws Exception {
        Editorial editorial = new Editorial();
        System.out.println(Constantes.INGRESE_NOMBRE_EDITORIAL);
        String nombre = leer.next();
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new Exception(Constantes.NOMBRE_INVALIDO);
        }
        editorial.setNombre(nombre);
        pedirAltaEditorial(editorial);
        return editorial;
    }

    public void guardarEditorial() throws Exception {
        DAO.guardar(crearEditorial());
        System.out.println(Constantes.EDITORIAL_ANADIDA);
    }

    public void mostrarTodasEditoriales() {
        DAO.mostrarTodasLasEditoriales().forEach(System.out::println);
    }

    public void DarEditorialDeBaja() {
        try {
            System.out.println(Constantes.INGRESE_EDITORIAL_ID);
            String id = leer.next();
            if (id == null) {
                throw new Exception(Constantes.ID_INVALIDO);
            }
            DAO.darDeBajaEditorial(id);
        } catch (Exception e) {
            System.out.println(Constantes.ERROR);
            System.out.println(e.toString());
        }
    }

    public void DarEditorialDeAlta() {
        try {
            System.out.println(Constantes.INGRESE_EDITORIAL_ID);
            String id = leer.next();
            if (id == null ) {
                throw new Exception(Constantes.ID_INVALIDO);
            }
            DAO.darDeAltaEditorial(id);
        } catch (Exception e) {
            System.out.println(Constantes.ERROR);
            System.out.println(e.toString());
        }
    }

    public void modificarEditorialPorID() {
        try {
            System.out.println(Constantes.INGRESE_EDITORIAL_ID);
            String id = leer.next();
            
            if (id == null ) {
                throw new Exception(Constantes.ID_INVALIDO);
            }
            
            Editorial editorial = DAO.obtenerEditorialPorID(id);
            
            if (editorial == null) {
                throw new Exception(Constantes.EDITORIAL_NO_ENCONTADA);
            }
            
            System.out.println(Constantes.INGRESE_NOMBRE_EDITORIAL);
            editorial.setNombre(leer.next());
            pedirAltaEditorial(editorial);
            DAO.editar(editorial);
        } catch (Exception e) {
            System.out.println(Constantes.ERROR);
            System.out.println(e.toString());
        }
    }

    public void mostrarEditorialPorId() {
        try {
            System.out.println(Constantes.INGRESE_EDITORIAL_ID);
            String id = leer.next();
            if (id == null) {
                throw new Exception(Constantes.ID_INVALIDO);
            }
            Editorial editorial = DAO.obtenerEditorialPorID(id);
            if (editorial == null) {
                throw new Exception(Constantes.EDITORIAL_NO_ENCONTADA);
            }
            System.out.println(editorial);
        } catch (Exception e) {
            System.out.println(Constantes.ERROR);
            System.out.println(e.toString());
        }
    }

    public void mostrarEditorialPorNombre() {
        try {
            System.out.println(Constantes.INGRESE_NOMBRE_EDITORIAL);
            String nombre = leer.next();
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception(Constantes.NOMBRE_INVALIDO);
            }
            Editorial editorial = DAO.obtenerEditorialPorNombre(nombre);
            if (editorial == null) {
                throw new Exception(Constantes.EDITORIAL_NO_ENCONTADA);
            }
            System.out.println(editorial);

        } catch (Exception e) {
            System.out.println(Constantes.ERROR);
            System.out.println(e.toString());
        }
    }

    public void pedirAltaEditorial(Editorial editorial) {
        System.out.println(Constantes.PREGUNTA_EDITORIAL_DISPONIBLE);
        String opc = leer.next().substring(0, 1);
        editorial.setAlta(opc.equalsIgnoreCase("S"));
    }

}
