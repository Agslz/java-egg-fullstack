package Servicios;

import Entidades.Cadena;

import java.util.Scanner;

public class ServiciosCadena {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {

        Cadena c1 = new Cadena();

        System.out.println("Ingrese una frase");

        c1.setFrase(leer.next());

        c1.setLongitud(c1.getFrase().length());

        return c1;

    }

    public void mostrarVocales(Cadena c1) {

        int contVocales = 0;

        String frase = c1.getFrase();

        frase = frase.toUpperCase();

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == 'A' || frase.charAt(i) == 'E' || frase.charAt(i) == 'I' || frase.charAt(i) == 'O' || frase.charAt(i) == 'U') {

                contVocales++;

            }

        }

        System.out.println("La frase ingresada tiene " + contVocales + " vocales ");

    }

    public void invertirFrase(Cadena c1) {

        String frase = c1.getFrase();

        System.out.println("La frase ingresda es:" + frase);

        StringBuilder strb = new StringBuilder(frase);

        frase = strb.reverse().toString();

        System.out.println("La frase invertida es:" + frase);

    }

    public int vecesRepetido(Cadena c1, String letra) {

        letra = letra.substring(0, 1).toUpperCase();

        String frase = c1.getFrase().toUpperCase();

        int contRepetido = 0;

        for (int i = 0; i < c1.getFrase().length(); i++) {

            if (frase.substring(i, i + 1).equals(letra)) {

                contRepetido++;
            }
        }

        return contRepetido;

    }

    public void compararLongitud(Cadena c1, String frase) {

        if (c1.getFrase().length() > frase.length()) {

            System.out.println("La longitud de la frase anterior es mayor a la actual");

        } else if (c1.getFrase().length() < frase.length()) {

            System.out.println("La longitud de la frase actual es mayor a la anterior");

        } else {

            System.out.println("La longitud de las frases son iguales");

        }

    }

    public void unirFrases(Cadena c1, String frase) {

        System.out.println("Las frases unidas son :");

        System.out.println(c1.getFrase() + " " + frase);

    }

    public void reemplazar(Cadena c1, String letra) {

        String nuevaFrase = c1.getFrase().replace("a", letra);

        System.out.println("La frase con caracteres reemplazados es: " + nuevaFrase);
    }

    public boolean contiene(Cadena c1, String letra) {

        if (c1.getFrase().contains(letra)) {

            return true;

        }
        return false;

    }

    public void mostrarMenu() {

        System.out.println("1.Mostrar vocales");
        System.out.println("2.Invertir frase");
        System.out.println("3.Cantidad de veces que un caracter está repetido en la frase");
        System.out.println("4.Comparar longiutd de las frases");
        System.out.println("5.Unir frases");
        System.out.println("6.Reemplazar vocales");
        System.out.println("7.Comprobar si contiene una letra ingresada");
        System.out.println("8.Volver a mostrar este menu");
        System.out.println("9.Salir");

    }

}
