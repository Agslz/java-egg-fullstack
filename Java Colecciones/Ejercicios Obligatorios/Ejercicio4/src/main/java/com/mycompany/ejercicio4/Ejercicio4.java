package com.mycompany.ejercicio4;

import Entidades.Pelicula;
import Servicios.ServicioPelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {

    static final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static ServicioPelicula ServP = new ServicioPelicula();

    public static void main(String[] args) {

        ArrayList<Pelicula> ListaPelicula = new ArrayList();

        int opc2;

        String opc = "SI";

        while (!opc.equalsIgnoreCase("NO")) {

            ListaPelicula.add(ServP.crearPelicula());

            System.out.println("Desea ingresar otra pelicula? (SI/NO)");

            opc = leer.next().substring(0, 2);

        }
        ServP.mostrarMenu();
        
        do {

            System.out.println("Ingrese una opción");

            opc2 = leer.nextInt();

            switch (opc2) {
                case 1 ->
                    ServP.mostrarPeliculas(ListaPelicula);
                case 2 ->
                    ServP.mostrarPeliculaMayor1Hora(ListaPelicula);
                case 3 -> {
                    ServP.OrdenarMayorMenor(ListaPelicula);
                    ServP.mostrarPeliculas(ListaPelicula);
                }
                case 4 -> {
                    ServP.OrdernarMenorMayor(ListaPelicula);
                    ServP.mostrarPeliculas(ListaPelicula);
                }
                case 5 -> {
                    ServP.OrdenarTitulo(ListaPelicula);
                    ServP.mostrarPeliculas(ListaPelicula);
                }
                case 6 -> {
                    ServP.OrdenarDirector(ListaPelicula);
                    ServP.mostrarPeliculas(ListaPelicula);
                }
                case 7 -> {
                    ServP.mostrarMenu();
                }
                case 8 -> {
                    System.out.println("Salió");
                }
                default ->
                    System.out.println("Opción ingresada no valida");
            }
        } while (opc2 != 8);
    }
}
