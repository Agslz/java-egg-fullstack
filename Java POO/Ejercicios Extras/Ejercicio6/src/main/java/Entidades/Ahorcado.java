package Entidades;

public class Ahorcado {

    private String[] vectorPalabra;
    private int jugadaMaxima;
    private int letrasEncontradas;
    private int longitud;

    public Ahorcado() {
    }

    public Ahorcado(String[] vectorPalabra, int jugadaMaxima, int letrasEncontradas, int longitud) {
        this.vectorPalabra = vectorPalabra;
        this.jugadaMaxima = jugadaMaxima;
        this.letrasEncontradas = letrasEncontradas;
        this.longitud = longitud;
    }

    public void setVectorPalabra(String[] vectorPalabra) {
        this.vectorPalabra = vectorPalabra;
    }

    public void setJugadaMaxima(int jugadaMaxima) {
        this.jugadaMaxima = jugadaMaxima;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String[] getVectorPalabra() {
        return vectorPalabra;
    }

    public int getJugadaMaxima() {
        return jugadaMaxima;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public int getLongitud() {
        return longitud;
    }

}
