package Entidades;

public class Cine {

    private Pelicula nombrePeliculaReproduciendo;
    private String[][] Sala = new String[8][6];
    private Integer precioEntrada;

    public Cine() {
    }

    public Cine(Pelicula nombrePeliculaReproduciendo, String[][] sala, Integer precioEntrada) {
        this.nombrePeliculaReproduciendo = nombrePeliculaReproduciendo;
        Sala = sala;
        this.precioEntrada = precioEntrada;
    }

    public Pelicula getNombrePeliculaReproduciendo() {
        return nombrePeliculaReproduciendo;
    }

    public void setNombrePeliculaReproduciendo(Pelicula nombrePeliculaReproduciendo) {
        this.nombrePeliculaReproduciendo = nombrePeliculaReproduciendo;
    }

    public String[][] getSala() {
        return Sala;
    }

    public void setSala(String[][] sala) {
        Sala = sala;
    }

    public Integer getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(Integer precioEntrada) {
        this.precioEntrada = precioEntrada;
    }
}
