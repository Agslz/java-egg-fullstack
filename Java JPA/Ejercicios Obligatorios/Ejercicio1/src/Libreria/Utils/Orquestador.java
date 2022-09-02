package Libreria.Utils;

import java.util.Scanner;
import Libreria.Constantes.Constantes;
import Libreria.Entidades.Autor;
import Libreria.Entidades.Editorial;
import Libreria.Servicios.AutorServicios;
import Libreria.Servicios.ClienteServicios;
import Libreria.Servicios.EditorialServicios;
import Libreria.Servicios.LibroServicios;
import Libreria.Servicios.PrestamoServicios;

public class Orquestador {

    public static final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private static final LibroServicios libroServicios = new LibroServicios();
    private static final AutorServicios autorServicios = new AutorServicios();
    private static final EditorialServicios editorialServicios = new EditorialServicios();
    private static final ClienteServicios clienteServicios = new ClienteServicios();
    private static final PrestamoServicios prestamosServicios = new PrestamoServicios();

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
                case 4:
                    menuCliente();
                    break;
                case 5:
                    menuPrestamo();
                    break;
                default:
                    System.out.println(Constantes.OPCION_INCORRECTA);
            }

        } while (opc != 6);
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
                    String nombre = leer.next();
                    autorServicios.crearAutor(nombre, autorServicios.pedirAltaAutor());
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
                    System.out.println(Constantes.INGRESE_ISBN);
                    Long isbn = leer.nextLong();
                    System.out.println(Constantes.INGRESE_TITULO);
                    String titulo = leer.next();
                    System.out.println(Constantes.INGRESE_ANIO_LANZAMIENTO);
                    Integer anio = leer.nextInt();
                    System.out.println(Constantes.INGRESE_COPIAS_LIBROS);
                    Integer copias = leer.nextInt();
                    System.out.println(Constantes.INGRESE_NOMBRE_AUTOR);
                    Autor autores = libroServicios.pedirAutor(leer.next());
                    System.out.println(Constantes.INGRESE_NOMBRE_EDITORIAL);
                    Editorial editoriales = libroServicios.pedirEditorial(leer.next());
                    libroServicios.crearLibro(isbn, titulo, anio, copias, autores, editoriales);
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
                    String nombre = leer.next();
                    editorialServicios.crearEditorial(nombre, editorialServicios.pedirAltaEditorial());
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

    public static void menuCliente() throws Exception {

        int opc;

        do {
            System.out.println(Constantes.OPCIONES_MENU_CLIENTE);

            System.out.println(Constantes.INGRESE_OPCION);

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println(Constantes.INGRESE_DOCUMENTO_CLIENTE);
                    Long dni = leer.nextLong();
                    System.out.println(Constantes.INGRESE_NOMBRE_CLIENTE);
                    String nombre = leer.next();
                    System.out.println(Constantes.INGRESE_APELLIDO_CLIENTE);
                    String apellido = leer.next();
                    System.out.println(Constantes.INGRESE_TELEFONO_CLIENTE);
                    String telefono = leer.next();
                    System.out.println(clienteServicios.crearCliente(dni, nombre, apellido, telefono));
                    break;
                case 2:
                    clienteServicios.mostrarTodosLosClientes().forEach(System.out::println);
                    break;
                case 3:
                    System.out.println(Constantes.INGRESE_NOMBRE_CLIENTE);
                    clienteServicios.mostrarClientePorNombre(leer.next()).forEach(System.out::println);
                    break;
                case 4:
                    System.out.println(Constantes.INGRESE_ID_CLIENTE);
                    System.out.println(clienteServicios.mostrarClientePorID(leer.next()));
                    break;
                case 5:
                    System.out.println(Constantes.INGRESE_ID_CLIENTE);
                    String id = leer.next();
                    System.out.println(Constantes.INGRESE_DOCUMENTO_CLIENTE);
                    dni = leer.nextLong();
                    System.out.println(Constantes.INGRESE_NOMBRE_CLIENTE);
                    nombre = leer.next();
                    System.out.println(Constantes.INGRESE_APELLIDO_CLIENTE);
                    apellido = leer.next();
                    System.out.println(Constantes.INGRESE_TELEFONO_CLIENTE);
                    telefono = leer.next();
                    System.out.println(clienteServicios.modificarClientePorID(id, nombre, apellido, dni, telefono));
                    break;
                case 6:
                    menuprincipal();
                    break;
                default:
                    System.out.println(Constantes.OPCION_INCORRECTA);
            }

        } while (opc != 6);

    }

    public static void menuPrestamo() throws Exception {

    }

}
