package Libreria.Servicios;

import Libreria.Persistencia.AutorDAOExt;
import Libreria.Constantes.Constantes;
import Libreria.Entidades.Autor;
import java.util.List;
import java.util.Scanner;

public class AutorServicios {

    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private final AutorDAOExt DAO = new AutorDAOExt();

    public Autor crearAutor(String nombre) throws Exception {
        Autor autor = new Autor();
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new Exception(Constantes.AUTOR_NO_ENCONTRADO);
        }
        autor.setNombre(nombre);
        autor.setAlta(pedirAltaAutor());
        return autor;
    }

    public String guardarAutor() throws Exception {
        DAO.guardar(crearAutor(leer.next()));
        return Constantes.AUTOR_ANADIDO;
    }

    public List<Autor> mostrarTodosLosAutores() {
        return DAO.mostrarTodosLosAutores();
    }

    public String darAutorDeBaja() throws Exception {
        try {
            String id = leer.next();
            if (id == null) {
                throw new Exception(Constantes.ID_INVALIDO);
            }
            DAO.DardeBajaAutor(id);
            return Constantes.BAJA_AUTOR_EXITOSA;
        } catch (Exception e) {
            throw e;
        }
    }

    public String darAutorDeAlta() throws Exception {
        try {
            String id = leer.next();
            if (id == null) {
                throw new Exception(Constantes.ID_INVALIDO);
            }
            DAO.darDeAltaAutor(id);
            return Constantes.ALTA_AUTOR_EXITOSA;
        } catch (Exception e) {
            throw e;
        }
    }

    public String modificarAutorPorID(String id) throws Exception {
        try {
            if (id == null) {
                throw new Exception(Constantes.ID_INVALIDO);
            }

            Autor autor = DAO.obtenerAutorPorID(id);

            if (autor == null) {
                throw new Exception(Constantes.AUTOR_NO_ENCONTRADO);
            }

            System.out.println(Constantes.INGRESE_NOMBRE_AUTOR);
            autor.setNombre(leer.next());
            autor.setAlta(pedirAltaAutor());
            DAO.editar(autor);
            return Constantes.AUTOR_MODIFICADO;
        } catch (Exception e) {
            throw e;
        }
    }

    public Autor mostrarAutorPorID(String id) throws Exception {
        try {
            if (id == null) {
                throw new Exception(Constantes.ID_INVALIDO);
            }
            Autor autor = DAO.obtenerAutorPorID(id);
            if (autor == null) {
                throw new Exception(Constantes.AUTOR_NO_ENCONTRADO);
            }
            return autor;
        } catch (Exception e) {
            throw e;
        }
    }

    public Autor mostrarAutorPorNombre(String nombre) throws Exception {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception(Constantes.NOMBRE_INVALIDO);
            }
            Autor autor = DAO.obtenerAutorPorNombre(nombre);
            if (autor == null) {
                throw new Exception(Constantes.AUTOR_NO_ENCONTRADO);
            }
            return autor;
        } catch (Exception e) {
            throw e;
        }

    }

    public Boolean pedirAltaAutor() {
        System.out.println(Constantes.PREGUNTA_AUTOR_DISPONIBLE);
        String opc = leer.next().substring(0, 1);
        return opc.equalsIgnoreCase("S") ? Boolean.TRUE : Boolean.FALSE;
    }
}
