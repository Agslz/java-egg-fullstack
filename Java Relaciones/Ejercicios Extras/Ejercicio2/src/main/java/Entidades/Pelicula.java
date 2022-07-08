package Entidades;

public class Pelicula {

    private String tituloPelicula;
    private Integer duracionPelicula;
    private Integer edadMinima;
    private String directorPelicula;

    public Pelicula() {
    }

    public Pelicula(String tituloPelicula, Integer diracionPelicula, Integer edadMinima, String directorPelicula) {
        this.tituloPelicula = tituloPelicula;
        this.duracionPelicula = diracionPelicula;
        this.edadMinima = edadMinima;
        this.directorPelicula = directorPelicula;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public Integer getDuracionPelicula() {
        return duracionPelicula;
    }

    public void setDuracionPelicula(Integer duracionPelicula) {
        this.duracionPelicula = duracionPelicula;
    }

    public Integer getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirectorPelicula() {
        return directorPelicula;
    }

    public void setDirectorPelicula(String directorPelicula) {
        this.directorPelicula = directorPelicula;
    }
}
