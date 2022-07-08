package Servicios;

import Constantes.Constantes;
import Entidades.Perro;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosPerro {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Perro crearPerro() {

        Perro nuevoPerro = new Perro();

        System.out.println(Constantes.NOMBRE_PERRO);

        nuevoPerro.setNombre(leer.next());

        System.out.println(Constantes.RAZA);

        nuevoPerro.setRaza(leer.next());

        System.out.println(Constantes.EDAD_MASCOTA);

        nuevoPerro.setEdad(leer.nextInt());

        System.out.println(Constantes.TAMANO);

        nuevoPerro.setTamano(leer.next());

        return nuevoPerro;
    }
}
