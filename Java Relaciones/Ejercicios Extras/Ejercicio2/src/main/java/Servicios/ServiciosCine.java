package Servicios;

import Entidades.Cine;
import Entidades.Pelicula;

public class ServiciosCine {

    private final ServiciosPelicula ServPelicula = new ServiciosPelicula();

    public Cine crearCine() {

        Cine newCine = new Cine();

        newCine.setPrecioEntrada(100);

        newCine.setNombrePeliculaReproduciendo(ServPelicula.crearPelicula());

        String[][] Sala = new String[8][6];

        for (int i = 0; i < 6; i++) {
            System.out.print("|");
            for (int j = 0; j < 8; j++) {
                System.out.print(Sala[i][j]);
                if (j != Sala[i].length - 1) System.out.print("\t");
            }
            System.out.println("|");
        }

        return newCine;

    }
}
