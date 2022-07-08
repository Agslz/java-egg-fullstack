package Servicios;

import Entidades.Libreria;
import java.util.HashSet;
import java.util.Scanner;

public class ServiciosLibreria {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libreria crearLibro() {

        Libreria l1 = new Libreria();

        System.out.println("Ingrese el titulo del libro");

        l1.setTitulo(leer.next());

        System.out.println("Ingrese el nombre del autor");

        l1.setAutor(leer.next());

        System.out.println("Ingrese el numero de ejemplares");

        l1.setNumeroEjemplares(leer.nextInt());

        l1.setNumeroEjemplaresPrestados(0);

        return l1;

    }

    public boolean prestamos(HashSet<Libreria> Libro) {

        System.out.println("Ingrese el titulo del libro que desea retirar");

        String buscar = leer.next();

        for (Libreria libreria : Libro) {

            if (libreria.getTitulo().equals(buscar) && libreria.getNumeroEjemplares() >= 1) {

                System.out.println("Se encontró el libro " + buscar);

                libreria.setNumeroEjemplares(libreria.getNumeroEjemplares() - 1);

                return true;

            } else {

                if (libreria.getNumeroEjemplares() <= 0) {

                    System.out.println("El libro " + buscar + " no se encuentra disponible para el prestamo, Motivo: Pocos Ejemplares");

                    return false;
                }
            }
        }

        System.out.println("El libro " + buscar + " no se encuentra disponible para el prestamo, Motivo: El libro no existe");

        return false;
    }

    public boolean devolucion(HashSet<Libreria> Libro) {

        System.out.println("Ingrese el titulo del libro a devolver");

        String devolver = leer.next();

        for (Libreria libreria : Libro) {

            if (libreria.getTitulo().equals(devolver)) {
                
                System.out.println("Se devolvió el libro " + devolver + " con exito");

                libreria.setNumeroEjemplares(libreria.getNumeroEjemplares() + 1);

                return true;

            } else {

                if (libreria.getNumeroEjemplares() <= 0) {

                    System.out.println("El libro " + devolver + " no se encuentra, Motivo: Pocos ejemplares");

                    return false;
                }
            }
        }

        System.out.println("El libro " + devolver + " no se encuentra disponible, Motivo: El libro no existe");

        return false;

    }

    public void mostrarLibro(HashSet<Libreria> Libro) {

        for (Libreria var : Libro) {

            System.out.println(var);

        }
    }

    public void menu() {

        System.out.println("""
                           1.Agregar Libros
                           2.Pedir un libro
                           3.Devolver un libro
                           4.Mostrar libros
                           5.Menu
                           6.Salir
                           """);

    }
}
