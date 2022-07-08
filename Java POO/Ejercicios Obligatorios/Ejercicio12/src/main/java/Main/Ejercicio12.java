package Main;

import Entidades.Personas;
import Servicios.ServiciosPersonas;
import java.util.Scanner;

public class Ejercicio12 {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        ServiciosPersonas Servp1 = new ServiciosPersonas();

        Personas p1 = Servp1.crearPersona();

        int opcion;

        System.out.println("""
                           1.Calcular Edad 
                           2.Comparar edades 
                           3.Mostrar informaci\u00f3n
                           4.Salir""");

        do {

            System.out.println("Ingrese una opcion");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1 ->
                    Servp1.calcularEdad(p1);
                case 2 -> {
                    System.out.println("Ingrese la edad a comparar");

                    int edad = leer.nextInt();

                    System.out.println("La persona es mayor que la edad ingresada?");

                    Servp1.menorQue(p1, edad);
                }
                case 3 ->
                    Servp1.mostrarPersona(p1);
                case 4 ->
                    System.out.println("Usted salió");
                default -> {
                    System.out.println("Opcion incorrecta");

                }
            }

        } while (opcion != 4);

    }
}
