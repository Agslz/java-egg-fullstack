package Tienda.Persistencia;

import Tienda.Entidades.Producto;
import java.util.ArrayList;
import Tienda.Constantes.Constantes;
import java.util.Collection;

public final class ProductoDAO extends DAO {

    public void insertarProductos(Producto producto) throws Exception {

        try {
            if (producto == null) {
                throw new Exception(Constantes.PRODUCTO_INVALIDO);
            }

            String sql = Constantes.INSERTAR_PRODUCTOS(producto);

            insertarModificarEliminar(sql);

        } catch (Exception ex) {

            throw ex;
        }

    }

    public void modificarProductos(Producto producto) throws Exception {

        try {
            if (producto == null) {
                throw new Exception(Constantes.PRODUCTO_MODIFICAR_INVALIDO);
            }

            String sql = Constantes.MODIFICAR_PRODUCTOS(producto);

            insertarModificarEliminar(sql);

        } catch (Exception ex) {

            throw ex;
        }

    }

    public void eliminarProductos(Producto producto) throws Exception {

        try {

            String sql = Constantes.ELIMINAR_PRODUCTOS(producto);

            insertarModificarEliminar(sql);

        } catch (Exception ex) {

            throw ex;
        }

    }

    public Collection<Producto> listarProductos() throws Exception {

        Collection<Producto> productos = new ArrayList();

        try {

            String sql = Constantes.TODOS_LOS_PRODUCTOS;

            consultarBase(sql);

            Producto producto = null;

            while (resultado.next()) {

                producto = new Producto();

                producto.setCodigo(resultado.getInt(1));

                producto.setNombre(resultado.getString(2));

                producto.setPrecio(resultado.getDouble(3));

                producto.setCodigoFabricante(resultado.getInt(4));

                productos.add(producto);
            }

            return productos;

        } catch (Exception e) {

            System.out.println(e.toString());

            throw new Exception(Constantes.ERROR_SISTEMA);

        } finally {

            desconectarBase();
        }
    }

    public ArrayList<Producto> mostrarNombreTodosLosProductos() throws Exception {

        ArrayList<Producto> ListaProductos = new ArrayList<>();

        try {

            String sql = Constantes.NOMBRE_TODOS_LOS_PRODUCTOS;

            consultarBase(sql);

            Producto producto = null;

            while (resultado.next()) {

                producto = new Producto();

                producto.setNombre(resultado.getString(1));
                ListaProductos.add(producto);
            }

            return ListaProductos;

        } catch (Exception e) {

            throw e;

        } finally {

            desconectarBase();
        }

    }

    public ArrayList<Producto> mostrarNombrePreciosTodosLosProductos() throws Exception {

        ArrayList<Producto> ListaProductos = new ArrayList<>();

        try {

            String sql = Constantes.NOMBRE_PRECIO_TODOS_LOS_PRODUCTOS;

            consultarBase(sql);

            Producto producto = null;

            while (resultado.next()) {

                producto = new Producto();

                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                ListaProductos.add(producto);
            }

            return ListaProductos;

        } catch (Exception e) {

            throw e;

        } finally {

            desconectarBase();
        }

    }

    public ArrayList<Producto> mostrarProductosPrecioEntre120_202() throws Exception {

        ArrayList<Producto> ListaProductos = new ArrayList<>();

        try {

            String sql = Constantes.PRODUCTOS_ENTRE_120_Y_202;

            consultarBase(sql);

            Producto producto = null;

            while (resultado.next()) {

                producto = new Producto();

                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));

                ListaProductos.add(producto);
            }

            return ListaProductos;

        } catch (Exception e) {

            throw e;

        } finally {

            desconectarBase();
        }

    }

    public ArrayList<Producto> mostrarTodosLosPortatiles() throws Exception {

        ArrayList<Producto> ListaProductos = new ArrayList<>();

        try {

            String sql = Constantes.PRODUCTOS_PORTATILES;

            consultarBase(sql);

            Producto producto = null;

            while (resultado.next()) {

                producto = new Producto();

                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));

                ListaProductos.add(producto);
            }

            return ListaProductos;

        } catch (Exception e) {

            throw e;

        } finally {

            desconectarBase();
        }

    }

    public ArrayList<Producto> mostrarNombrePrecioProductoMasBarato() throws Exception {

        ArrayList<Producto> ListaProductos = new ArrayList<>();

        try {

            String sql = Constantes.PRODUCTO_MAS_BARATO;

            consultarBase(sql);

            Producto producto = null;

            while (resultado.next()) {

                producto = new Producto();

                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));

                ListaProductos.add(producto);
            }

            return ListaProductos;

        } catch (Exception e) {

            throw e;

        } finally {

            desconectarBase();
        }

    }

    public Producto obtenerProductoPorCodigo(int cod) throws Exception {
        try {

            String sql = Constantes.OBTENER_ID(cod);

            consultarBase(sql);

            Producto productoModificado = new Producto();

            while (resultado.next()) {

                productoModificado.setCodigo(resultado.getInt(1));

                productoModificado.setNombre(resultado.getString(2));

                productoModificado.setPrecio(resultado.getDouble(3));

                productoModificado.setCodigoFabricante(resultado.getInt(4));
            }

            return productoModificado;

        } catch (Exception e) {

            System.out.println(e.toString());

            throw new Exception(Constantes.ERROR_PRODUCTO);

        } finally {

            desconectarBase();
        }

    }
}
