package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

public class ServiciosAhorcado {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {

        Ahorcado p1 = new Ahorcado();

        String[] vectorPalabra;

        int contador = 0;

        System.out.println("Ingrese una palabra");

        String palabra = leer.next();

        System.out.println("Ingrese la cantidad de intentos");

        int intentosMaximos = leer.nextInt();

        vectorPalabra = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            
            contador++;

            vectorPalabra[i] = palabra.substring(contador - 1, contador);

            p1.setVectorPalabra(vectorPalabra);

        }
        
        p1.setJugadaMaxima(intentosMaximos);

        p1.setLetrasEncontradas(0);

        p1.setLongitud(palabra.length());

        return p1;

    }

    public void longitud(Ahorcado p1) {

        System.out.println("La palabra tiene " + p1.getLongitud() + " letras");

    }

    public void buscarLetra(Ahorcado p1, String letra) {

        int contador = 0;

        for (int i = 0; i < p1.getLongitud(); i++) {

            if (p1.getVectorPalabra()[i].equals(letra)) {

                contador++;

            }

        }
        if (contador > 0) {
            System.out.println("La letra pertenece a la palabra");

        } else {

            System.out.println("La letra no se encuentra en la palabra");
        }

    }

    public boolean encontradas(Ahorcado p1, String letra) {

        int contador = 0;

        boolean bandera;

        for (int i = 0; i < p1.getLongitud(); i++) {

            if (p1.getVectorPalabra()[i].equals(letra)) {

                contador++;

            }

        }

        bandera = contador > 0;

        return bandera;

    }

    public void intentos(Ahorcado p1) {

        int intentos = p1.getJugadaMaxima();

        p1.setJugadaMaxima(intentos - 1);

        System.out.println("Número de oportunidades restantes " + p1.getJugadaMaxima());

    }

    public void mostrarPalabra(Ahorcado p1) {

        for (int i = 0; i < p1.getLongitud(); i++) {

            System.out.print(p1.getVectorPalabra()[i]);

        }

    }

    public void juego() {

        String letra;

        int contadorEnc = 0;

        Ahorcado J1 = crearJuego();

        System.out.println("Pista");

        longitud(J1);

        System.out.println();

        do {

            System.out.println("Ingrese una letra");

            letra = leer.next();

            System.out.println();

            buscarLetra(J1, letra);

            if (encontradas(J1, letra) == true) {
                contadorEnc++;
            }

            System.out.println("Número de letras (encontradas, faltantes): " + "(" + contadorEnc + ";" + (J1.getLongitud() - contadorEnc + ")"));

            intentos(J1);

            if (contadorEnc == J1.getLongitud()) {

                System.out.println();

                System.out.println("Felicidades, Ganaste!!!");

                System.out.print("La palabra es  ");

                mostrarPalabra(J1);

                System.out.println();
            }

            if (J1.getJugadaMaxima() >= 0) {

                System.out.println("Se te acabaron los intentos ");

                System.out.println();

            }

        } while (J1.getJugadaMaxima() != 0 && contadorEnc != J1.getLongitud());
    }

}
