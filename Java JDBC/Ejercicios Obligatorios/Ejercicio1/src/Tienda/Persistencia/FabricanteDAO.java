package Tienda.Persistencia;

import Tienda.Constantes.Constantes;
import Tienda.Entidades.Fabricante;
import java.util.ArrayList;

public final class FabricanteDAO extends DAO {

    public void insertarFabricante(Fabricante fabricante) throws Exception {

        try {
            if (fabricante == null) {
                throw new Exception(Constantes.FABRICANTE_INVALIDO);
            }

            String sql = Constantes.INSERTAR_FABRICANTE(fabricante);

            insertarModificarEliminar(sql);

        } catch (Exception ex) {

            throw ex;
        }

    }

    public void modificarFabricante(Fabricante fabricante) throws Exception {

        try {
            if (fabricante == null) {
                throw new Exception(Constantes.FABRICANTE_INVALIDO);
            }

            String sql = Constantes.MODIFICAR_FABRICANTE(fabricante);

            insertarModificarEliminar(sql);

        } catch (Exception ex) {

            throw ex;
        }

    }

    public void eliminarFabricante(Fabricante fabricante) throws Exception {

        try {

            String sql = Constantes.ELIMINAR_FABRICANTE(fabricante);

            insertarModificarEliminar(sql);

        } catch (Exception ex) {

            throw ex;
        }

    }

    public ArrayList<Fabricante> mostrarTodosLosFabricantes() throws Exception {

        ArrayList<Fabricante> ListaFabricantes = new ArrayList<>();

        try {

            String sql = Constantes.NOMBRE_PRECIO_TODOS_LOS_PRODUCTOS;

            consultarBase(sql);

            Fabricante fabricante = null;

            while (resultado.next()) {

                fabricante = new Fabricante();

                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));

                ListaFabricantes.add(fabricante);
            }

            return ListaFabricantes;

        } catch (Exception e) {

            throw e;

        } finally {
            desconectarBase();
        }

    }

}
