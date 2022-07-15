package Entidades;

import java.util.Scanner;
import Constantes.Constantes;

public abstract class Edificio {

    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected Double alto;
    protected Double ancho;
    protected Double largo;

    public Edificio() {
    }

    public Edificio(Double alto, Double ancho, Double largo) {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public abstract void calcularSuperficie();

    public abstract void calcularVolumen();

    public void crearEdificio() {
        
        System.out.println(Constantes.INGRESE_ALTO);
        
        this.alto = leer.nextDouble();
        
        System.out.println(Constantes.INGRESE_ANCHO);
        
        this.ancho = leer.nextDouble();
        
        System.out.println(Constantes.INGRESE_LARGO);
        
        this.largo = leer.nextDouble();

    }

    @Override
    public String toString() {
        return "Edificio";
    }
    
    

}
