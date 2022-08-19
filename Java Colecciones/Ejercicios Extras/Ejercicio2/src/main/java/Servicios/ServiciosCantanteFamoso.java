package Servicios;

import Entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServiciosCantanteFamoso {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static ArrayList<CantanteFamoso> Cantantes = new ArrayList();

    public CantanteFamoso crearCantante() {

        CantanteFamoso p = new CantanteFamoso();

        System.out.println("Ingrese el nombre del cantante");

        p.setNombre(leer.next());

        System.out.println("Ingrese el disco con mas ventas");

        p.setDiscoConMasVentas(leer.next());

        Cantantes.add(p);

        return p;
    }

    public void mostrarDatos() {

        for (CantanteFamoso Cantante : Cantantes) {

            System.out.println("Los datos del cantante son: ");

            System.out.println(Cantante);
        }
    }

    public void menu() {

        System.out.println("""
                           1.Ingresar cantante
                           2.Mostrar datos
                           3.Eliminar cantante
                           4.Menu
                           5.Salir
                           """);
    }
    public void eliminarCantante() {

        System.out.println("Ingrese el cantante a eliminar");

        String eliminar = leer.next();

        Iterator<CantanteFamoso> it = Cantantes.iterator();

        boolean encontrado = false;

        while (it.hasNext()) {

            if (it.next().getNombre().equals(eliminar)) {

                it.remove();

                encontrado = true;
            }
        }

        if (encontrado == true) {

            System.out.println("Se ha encontrado y eliminado: " + eliminar);

        } else {

            System.out.println("El cantante ingresado no se encuentra en la lista");
        }
    }
}
