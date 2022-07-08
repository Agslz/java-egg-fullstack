package Entidades;

import Constantes.Constantes;
import Interfaces.Interface;

public class BarcoMotor extends Barco implements Interface {

    protected Integer potenciaCV;

    public BarcoMotor() {
    }

    public BarcoMotor(Integer potenciaCV, Integer matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public Integer getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public void crearBarcoMotor() {

        crearBarco();

        System.out.println(Constantes.INGRESE_CV);

        this.potenciaCV = leer.nextInt();

    }

    @Override
    public void calcularPrecio(int difDias) {
        
        int precioFinal = difDias * (eslora * 10) + this.potenciaCV;
        
        System.out.println("Precio final: "+ precioFinal);
        
    }

    @Override
    public String toString() {
        return "Barco a motor";
    }

    
    
}
