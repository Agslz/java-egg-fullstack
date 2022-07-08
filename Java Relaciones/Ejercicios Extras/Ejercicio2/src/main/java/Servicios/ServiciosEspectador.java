package Servicios;

import Constantes.Constantes;
import Entidades.Espectador;

import java.util.Scanner;

public class ServiciosEspectador {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Espectador crearEspectador() {

        Espectador ep = new Espectador();

        System.out.println(Constantes.NOMBRE_ESPECTADOR);

        ep.setNombreEspectador(leer.next());

        System.out.println(Constantes.APELLIDO_ESPECTADOR);

        ep.setApellidoEspectador(leer.next());

        System.out.println(Constantes.EDAD_ESPECTADOR);

        ep.setEdadEspectador(leer.nextInt());

        System.out.println(Constantes.DINERO_DISPONIBLE);

        ep.setDineroDisponible(leer.nextInt());

        return ep;
    }

}
