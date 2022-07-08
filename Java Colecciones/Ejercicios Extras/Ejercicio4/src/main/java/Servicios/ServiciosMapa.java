package Servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServiciosMapa {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void añadirCiudad(HashMap<Integer, String> listaCiudades) {

        System.out.print("Ingrese la ciudad");

        String ciudad = leer.next();

        System.out.print("Ingrese el código postal");

        Integer codigoPostal = leer.nextInt();

        listaCiudades.put(codigoPostal, ciudad);
    }

    public void mostrarCiudades(HashMap<Integer, String> listaCiudades) {

        for (Map.Entry<Integer, String> ciudad : listaCiudades.entrySet()) {

            System.out.println("Ciudad: " + ciudad.getValue() + ", Código postal: " + ciudad.getKey());

        }
    }

    public void mostrarSegunCodigo(HashMap<Integer, String> listaCiudades) {

        System.out.print("Ingrese el código postal de la ciudad a buscar");

        Integer codigoPostal = leer.nextInt();

        if (!listaCiudades.containsKey(codigoPostal)) {

            System.out.println("No se encuentra en la lista");

        }

        System.out.println("La ciudad es: " + listaCiudades.get(codigoPostal));
    }

    public void eliminarCiudad(HashMap<Integer, String> listaCiudades) {

        System.out.print("Ingrese el nombre de la ciudad a eliminar");

        String ciudadEliminar = leer.next();

        if (!listaCiudades.containsValue(ciudadEliminar)) {

            System.out.println("No se encuentra en la lista");

        }
        listaCiudades.values().remove(ciudadEliminar);
    }

    public void menu() {

        System.out.println("""
                           1.Agregar ciudades
                           2.Mostrar ciudades
                           3.Mostrar ciudad con su codigo
                           4.Eliminar ciudad con su codigo
                           5.Salir
                           """);
    }
}
