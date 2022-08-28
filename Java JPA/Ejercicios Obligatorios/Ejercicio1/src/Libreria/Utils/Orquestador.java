package Libreria.Utils;

import java.util.Scanner;
import Libreria.Constantes.Constantes;

public class Orquestador {

    public static final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void crearOrquestador() {

        menuprincipal();

    }

    public static void menuprincipal() {

        System.out.println(Constantes.OPCIONES_MENU_PRINCIPAL);

        System.out.println(Constantes.INGRESE_OPCION);

        int opc = leer.nextInt();

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
                System.out.println(Constantes.SALIDA);
                break;
            default:
                System.out.println(Constantes.OPCION_INCORRECTA);
        }

    }

    public static void menuAutor() {

        System.out.println(Constantes.OPCIONES_MENU_AUTOR);

        System.out.println(Constantes.INGRESE_OPCION);

        int opc = leer.nextInt();

        switch (opc) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:
                System.out.println(Constantes.VOLVER_MENU_PRINCIPAL);
                menuprincipal();
                break;
            default:
                System.out.println(Constantes.OPCION_INCORRECTA);
        }

    }

    public static void menuLibro() {

        System.out.println(Constantes.OPCIONES_MENU_LIBRO);

        System.out.println(Constantes.INGRESE_OPCION);

        int opc = leer.nextInt();

        switch (opc) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:

                break;
            case 9:
                System.out.println(Constantes.VOLVER_MENU_PRINCIPAL);
                menuprincipal();
                break;
            default:
                System.out.println(Constantes.OPCION_INCORRECTA);
        }

    }

    public static void menuEditorial() {

        System.out.println(Constantes.OPCIONES_MENU_EDITORIAL);

        System.out.println(Constantes.INGRESE_OPCION);

        int opc = leer.nextInt();

        switch (opc) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:
                System.out.println(Constantes.VOLVER_MENU_PRINCIPAL);
                menuprincipal();
                break;
            default:
                System.out.println(Constantes.OPCION_INCORRECTA);
        }

    }

}
