package Entidades;

import Constantes.Constantes;

public final class Lavadora extends Electrodomestico {

    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, Integer precio, String color, String consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public void crearLavadora() {

        crearElectrodomestico();  

        System.out.println(Constantes.INGRESE_CARGA);

        this.carga = leer.nextInt(); 
        
        precioFinal();

    }

    public void precioFinal() {

        super.precioFinal();

        if (this.carga > 30) {
            this.precio += 500;
        }

    }

    public void mostrarLavadora() {
        
        System.out.println("Caracteristicas de su lavadora: "
                + "\nColor: " + this.color
                + "\nConsumo: " + this.consumoEnergetico
                + "\nPeso: " + this.peso
                + "\nCarga: " + this.carga
                + "\nPrecio: " + this.precio);

    }

    @Override
    public String toString() {
        return "Lavadora" + " Carga:" + carga + super.toString();
    }
}
