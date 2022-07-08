package Utils;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;

public class Orquestador {

    public static void crearOrquestador() {

        ArrayList<Edificio> listaEdificios = new ArrayList<>();

        crearEdificios(listaEdificios);

        mostrarSupYVol(listaEdificios);

        mostrarCantidadTechados(listaEdificios);

    }

    public static void crearEdificios(ArrayList<Edificio> listaEdificios) {

        for (int i = 0; i < 2; i++) {

            Polideportivo newPolideportivo = new Polideportivo();

            newPolideportivo.crearPolideportivo();

            listaEdificios.add(newPolideportivo);

        }

        for (int i = 0; i < 2; i++) {

            EdificioDeOficinas newEdificioDeOficinas = new EdificioDeOficinas();

            newEdificioDeOficinas.crearEdificioDeOficinas();

            listaEdificios.add(newEdificioDeOficinas);

        }

    }

    public static void mostrarSupYVol(ArrayList<Edificio> listaEdificios) {

        for (Edificio aux : listaEdificios) {

            System.out.println(aux);

            aux.calcularSuperficie();

            aux.calcularVolumen();
        }

    }

    public static void mostrarCantidadTechados(ArrayList<Edificio> listaEdificios) {

        int cantidadTechados = 0;
        int cantidadNoTechados = 0;

        for (Edificio aux : listaEdificios) {

            if (aux instanceof Polideportivo polideportivo) {

                if (polideportivo.isTecho()) {

                    cantidadTechados++;

                } else {

                    cantidadNoTechados++;

                }

            }

            if (aux instanceof EdificioDeOficinas edificioDeOficinas) {

                edificioDeOficinas.cantPersonas();

            }

        }

    }

}
