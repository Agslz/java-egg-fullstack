package Servicios;

import Entidades.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class ServiciosPais {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pais crearPais() {

        Pais p1 = new Pais();

        TreeSet<String> paises = new TreeSet();

        String opc = "SI";

        while (!opc.equalsIgnoreCase("NO")) {

            System.out.println("Ingrese un país");

            String AddPais = leer.next();

            paises.add(AddPais);

            System.out.println("Desea añadir otro país?");

            opc = leer.next();
        }

        p1.setPais(paises);

        return p1;

    }

    public void mostrarPais(Pais p1) {

        for (String pais : p1.getPais()) {

            System.out.println(pais);
        }
    }

    public void buscarYEliminar(Pais p1, String buscar) {

        Iterator<String> it2 = p1.getPais().iterator();

        while (it2.hasNext()) {

            if (it2.next().equals(buscar)) {

                it2.remove();

                System.out.println("El pais " + buscar + " se eliminó ");
            }
        }
    }

    public void contienePais(Pais p1, String buscar) {

        if (p1.getPais().contains(buscar)) {

            System.out.println("El país se encuentra en la lista");

        } else {

            System.out.println("El pais no se encuentra en la lista");
        }
    }

    public void menu() {

        System.out.println("""
                           1.Añadir pais
                           2.Mostrar paises
                           3.Buscar pais
                           4.Eliminar un país
                           5.Menu
                           6.Salir
                           """);
    }
}
