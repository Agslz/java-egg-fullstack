package Entidades;

public class NIF {

    private int DNI;
    private String letra;

    public NIF() {
    }

    public NIF(int DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }

    public String getLetra() {
        return letra;
    }

}
