package Servicios;

import Constantes.Constantes;
import Entidades.Perro;
import Entidades.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosPersona {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final ServiciosPerro Servp = new ServiciosPerro();

    public Persona crearPersona() {

        Persona nuevaPersona = new Persona();

        System.out.println(Constantes.NOMBRE);

        nuevaPersona.setNombre(leer.next());

        System.out.println(Constantes.APELLIDO);

        nuevaPersona.setApellido(leer.next());

        System.out.println(Constantes.EDAD);

        nuevaPersona.setEdad(leer.nextInt());

        System.out.println(Constantes.DNI);

        nuevaPersona.setDNI(leer.nextInt());

        return nuevaPersona;

    }
}
