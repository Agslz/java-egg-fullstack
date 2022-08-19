package Tienda.Servicios;

import Tienda.Persistencia.FabricanteDAO;
import Tienda.Constantes.Constantes;
import Tienda.Entidades.Fabricante;
import java.util.Scanner;

public class FabricanteServicios {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private final FabricanteDAO dao;

    public FabricanteServicios() {
        this.dao = new FabricanteDAO();
    }


    public void mostrarTodosLosFabricantes() throws Exception {
        dao.listarTodosFabricantes();
    }

    public void crearFabricante(String nombre) throws Exception {

        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println(Constantes.NOMBRE_FABRICANTE_INVALIDO);
        }

        Fabricante fabricante = new Fabricante();

        fabricante.setNombre(nombre);

        dao.insertarFabricante(fabricante);

    }

    public void moficarFabricante(Integer codigo, String nombre) throws Exception {

        validar(codigo, nombre);

        Fabricante fabricanteModificado = buscarPorID(codigo);

        dao.modificarFabricante(fabricanteModificado);

    }

    public Fabricante buscarPorID(int codigo) throws Exception {

        try {
            if (codigo > 0) {
                throw new Exception(Constantes.ID_INVALIDO);
            }
            Fabricante devolverFabricante = dao.buscarFabricantePorID(codigo);
            return devolverFabricante;
        } catch (Exception e) {
            throw e;
        }

    }

    public void eliminarFabricante(int codigo) throws Exception {
        try {
            if (codigo > 0) {
                throw new Exception(Constantes.FABRICANTE_INVALIDO);
            }
            dao.eliminarFabricante(codigo);
        } catch (Exception e) {
            throw e;
        }

    }

    public void validar(Integer codigo, String nombre) throws Exception {

        if (null == codigo || 0 > codigo) {
            throw new Exception(Constantes.ID_INVALIDO);
        }
        if (null == nombre || nombre.trim().isEmpty()) {
            throw new Exception(Constantes.NOMBRE_INVALIDO);
        }

    }

    public void añadirFabricante() throws Exception {
        System.out.println(Constantes.NOMBRE_FABRICANTE);
        String nombre = leer.next();
        crearFabricante(nombre);
    }

    public void listarFabricante() throws Exception {
        Fabricante devolverFabricante = fabricantePorID();
        System.out.println(devolverFabricante);
    }

    public Fabricante fabricantePorID() throws Exception {

        System.out.println(Constantes.INGRESE_ID);
        Integer id = leer.nextInt();

        if (null == id || 0 >= id) {
            throw new Exception(Constantes.ID_INVALIDO);
        }
        try {
            Fabricante retornarFabricante = dao.buscarFabricantePorID(id);
            if (null == retornarFabricante) {
                throw new Exception(Constantes.FABRICANTE_NO_ENCONTRADO);
            }
            return retornarFabricante;
        } catch (Exception e) {
            throw e;
        }

    }
}
