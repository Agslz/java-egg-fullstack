package Entidades;

public class Pelicula {

    private String titulo;
    private String autor;
    private Integer duracionPelicula;

    public Pelicula() {
    }

    public Pelicula(String titulo, String autor, int duracionPelicula) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracionPelicula = duracionPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getDuracionPelicula() {
        return duracionPelicula;
    }

    public void setDuracionPelicula(Integer duracionPelicula) {
        this.duracionPelicula = duracionPelicula;
    }

    @Override
    public String toString() {
        return "Titulo = " + titulo + ", Autor = " + autor + ", Duración de la pelicula = " + duracionPelicula;
    }

}
