package Tienda.Servicios;

import Tienda.Persistencia.ProductoDAO;
import java.util.Scanner;

public class ProductoServicios {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private final ProductoDAO dao;

    public ProductoServicios() {
        this.dao = new ProductoDAO();
    }
    
    

}