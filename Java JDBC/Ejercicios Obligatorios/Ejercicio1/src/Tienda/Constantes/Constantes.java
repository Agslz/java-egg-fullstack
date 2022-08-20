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
    public static final String ERROR_PRODUCTO = "Error al obtener el producto";
    public static final String ERROR_SISTEMA = "Error del sistema";
    public static final String INGRESE_OPC = "Ingrese una opción";
    public static final String NOMBRE_FABRICANTE_INVALIDO = "El nombre del fabricante es invalido";
    public static final String ID_INVALIDO = "El id ingresado es invalido";
    public static final String NOMBRE_INVALIDO = "El nombre ingresado es invalido";
    public static final String NOMBRE_FABRICANTE = "Ingrese el nombre del fabricante";
    public static final String INGRESE_ID = "Ingrese la ID del fabricante";
    public static final String FABRICANTE_NO_ENCONTRADO = "Fabricante no encontrado";
    public static final String DESPEDIDA = "Usted salió";
    public static final String PRODUCTO_A_BORRAR = "Ingrese el codigo del producto a borrar";

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
        return "INSERT INTO Producto (nombre,precio,codigo_fabricante)" + "VALUES ( ' "
                + producto.getNombre() + " ' ,  "
                + producto.getPrecio() + " , "
                + producto.getCodigoFabricante() + " );";

    }

    public static final String TODOS_LOS_PRODUCTOS = "SELECT * FROM producto";
    //----------------------------------------------------------QUERYS FABRICANTE--------------------------------------------------------------//

    public static final String TODOS_LOS_FABRICANTES = "SELECT * FROM fabricante;";

    public static String ELIMINAR_FABRICANTE(int codigo) {
        return "DELETE FROM fabricante WHERE codigo= " + codigo + ";";
    }

    public static String MODIFICAR_FABRICANTE(Fabricante fabricante) {
        return "UPDATE fabricante SET " + "nombre= " + fabricante.getNombre() + "WHERE codigo = " + fabricante.getCodigo() + ";";
    }

    public static String INSERTAR_FABRICANTE(Fabricante fabricante) {
        return "INSERT INTO fabricante(nombre) "
                + "VALUES ('" + fabricante.getNombre() + "');";
    }

    public static String OBTENER_ID(int cod) {
        return "SELECT * FROM producto WHERE codigo = " + cod + ";";
    }

    //-------------------------------------------------------------MENUS-----------------------------------------------------------------//
    public static final String MENU_PRINCIPAL
            = "\n1.Opciones Fabricante"
            + "\n2.Opciones Producto"
            + "\n3.Salir";

    public static final String MENU_PRODUCTO
            = "\n1.Mostrar nombre de todos los productos"
            + "\n2.Mostrar nombre y precio de todos los productos"
            + "\n3.Mostrar los productos con precio entre 120$ y 202$"
            + "\n4.Mostrar todos los portatiles"
            + "\n5.Mostrar el producto mas barato"
            + "\n6.Ingresar un producto"
            + "\n7.Modificar un producto según su id "
            + "\n8.Obtener un producto por su id"
            + "\n9.Borrar un producto con su id"
            + "\n10.Volver al menu principal";

    public static final String MENU_FABRICANTE
            = "\n1.Mostrar todos los fabricantes"
            + "\n2.Ingresar un fabricante"
            + "\n3.Mostrar fabricante por su ID"
            + "\n4.Volver al menu principal";
}
