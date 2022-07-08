package Servicios;

import Entidades.Perro;
import java.util.Scanner;

public class ServiciosPerro {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Perro crearPerro() {

        Perro p = new Perro();

        System.out.println("Ingrese el nombre de su perro");

        p.setNombre(leer.next());

        System.out.println("Ingrese la raza de su perro");

        p.setRaza(leer.next());

        System.out.println("Ingrese el tamaño de su perro (Pequeño/Mediano/Grande)");

        p.setTamano(leer.next());

        System.out.println("Ingrese la edad de su perro");

        p.setEdad(leer.nextInt());

        return p;
    }

    public void mostrarPerro(Perro p) {

        System.out.println("Nombre: " + p.getNombre());

        System.out.println("Raza: " + p.getRaza());

        System.out.println("Tamaño: " + p.getTamano());

        System.out.println("Edad: " + p.getEdad());
    }
}
