package Entidades;

public class Libro {

    private int isbn;
    private int numeroPaginas;
    private String titulo;
    private String autor;

    public Libro() {
    }

    public Libro(int isbn, int numeroPaginas, String titulo, String autor) {
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
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

}
