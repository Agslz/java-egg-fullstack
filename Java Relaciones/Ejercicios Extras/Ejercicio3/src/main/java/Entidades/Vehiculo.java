package Entidades;

public class Vehiculo {

    private String marca;
    private String modelo;
    private Integer año;
    private Integer numeroMotor;
    private Integer numeroChasis;
    private String color;
    private String tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, Integer año, Integer numeroMotor, Integer numeroChasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.numeroMotor = numeroMotor;
        this.numeroChasis = numeroChasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public Integer getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(Integer numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public Integer getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(Integer numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Marca: "+marca
                + "\nModelo: "+modelo
                + "\nAño: "+año
                + "\nNumero de motor: "+numeroMotor
                + "\nNumero de chasis: "+numeroChasis
                + "\nColor: "+color
                + "\nTipo: "+tipo;
    }    
}
