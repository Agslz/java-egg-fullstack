package Main;

import Servicios.ServiciosSimulador;
import java.util.Scanner;

public class Ejercicio4 {

    private static final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private static final ServiciosSimulador ServS = new ServiciosSimulador();

    public static void main(String[] args) {

        ServS.generarAlumnos();

    }

}
