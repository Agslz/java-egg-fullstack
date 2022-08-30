package Libreria.Servicios;

import Libreria.Persistencia.AutorDAOExt;
import Libreria.Constantes.Constantes;
import Libreria.Entidades.Autor;
import java.util.Scanner;

public class AutorServicios {

    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private final AutorDAOExt DAO;

    public AutorServicios() {
        this.DAO = new AutorDAOExt();
    }

    public Autor crearAutor() throws Exception {
        Autor autor = new Autor();
        System.out.println(Constantes.INGRESE_NOMBRE_AUTOR);
        String nombre = leer.next();
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new Exception(Constantes.AUTOR_NO_ENCONTRADO);
        }
        autor.setNombre(nombre);
        autor.setAlta(pedirAltaAutor());
        return autor;
    }

    public void guardarAutor() throws Exception {
        DAO.guardar(crearAutor());
        System.out.println(Constantes.AUTOR_ANADIDO);
    }

    public void mostrarTodosLosAutores() {
        DAO.mostrarTodosLosAutores().forEach(System.out::println);
    }

    public void darAutorDeBaja() {
        try {
            System.out.println(Constantes.INGRESE_AUTOR_ID);
            String id = leer.next();
            if (id == null ) {
                throw new Exception(Constantes.ID_INVALIDO);
            }
            DAO.DardeBajaAutor(id);
        } catch (Exception e) {
            System.out.println(Constantes.ERROR);
            System.out.println(e.toString());
        }
    }

    public void darAutorDeAlta() {
        try {
            System.out.println(Constantes.INGRESE_AUTOR_ID);
            String id = leer.next();
            if (id == null) {
                throw new Exception(Constantes.ID_INVALIDO);
            }
            DAO.darDeAltaAutor(id);
        } catch (Exception e) {
            System.out.println(Constantes.ERROR);
            System.out.println(e.toString());
        }
    }

    public void modificarAutorPorID() {
        try {
            System.out.println(Constantes.INGRESE_AUTOR_ID);
            String id = leer.next();

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

        } catch (Exception e) {
            System.out.println(Constantes.ERROR);
            System.out.println(e.toString());
        }
    }

    public void mostrarAutorPorID() {
        try {
            System.out.println(Constantes.INGRESE_AUTOR_ID);
            String id = leer.next();
            if (id == null ) {
                throw new Exception(Constantes.ID_INVALIDO);
            }
            Autor autor = DAO.obtenerAutorPorID(id);
            if (autor == null) {
                throw new Exception(Constantes.AUTOR_NO_ENCONTRADO);
            }
            System.out.println(autor);
        } catch (Exception e) {
            System.out.println(Constantes.ERROR);
            System.out.println(e.toString());
        }
    }

    public void mostrarAutorPorNombre() {
        try {
            System.out.println(Constantes.INGRESE_NOMBRE_AUTOR);
            String nombre = leer.next();

            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception(Constantes.NOMBRE_INVALIDO);
            }

            Autor autor = DAO.obtenerAutorPorNombre(nombre);

            if (autor == null) {
                throw new Exception(Constantes.AUTOR_NO_ENCONTRADO);
            }
            System.out.println(autor);
        } catch (Exception e) {
            System.out.println(Constantes.ERROR);
            System.out.println(e.toString());
        }
    }

    public Boolean pedirAltaAutor() {
        System.out.println(Constantes.PREGUNTA_AUTOR_DISPONIBLE);
        String opc = leer.next().substring(0, 1);
        return opc.equalsIgnoreCase("S") ? Boolean.TRUE : Boolean.FALSE;
    }
}
