package Tienda.Constantes;

import Tienda.Entidades.Fabricante;
import Tienda.Entidades.Producto;

public class Constantes {

    //----------------------------------------------------------CONSTANTES--------------------------------------------------------------//
    public static final String PRODUCTO_INVALIDO = "Debe indicar un producto valido";
    public static final String PRODUCTO_MODIFICAR_INVALIDO = "Debe indicar el producto que desea modificar";
    public static final String FABRICANTE_INVALIDO = "El fabricante es invalido";
    public static final String NOMBRE_PRODUCTO = "Ingrese el nombre del producto";
    public static final String PRECIO_PRODUCTO = "Ingrese el precio del producto";
    public static final String CODIGO_FABRICANTE = "Ingres el codigo del fabricante no mayor a 10";

    //----------------------------------------------------------QUERYS PRODUCTO--------------------------------------------------------------//
    public static final String NOMBRE_TODOS_LOS_PRODUCTOS = "SELECT nombre FROM producto;";
    public static final String NOMBRE_PRECIO_TODOS_LOS_PRODUCTOS = "SELECT nombre,precio FROM producto;";
    public static final String PRODUCTOS_ENTRE_120_Y_202 = "SELECT nombre,precio FROM producto WHERE precio BETWEEN 120 AND 202;";
    public static final String PRODUCTOS_PORTATILES = "SELECT nombre, precio FROM producto WHERE nombre LIKE '%portátil%';";
    public static final String PRODUCTO_MAS_BARATO = "SELECT nombre, precio FROM producto ORDER BY precio ASC LIMIT 1;";

    public static String ELIMINAR_PRODUCTOS(Producto producto) {
        return "DELETE FROM producto WHERE codigo= " + producto.getCodigo() + ";";
    }

    public static String MODIFICAR_PRODUCTOS(Producto producto) {
        return "UPDATE producto SET " + "nombre= " + producto.getNombre()
                + "codigo_fabricante= " + producto.getCodigo() + "precio= "
                + producto.getPrecio() + "WHERE codigo = "
                + producto.getCodigoFabricante() + ";";
    }

    public static String INSERTAR_PRODUCTOS(Producto producto) {
        return "INSERT INTO producto(nombre, precio, codigo_fabricante)"
                + " VALUES('" + producto.getNombre() + "', "
                + producto.getPrecio() + ", "
                + producto.getCodigoFabricante() + ");";
    }

    //----------------------------------------------------------QUERYS FABRICANTE--------------------------------------------------------------//
    public static final String NOMBRE_TODOS_LOS_FABRICANTES = "SELECT * FROM fabricante;";

    public static String ELIMINAR_FABRICANTE(Fabricante fabricante) {
        return "DELETE FROM fabricante WHERE codigo= " + fabricante.getCodigo() + ";";
    }

    public static String MODIFICAR_FABRICANTE(Fabricante fabricante) {
        return "UPDATE fabricante SET " + "nombre= " + fabricante.getNombre() + "WHERE codigo = " + fabricante.getCodigo() + ";";
    }

    public static String INSERTAR_FABRICANTE(Fabricante fabricante) {
        return "INSERT INTO fabricante(nombre)"
                + " VALUES('" + fabricante.getNombre() + ");";
    }

}
