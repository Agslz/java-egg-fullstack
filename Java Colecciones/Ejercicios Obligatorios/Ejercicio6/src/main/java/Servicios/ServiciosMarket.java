package Servicios;

import Entidades.Market;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ServiciosMarket {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private final HashMap<String, Integer> Tienda = new HashMap<>();

    public void agregarProducto() {

        Market m = new Market();

        String opcProducto = "";

        while (!opcProducto.equalsIgnoreCase("NO")) {

            System.out.println("Ingrese el producto");

            m.setProducto(leer.next());

            System.out.println("Ingrese el precio");

            m.setPrecio(leer.nextInt());

            Tienda.put(m.getProducto(), m.getPrecio());

            System.out.println("Desea ingresar otro producto? (SI/NO)");

            opcProducto = leer.next();
        }
    }

    public void mostrarElemento() {

        for (Map.Entry<String, Integer> entry : Tienda.entrySet()) {

            System.out.println("Producto: " + entry.getKey() + ", Precio: " + entry.getValue());
        }

    }

    public void modificarPrecio() {

        Iterator<Map.Entry<String, Integer>> iterator = Tienda.entrySet().iterator();

        System.out.println("Ingrese el producto el cual desea cambiar el precio");

        String cambio = leer.next();

        boolean flag = false;

        while (iterator.hasNext()) {

            Map.Entry<String, Integer> next = iterator.next();

            if (next.getKey().equals(cambio)) {

                flag = true;

            }
        }

        if (!flag) {

            System.out.println("El producto indicado no se encuentra en la lista");

        } else {

            System.out.println("Ingrese el nuevo precio");

            Integer precioNuevo = leer.nextInt();

            Tienda.replace(cambio, precioNuevo);

        }
    }

    public void eliminarElemento() {

        Iterator<Map.Entry<String, Integer>> it = Tienda.entrySet().iterator();

        System.out.println("Ingrese el elemento a borrar");

        String borrar = leer.next();

        boolean flag = false;

        while (it.hasNext()) {

            Map.Entry<String, Integer> next = it.next();

            if (next.getKey().equals(borrar)) {

                flag = true;

            }

        }

        if (!flag) {

            System.out.println("El producto ingresado no se encuentra en la lista");

        } else {

            Tienda.remove(borrar);

        }

    }

    public void menu() {

        System.out.println("""
                           1.Agregar producto
                           2.Mostrar producto
                           3.Modificar precio
                           4.Eliminar producto
                           5.Mostrar menu
                           6.Salir
                           """);
    }

}
