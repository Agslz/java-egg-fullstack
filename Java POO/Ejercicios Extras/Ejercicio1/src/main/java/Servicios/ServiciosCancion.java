package Servicios;

import Entidades.Cancion;
import java.util.Scanner;

public class ServiciosCancion {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    Cancion c1 = new Cancion();

    public Cancion llenarDatos() {

        System.out.println("Ingrese el titulo de la cancion");

        c1.setTitulo(leer.next());

        System.out.println("Ingrese el autor de la cancion");

        c1.setAutor(leer.next());

        return c1;

    }

    public void mostrarDatos() {

        System.out.println("El titulo de la cancion es: " + c1.getTitulo());

        System.out.println("El autor de la cancion es: " + c1.getAutor());

    }

}
