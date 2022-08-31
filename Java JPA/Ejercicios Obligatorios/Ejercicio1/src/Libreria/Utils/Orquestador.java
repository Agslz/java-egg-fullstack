package Libreria.Utils;

import java.util.Scanner;
import Libreria.Constantes.Constantes;
import Libreria.Servicios.AutorServicios;
import Libreria.Servicios.EditorialServicios;
import Libreria.Servicios.LibroServicios;

public class Orquestador {

    public static final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private static final LibroServicios libroServicios = new LibroServicios();
    private static final AutorServicios autorServicios = new AutorServicios();
    private static final EditorialServicios editorialServicios = new EditorialServicios();

    public static void menuprincipal() throws Exception {

        int opc;

        do {

            System.out.println(Constantes.OPCIONES_MENU_PRINCIPAL);

            System.out.println(Constantes.INGRESE_OPCION);

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    menuAutor();
                    break;
                case 2:
                    menuLibro();
                    break;
                case 3:
                    menuEditorial();
                    break;
                default:
                    System.out.println(Constantes.OPCION_INCORRECTA);
            }

        } while (opc != 4);
        System.out.println(Constantes.SALIDA);

    }

    public static void menuAutor() throws Exception {

        int opc;

        do {

            System.out.println(Constantes.OPCIONES_MENU_AUTOR);

            System.out.println(Constantes.INGRESE_OPCION);

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println(Constantes.INGRESE_NOMBRE_AUTOR);
                    autorServicios.guardarAutor();
                    break;
                case 2:
                    autorServicios.mostrarTodosLosAutores().forEach(System.out::println);
                    break;
                case 3:
                    System.out.println(Constantes.INGRESE_AUTOR_ID);
                    System.out.println(autorServicios.mostrarAutorPorID(leer.next()));
                    break;
                case 4:
                    System.out.println(Constantes.INGRESE_NOMBRE_AUTOR);
                    System.out.println(autorServicios.mostrarAutorPorNombre(leer.next()));
                    break;
                case 5:
                    System.out.println(Constantes.INGRESE_AUTOR_ID);
                    System.out.println(autorServicios.modificarAutorPorID(leer.next()));
                    break;
                case 6:
                    System.out.println(Constantes.INGRESE_AUTOR_ID);
                    System.out.println(autorServicios.darAutorDeAlta());
                    break;
                case 7:
                    System.out.println(Constantes.INGRESE_AUTOR_ID);
                    System.out.println(autorServicios.darAutorDeBaja());
                    break;
                case 8:
                    menuprincipal();
                    break;
                default:
                    System.out.println(Constantes.OPCION_INCORRECTA);
            }

        } while (opc != 8);

    }

    public static void menuLibro() throws Exception {

        int opc;

        do {

            System.out.println(Constantes.OPCIONES_MENU_LIBRO);

            System.out.println(Constantes.INGRESE_OPCION);

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    libroServicios.guardarLibro();
                    break;
                case 2:
                    libroServicios.mostrarTodosLosLibros().forEach(System.out::println);
                    break;
                case 3:
                    System.out.println(Constantes.INGRESE_ISBN);
                    System.out.println(libroServicios.mostrarLibroPorIsbn(leer.next()));
                    break;
                case 4:
                    System.out.println(Constantes.INGRESE_TITULO);
                    System.out.println(libroServicios.mostrarLibroPorTitulo(leer.next()));
                    break;
                case 5:
                    System.out.println(Constantes.INGRESE_NOMBRE_AUTOR);
                    libroServicios.mostrarLibrosDeUnAutor(leer.next()).forEach(System.out::println);
                    break;
                case 6:
                    System.out.println(Constantes.INGRESE_NOMBRE_EDITORIAL);
                    libroServicios.mostrarLibrosDeUnaEditorial(leer.next()).forEach(System.out::println);
                    break;
                case 7:
                    System.out.println(Constantes.INGRESE_TITULO);
                    System.out.println(libroServicios.darLibro(leer.next()));
                    break;
                case 8:
                    System.out.println(Constantes.INGRESE_TITULO);
                    System.out.println(libroServicios.devolverLibro(leer.next()));
                    break;
                case 9:
                    menuprincipal();
                    break;
                default:
                    System.out.println(Constantes.OPCION_INCORRECTA);
            }

        } while (opc != 9);

    }

    public static void menuEditorial() throws Exception {

        int opc;

        do {

            System.out.println(Constantes.OPCIONES_MENU_EDITORIAL);

            System.out.println(Constantes.INGRESE_OPCION);

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println(Constantes.INGRESE_NOMBRE_EDITORIAL);
                    editorialServicios.guardarEditorial();
                    break;
                case 2:
                    editorialServicios.mostrarTodasEditoriales().forEach(System.out::println);
                    break;
                case 3:
                    System.out.println(Constantes.INGRESE_EDITORIAL_ID);
                    System.out.println(editorialServicios.mostrarEditorialPorId(leer.next()));
                    break;
                case 4:
                    System.out.println(Constantes.INGRESE_NOMBRE_EDITORIAL);
                    System.out.println(editorialServicios.mostrarEditorialPorNombre(leer.next()));
                    break;
                case 5:
                    System.out.println(Constantes.INGRESE_EDITORIAL_ID);
                    editorialServicios.modificarEditorialPorID(leer.next());
                    break;
                case 6:
                    System.out.println(Constantes.INGRESE_EDITORIAL_ID);
                    System.out.println(editorialServicios.DarEditorialDeAlta(leer.next()));
                    break;
                case 7:
                    System.out.println(Constantes.INGRESE_EDITORIAL_ID);
                    System.out.println(editorialServicios.DarEditorialDeBaja(leer.next()));
                    break;
                case 8:
                    menuprincipal();
                    break;
                default:
                    System.out.println(Constantes.OPCION_INCORRECTA);
            }

        } while (opc != 8);

    }

}
