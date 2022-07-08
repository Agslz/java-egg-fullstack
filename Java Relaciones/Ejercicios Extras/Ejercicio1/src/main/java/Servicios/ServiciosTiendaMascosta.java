package Servicios;

import Constantes.Constantes;
import Entidades.Perro;
import Entidades.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosTiendaMascosta {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final ServiciosPersona ServPersona = new ServiciosPersona();
    private final ServiciosPerro ServPerro = new ServiciosPerro();
    ArrayList<Persona> listaPersonas = new ArrayList<>();
    ArrayList<Perro> listaPerro = new ArrayList<>();

    public void crearClientes() {

        Persona personaActual;

        String opc;

        do {

            listaPersonas.add(ServPersona.crearPersona());

            System.out.println(Constantes.OPC_PERSONA);

            opc = leer.next();

        } while (!opc.equalsIgnoreCase("NO"));

        do {

            listaPerro.add(ServPerro.crearPerro());

            System.out.println(Constantes.OPC_PERRO);

            opc = leer.next();

        } while (!opc.equalsIgnoreCase("NO"));

        mostrarPerro();

        do {

            System.out.println(Constantes.NOMBRE);

            personaActual = buscaPersona();

            if (personaActual != null) {

                adopcion(listaPerro, personaActual);
            }

            System.out.println(Constantes.INGRESAR_PERROS);

            opc = leer.next();

        } while (!opc.equalsIgnoreCase("NO"));


    }

    public void adopcion(ArrayList<Perro> listaPerro, Persona persona) {

        System.out.println(Constantes.BUSQUEDA_PERRO_ADOPTAR);

        Perro adoptar = buscarPerro();

        if (adoptar == null) {
            System.out.println(Constantes.PERRO_NO_ADOPTADO);
            return;
        }

        if (adoptar.isAdoptado()) {
            System.out.println(Constantes.PERRO_ADOPTADO);
            return;
        }

        adoptar.setAdoptado(true);

        persona.setPerro(adoptar);

        System.out.println(Constantes.PERRO_ADOPTADO);

    }

    public void mostrarPerro() {
        for (Perro aux : listaPerro) {
            System.out.println(aux);
        }
    }

    public Perro buscarPerro() {
        String nombre = leer.next();
        for (Perro aux : listaPerro) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                return aux;
            }
        }
        return null;
    }

    public Persona buscaPersona() {
        String nombre = leer.next();
        for (Persona aux : listaPersonas) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                return aux;
            }
        }
        return null;
    }
}
