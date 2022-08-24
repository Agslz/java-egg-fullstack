package Tienda.Orquestador;

import Tienda.Constantes.Constantes;
import Tienda.Servicios.FabricanteServicios;
import Tienda.Servicios.ProductoServicios;
import java.util.Scanner;

public class Orquestador {

    private static final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void menuPrincipal() throws Exception {

        int opc;

        do {

            System.out.println(Constantes.MENU_PRINCIPAL);

            System.out.println(Constantes.INGRESE_OPC);

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    menuFabricante();
                    break;
                case 2:
                    menuProducto();
                    break;
                default:
                    System.out.println(Constantes.DESPEDIDA);
            }
        } while (opc != 3);
    }

    public static void menuProducto() throws Exception {

        ProductoServicios productoServicios = new ProductoServicios();

        int opc;

        do {

            System.out.println(Constantes.MENU_PRODUCTO);

            System.out.println(Constantes.INGRESE_OPC);

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    productoServicios.mostrarNombreProductos();
                    break;
                case 2:
                    productoServicios.listarNombrePrecio();
                    break;
                case 3:
                    productoServicios.productosEntre120_202();
                    break;
                case 4:
                    productoServicios.mostrarPortatiles();
                    break;
                case 5:
                    productoServicios.mostrarMasBarato();
                    break;
                case 6:
                    productoServicios.ingresarProducto();
                    break;
                case 7:
                    productoServicios.modificarProducto();
                    break;
                case 8:
                    productoServicios.listarProductos();
                    break;
                case 9:
                    System.out.println(Constantes.PRODUCTO_A_BORRAR);
                    int codigo = leer.nextInt();
                    productoServicios.buscarPorCodigo(codigo);
                    break;
                case 10:
                    menuPrincipal();
                    break;
            }
        } while (opc != 10);
    }

    public static void menuFabricante() throws Exception {

        FabricanteServicios fabricanteServicios = new FabricanteServicios();

        int opc;

        do {

            System.out.println(Constantes.MENU_FABRICANTE);

            System.out.println(Constantes.INGRESE_OPC);

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    fabricanteServicios.mostrarTodosLosFabricantes();
                    break;

                case 2:
                    fabricanteServicios.añadirFabricante();
                    break;

                case 3:
                    fabricanteServicios.listarFabricante();
                    break;

                case 4:
                    menuPrincipal();
                    break;
            }
        } while (opc != 4);
    }
}
