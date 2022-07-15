package Utils;

import Entidades.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import Constantes.Constantes;

public class Orquestador {

    private static final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void crearOrquestador() {

        int opc;

        List<Alojamiento> listaAlojamientos = new ArrayList();
        List<Hotel> listaHoteles = new ArrayList<>();

        crearHoteles(listaHoteles, listaAlojamientos);
        crearAlojamientosExtraHoteleros(listaAlojamientos);

        System.out.println(Constantes.MENU);

        do {

            System.out.println(Constantes.OPCION_MENU);

            opc = leer.nextInt();

            switch (opc) {
                case 1 ->
                    mostrarAlojamientos(listaAlojamientos);
                case 2 -> {
                    OrdenarMayorMenorPrecioHotel(listaHoteles);
                    mostrarHoteles(listaHoteles);
                }
                case 3 ->
                    mostrarAlojamientosExtraHoteleros(listaAlojamientos);
                case 4 ->
                    mostrarCampingRestaurantes(listaAlojamientos);
                case 5 ->
                    mostrarResidencias(listaAlojamientos);
                case 6 ->
                    System.out.println(Constantes.MENU);
                case 7 -> {
                    System.out.println("Usted salió");
                }
                default ->
                    System.out.println("La opción ingresada es invalida");
            }

        } while (opc != 7);

    }

    public static void OrdenarMayorMenorPrecioHotel(List<Hotel> listaHoteles) {

        Collections.sort(listaHoteles, (h1, h2) -> h2.getPrecioHabitaciones().compareTo(h1.getPrecioHabitaciones()));

    }

    public static void mostrarAlojamientos(List<Alojamiento> listaAlojamientos) {

        listaAlojamientos.forEach((Alojamiento aux) -> System.out.println(aux));

    }

    public static void mostrarHoteles(List<Hotel> listaHoteles) {

        listaHoteles.forEach((Hotel aux) -> System.out.println(aux));

    }

    public static void mostrarResidencias(List<Alojamiento> listaAlojamientos) {

        for (Alojamiento listaAlojamiento : listaAlojamientos) {

            if (listaAlojamiento instanceof Residencia residenciaAux) {

                if (residenciaAux.isDescuentosGremios()) {

                    System.out.println(listaAlojamiento);

                }

            }

        }

    }

    public static void mostrarAlojamientosExtraHoteleros(List<Alojamiento> listaAlojamientos) {

        for (Alojamiento aux : listaAlojamientos) {

            if (aux instanceof Camping) {
                System.out.println(aux);
            }

            if (aux instanceof Residencia) {
                System.out.println(aux);

            }

        }

    }

    public static void mostrarCampingRestaurantes(List<Alojamiento> listaAlojamientos) {

        for (Alojamiento aux : listaAlojamientos) {

            if (aux instanceof Camping campingAux) {

                if (campingAux.isPoseeRestaurante()) {

                    System.out.println(aux);

                }

            }

        }

    }

    public static void crearHoteles(List<Hotel> listaHoteles, List<Alojamiento> listaAlojamientos) {

        for (int i = 0; i < 1; i++) {

            HotelCuatroEstrellas newHotelCuatroEstrellas = new HotelCuatroEstrellas();
            HotelCincoEstrellas newHotelCincoEstrellas = new HotelCincoEstrellas();

            newHotelCuatroEstrellas.crearHotelCuatroEstrellas();
            newHotelCuatroEstrellas.calcularPrecio();
            newHotelCincoEstrellas.crearHotelCincoEstrellas();
            newHotelCincoEstrellas.calcularPrecio();

            listaHoteles.add(newHotelCincoEstrellas);
            listaHoteles.add(newHotelCuatroEstrellas);

            listaAlojamientos.add(newHotelCuatroEstrellas);
            listaAlojamientos.add(newHotelCincoEstrellas);

            System.out.println("----------------------------------------------");

        }

    }

    public static void crearAlojamientosExtraHoteleros(List<Alojamiento> listaAlojamientos) {

        for (int i = 0; i < 1; i++) {

            Residencia newResidencia = new Residencia();
            Camping newCamping = new Camping();

            newResidencia.crearResidencia();
            newCamping.crearCamping();

            listaAlojamientos.add(newResidencia);
            listaAlojamientos.add(newCamping);

            System.out.println("----------------------------------------------");

        }

    }

}
