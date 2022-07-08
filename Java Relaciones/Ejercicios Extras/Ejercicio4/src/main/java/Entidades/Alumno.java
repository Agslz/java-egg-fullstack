package Entidades;

public class Alumno {

    private String nombre;
    private String apeliido;
    private Integer DNI;
    private Integer cantidadDeVotos;

    public Alumno() {
    }

    public Alumno(String nombre, String apeliido, Integer DNI, Integer cantidadDeVotos) {
        this.nombre = nombre;
        this.apeliido = apeliido;
        this.DNI = DNI;
        this.cantidadDeVotos = cantidadDeVotos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApeliido() {
        return apeliido;
    }

    public void setApeliido(String apeliido) {
        this.apeliido = apeliido;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Integer getCantidadDeVotos() {
        return cantidadDeVotos;
    }

    public void setCantidadDeVotos(Integer cantidadDeVotos) {
        this.cantidadDeVotos = cantidadDeVotos;
    }
}
