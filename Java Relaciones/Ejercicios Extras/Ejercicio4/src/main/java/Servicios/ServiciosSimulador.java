package Servicios;

import Constantes.Constantes;

import java.util.Scanner;

public class ServiciosSimulador {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public String[] generarNombresAleatorios(int cantidad) {

        String[] nombresAleatorios = new String[cantidad];

        String[] nombres = {"Andrea", "David", "Baldomero", "Balduino", "Baldwin", "Baltasar", "Barry", "Bartolo",
                "Bartolomé", "Baruc", "Baruj", "Candelaria", "Cándida", "Canela", "Marisa", "Carina", "Carisa",
                "Caritina", "Carlota", "Baltazar", "Agustin", "Matias", "Luca", "Lautaro", "Lucia", "Julian", "Geronimo","Edward"};

        String[] apellidos = {"Gomez", "Guerrero", "Cardenas", "Cardiel", "Cardona", "Cardoso", "Cariaga", "Carillo",
                "Carion", "Castillo", "Castorena", "Castro", "Fucili", "Gracie", "Ocampo", "Gracia", "Garcia",
                "Bacarelli", "Schulze", "Monteleone", "Blanes", "Galindo", "Addamo", "Vidal", "Perez", "Snowden", "Carrillo", "Gomez"};

        for (int i = 0; i < cantidad; i++) {
            nombresAleatorios[i] = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) + 1) + 0))] + " "
                    + apellidos[(int) (Math.floor(Math.random() * ((apellidos.length - 1) + 1) + 0))];
        }
        return nombresAleatorios;
    }

    public Integer[] generarDNIsAleatorios(int cantidad) {

        Integer[] DNIsAleatorios = new Integer[cantidad];

        for (int i = 0; i < cantidad; i++) {
            DNIsAleatorios[i] = (int) (30000000 + Math.random() * 19000000);
        }
        return DNIsAleatorios;
    }

    public void imprimirNombres(String[] nombresGenerados) {
        for (String nombresGenerado : nombresGenerados) {
            System.out.println(nombresGenerado);
        }
    }

    public void imprimirDNIS(Integer[] DNIsAleatorios) {
        for (Integer var : DNIsAleatorios) {
            System.out.println(var);
        }
    }

    public void generarAlumnos() {
        System.out.println(Constantes.CANTIDAD_ALUMNOS);
        int cantidad = leer.nextInt();
        imprimirNombres(generarNombresAleatorios(cantidad));
        System.out.println(Constantes.CANTIDAD_DNI);
        imprimirDNIS(generarDNIsAleatorios(cantidad));
    }
}

