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
                    autorServicios.guardarAutor();
                    break;
                case 2:
                    autorServicios.mostrarTodosLosAutores();
                    break;
                case 3:
                    autorServicios.mostrarAutorPorID();
                    break;
                case 4:
                    autorServicios.mostrarAutorPorNombre();
                    break;
                case 5:
                    autorServicios.modificarAutorPorID();
                    break;
                case 6:
                    autorServicios.darAutorDeAlta();
                    break;
                case 7:
                    autorServicios.darAutorDeBaja();
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
                    libroServicios.mostrarTodosLosLibros();
                    break;
                case 3:
                    libroServicios.mostrarLibroPorIsbn();
                    break;
                case 4:
                    libroServicios.mostrarLibroPorTitulo();
                    break;
                case 5:
                    libroServicios.mostrarLibrosDeUnAutor();
                    break;
                case 6:
                    libroServicios.mostrarLibrosDeUnaEditorial();
                    break;
                case 7:
                    libroServicios.darLibro();
                    break;
                case 8:
                    libroServicios.devolverLibro();
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
                    editorialServicios.guardarEditorial();
                    break;
                case 2:
                    editorialServicios.mostrarTodasEditoriales();
                    break;
                case 3:
                    editorialServicios.mostrarEditorialPorId();
                    break;
                case 4:
                    editorialServicios.mostrarEditorialPorNombre();
                    break;
                case 5:
                    editorialServicios.modificarEditorialPorID();
                    break;
                case 6:
                    editorialServicios.DarEditorialDeAlta();
                    break;
                case 7:
                    editorialServicios.DarEditorialDeBaja();
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
