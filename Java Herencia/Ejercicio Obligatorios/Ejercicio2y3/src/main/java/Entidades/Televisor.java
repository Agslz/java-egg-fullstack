package Entidades;

import Constantes.Constantes;

public final class Televisor extends Electrodomestico {

    private Integer resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Integer resolucion, boolean sintonizadorTDT, Integer precio, String color, String consumoEnergetico, Integer peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = false;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor() {

        crearElectrodomestico();

        System.out.println(Constantes.INGRESE_RESOLUCION);

        this.resolucion = leer.nextInt();

        System.out.println(Constantes.TIENE_TDT);

        String opc = leer.next();

        if (opc.equalsIgnoreCase("SI")) {

            this.sintonizadorTDT = true;

        } 
        
        precioFinal();

    }

    public void precioFinal() {

        super.precioFinal();

        double precioDouble = Double.valueOf(this.precio);
        
        if (this.resolucion > 40) {

            precioDouble = precioDouble + (precioDouble * 0.3);

        }

        this.precio = (int) precioDouble;

        if (sintonizadorTDT) {
            this.precio += 500;
        }

    }

    public void mostrarTelevisor() {

        System.out.println("Caracteristicas de su Televisor: "
                + "\nColor: " + this.color
                + "\nConsumo: " + this.consumoEnergetico
                + "\nPeso: " + this.peso
                + "\nPulgadas: " + this.resolucion
                + "\nPrecio: " + this.precio
                + "\nSintetizador: " + this.sintonizadorTDT);

    }

    @Override
    public String toString() {
        return "Televisor" + " Resolucion:" + resolucion + " Sintonizador TDT:" + sintonizadorTDT + super.toString();
    }

}
