package Entidades;

public class Espectador {

    private String nombreEspectador;
    private String apellidoEspectador;
    private Integer edadEspectador;
    private Integer dineroDisponible;

    public Espectador() {
    }

    public Espectador(String nombreEspectador, String apellidoEspectador, Integer edadEspectador, Integer dineroDisponible) {
        this.nombreEspectador = nombreEspectador;
        this.apellidoEspectador = apellidoEspectador;
        this.edadEspectador = edadEspectador;
        this.dineroDisponible = dineroDisponible;
    }

    public String getNombreEspectador() {
        return nombreEspectador;
    }

    public void setNombreEspectador(String nombreEspectador) {
        this.nombreEspectador = nombreEspectador;
    }

    public String getApellidoEspectador() {
        return apellidoEspectador;
    }

    public void setApellidoEspectador(String apellidoEspectador) {
        this.apellidoEspectador = apellidoEspectador;
    }

    public Integer getEdadEspectador() {
        return edadEspectador;
    }

    public void setEdadEspectador(Integer edadEspectador) {
        this.edadEspectador = edadEspectador;
    }

    public Integer getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(Integer dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }
}
