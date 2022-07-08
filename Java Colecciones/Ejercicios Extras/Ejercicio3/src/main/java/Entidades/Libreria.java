package Entidades;

public class Libreria {

    private String titulo;
    private String autor;
    private Integer numeroEjemplares;
    private Integer numeroEjemplaresPrestados;

    public Libreria() {
    }

    public Libreria(String titulo, String autor, Integer numeroEjemplares, Integer numeroEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplares;
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

    public Integer getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(Integer numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public Integer getNumeroEjemplaresPrestados() {
        return numeroEjemplaresPrestados;
    }

    public void setNumeroEjemplaresPrestados(Integer numeroEjemplaresPrestados) {
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    @Override
    public String toString() {
        return " Titulo: " + titulo + "\n Autor: " + autor + "\n Numero de ejemplares: " + numeroEjemplares;
    }
}
