package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServicioPelicula {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pelicula crearPelicula() {

        Pelicula p1 = new Pelicula();

        System.out.println("Ingrese el titulo de la pelicula");

        p1.setTitulo(leer.next());

        System.out.println("Ingrese el autor de la pelicula");

        p1.setAutor(leer.next());

        System.out.println("Ingrese la duración de la pelicula");

        p1.setDuracionPelicula(leer.nextInt());

        return p1;

    }

    public void mostrarPeliculas(ArrayList<Pelicula> ListaPelicula) {

        for (Pelicula var : ListaPelicula) {

            System.out.println(var);

        }
    }

    public void mostrarPeliculaMayor1Hora(ArrayList<Pelicula> ListaPelicula) {

        for (Pelicula var : ListaPelicula) {

            if (var.getDuracionPelicula() > 1) {

                System.out.println(var);

            }
        }
    }

    public void OrdenarMayorMenor(ArrayList<Pelicula> ListaPelicula) {

        Collections.sort(ListaPelicula, (pel1, pel2) -> pel1.getDuracionPelicula().compareTo(pel2.getDuracionPelicula()));

    }

    public void OrdernarMenorMayor(ArrayList<Pelicula> ListaPelicula) {

        Collections.sort(ListaPelicula, (pel1, pel2) -> pel2.getDuracionPelicula().compareTo(pel1.getDuracionPelicula()));

    }

    public void OrdenarTitulo(ArrayList<Pelicula> ListaPelicula) {

        Collections.sort(ListaPelicula, (pel1, pel2) -> pel2.getTitulo().compareTo(pel1.getTitulo()));

    }

    public void OrdenarDirector(ArrayList<Pelicula> ListaPelicula) {

        Collections.sort(ListaPelicula, (pel1, pel2) -> pel2.getAutor().compareTo(pel1.getAutor()));
    }

    public void mostrarMenu() {

        System.out.println("""
                           1.Mostrar peliculas 
                           2.Mostrar peliculas cuales la duración es mayor a 1 hora 
                           3.Mostrar peliculas segun su duración (Ascendente)
                           4.Mostrar peliculas segun su duración (Descendente)
                           5.Mostrar peliculas segun su titulo
                           6.Mostrar peliculas segun su autor
                           7.Mostrar menu
                           8.Salir
                           """);
    }
}
