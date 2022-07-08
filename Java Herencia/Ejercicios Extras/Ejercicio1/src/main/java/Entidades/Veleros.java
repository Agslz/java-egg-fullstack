package Entidades;

import Constantes.Constantes;
import Interfaces.Interface;

public final class Veleros extends Barco implements Interface {

    private Integer numeroMastiles;

    public Veleros(Integer numeroMastiles, Integer matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public Veleros() {
    }

    public Integer getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(Integer numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    public void crearVeleros() {

        crearBarco();

        System.out.println(Constantes.INGRESE_NUMERO_MASTILES);

        this.numeroMastiles = leer.nextInt();

    }

    @Override
    public void calcularPrecio(int difDias) {
        
        int precioFinal = difDias * (eslora * 10) + this.numeroMastiles;

        System.out.println("Precio final: " + precioFinal);
    }

    @Override
    public String toString() {
        return "Velero" ;
    }

    
    
}
