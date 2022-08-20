package Tienda.Servicios;

import Tienda.Entidades.Producto;
import Tienda.Persistencia.ProductoDAO;
import java.util.Scanner;
import Tienda.Constantes.Constantes;
import java.util.Collection;

public class ProductoServicios {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private final ProductoDAO dao;

    public ProductoServicios() {
        this.dao = new ProductoDAO();
    }

    public void ingresarProducto() throws Exception {
        try {
            System.out.println(Constantes.NOMBRE_PRODUCTO);
            String nombre = leer.next();
            System.out.println(Constantes.PRECIO_PRODUCTO);
            double precio = leer.nextDouble();
            System.out.println(Constantes.CODIGO_FABRICANTE);
            int codigoFabricante = leer.nextInt();
            crearProducto(nombre, precio, codigoFabricante);

        } catch (Exception e) {

            throw e;
        }
    }

    public void crearProducto(String nombre, double precio, int codFab) throws Exception {
        if (codFab > 10 || 0 > codFab) {
            throw new Exception("El codigo de fabricante es invalido");
        }
        validar(nombre, precio);
        Producto producto = new Producto();
        producto.setNombre(nombre);
        producto.setPrecio(precio);
        producto.setCodigoFabricante(codFab);
        dao.insertarProductos(producto);
    }

    public void modificarProducto() throws Exception {
        System.out.println(Constantes.CODIGO_FABRICANTE);
        int cod = leer.nextInt();
        System.out.println(Constantes.NOMBRE_PRODUCTO);
        String nombre = leer.next();
        System.out.println(Constantes.PRECIO_PRODUCTO);
        double precio = leer.nextDouble();
        validarModificado(cod, nombre, precio);
    }

    public void validarModificado(int cod, String nombre, double precio) throws Exception {
        if (cod <= 0) {
            throw new Exception("El codigo es invalido");
        }
        validar(nombre, precio);
        Producto productoModificado = buscarPorCodigo(cod);
        dao.modificarProductos(productoModificado);
    }

    public Producto buscarPorCodigo(int cod) throws Exception {
        try {
            if (cod < 0) {
                throw new Exception("Codigo invalido");
            }
            Producto productoModificado = dao.obtenerProductoPorCodigo(cod);
            if (productoModificado == null) {
                throw new Exception("El producto es invalido");
            }
            return productoModificado;
        } catch (Exception e) {
            System.out.println(e.toString());
            throw new Exception("Error de sistema");
        }
    }

    public void validar(String nombre, double precio) throws Exception {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new Exception("El nombre es invalido");
        }
        if (precio <= 0) {
            throw new Exception("El precio debe ser mayor que 0");
        }
    }

    public void mostrarNombreProductos() throws Exception {
        Collection<Producto> listaProductos = dao.mostrarNombreTodosLosProductos();
        for (Producto listaProducto : listaProductos) {
            System.out.println(listaProducto.getNombre());
        }
    }

    public void listarProductos() throws Exception {
        Collection<Producto> listaProductos = dao.listarProductos();
        for (Producto listaProducto : listaProductos) {
            System.out.println(listaProducto);
        }
    }

    public void listarNombrePrecio() throws Exception {
        Collection<Producto> nombrePrecio = dao.mostrarNombrePreciosTodosLosProductos();
        for (Producto producto : nombrePrecio) {
            System.out.println("Nombre: " + producto.getNombre() + " .Precio: " + producto.getPrecio());
        }
    }

    public void productosEntre120_202() throws Exception {
        Collection<Producto> productosEntre = dao.mostrarProductosPrecioEntre120_202();
        for (Producto producto : productosEntre) {
            System.out.println("Nombre: " + producto.getNombre() + " .Precio: " + producto.getPrecio());
        }
    }

    public void mostrarPortatiles() throws Exception {
        Collection<Producto> productosEntre = dao.mostrarTodosLosPortatiles();
        for (Producto producto : productosEntre) {
            System.out.println("Nombre: " + producto.getNombre() + " .Precio: " + producto.getPrecio());
        }
    }
    
    public void mostrarMasBarato() throws Exception {
        Collection<Producto> productosEntre = dao.mostrarNombrePrecioProductoMasBarato();
        for (Producto producto : productosEntre) {
            System.out.println("Nombre: " + producto.getNombre() + " .Precio: " + producto.getPrecio());
        }
    }
    
    

}
