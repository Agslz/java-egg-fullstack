package Servicios;

import Constantes.Constantes;
import Entidades.Pelicula;

public class ServiciosPelicula {

    public Pelicula crearPelicula() {

        Pelicula pe = new Pelicula();

        pe.setTituloPelicula(Constantes.TITULO_PELICULA);

        pe.setDuracionPelicula(230);

        pe.setEdadMinima(18);

        pe.setDirectorPelicula(Constantes.NOMBRE_AUTOR);

        return pe;
    }

}
