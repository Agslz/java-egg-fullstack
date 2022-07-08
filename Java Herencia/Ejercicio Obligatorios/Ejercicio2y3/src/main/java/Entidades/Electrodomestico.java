package Entidades;

import java.util.Scanner;
import Constantes.Constantes;

public class Electrodomestico {

    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected Integer precio;
    protected String color;
    protected String consumoEnergetico; //Letras entre A y F
    protected Integer peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Integer precio, String color, String consumoEnergetico, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(String letra) {

        if (!this.consumoEnergetico.equals("A") && !this.consumoEnergetico.equals("B") && !this.consumoEnergetico.equals("C") && !this.consumoEnergetico.equals("D") && !this.consumoEnergetico.equals("E") && !this.consumoEnergetico.equals("F")) {
            System.out.println(Constantes.LETRA_INCORRECTA);
            this.consumoEnergetico = "F";
        }else{
            this.consumoEnergetico = letra;
        }
    }

    public void comprobarColor(String colour) {

        if (!this.color.equalsIgnoreCase("Blanco") && !this.color.equalsIgnoreCase("Negro") && !this.color.equalsIgnoreCase("Rojo") && !this.color.equalsIgnoreCase("Azul") && !this.color.equalsIgnoreCase("Gris")) {
            System.out.println(Constantes.COLOR_INCORRECTO);
            this.color = "Blanco";
        }else{
            this.color = colour;
        }

    }

    public void crearElectrodomestico() {

        System.out.println(Constantes.ELEGIR_CONSUMO);

        this.consumoEnergetico = leer.next().toUpperCase();

        comprobarConsumoEnergetico(this.consumoEnergetico);

        System.out.println(Constantes.ELEGIR_COLOR);

        this.color = leer.next();

        comprobarColor(this.color);

        System.out.println(Constantes.ELEGIR_PESO);

        this.peso = leer.nextInt();

        this.precio = 1000;
    }

    public void precioFinal() {

        switch (this.consumoEnergetico) {
            case "A" ->
                this.precio += 1000;
            case "B" ->
                this.precio += 800;
            case "C" ->
                this.precio += 600;
            case "D" ->
                this.precio += 500;
            case "E" ->
                this.precio += 300;
            case "F" ->
                this.precio += 100;
        }

        if (this.peso >= 1 && this.peso <= 19) {
          
            this.precio += 100;
        
        } else if (this.peso >= 20 && this.peso <= 49) {
        
            this.precio += 500;

        } else if (this.peso >= 50 && this.peso <= 79) {
           
            this.precio += 800;

        } else {

            this.precio += 1000;
        }

    }

    @Override
    public String toString() {
        return "Precio:" + precio + " Color: " + color + " Consumo energetico: " + consumoEnergetico + " Peso: " + peso ;
    }
    
}
