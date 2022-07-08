package Entidades;

import Interfaces.calculosFormas;

public final class Circulo implements calculosFormas {

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {

        return PI * radio * 2;
    }

    @Override
    public double calcularArea() {

        return PI * Math.pow(radio, 2);
    }

}
