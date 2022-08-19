package Tienda;

import Tienda.Orquestador.Orquestador;
import Tienda.Servicios.ProductoServicios;

public class Main {

    public static void main(String[] args) throws Exception {

//        Orquestador.menuPrincipal();
        
        ProductoServicios p = new ProductoServicios();
        
        p.ingresarProducto();

    }

}
