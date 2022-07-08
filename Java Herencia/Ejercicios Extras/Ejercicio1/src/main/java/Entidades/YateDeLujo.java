package Entidades;

import Constantes.Constantes;
import Interfaces.Interface;

public final class YateDeLujo extends BarcoMotor implements Interface {

    private Integer numeroCamarotes;

    public YateDeLujo() {
    }

    public YateDeLujo(Integer numeroCamarotes, Integer potenciaCV, Integer matricula, Integer eslora, Integer anioFabricacion) {
        super(potenciaCV, matricula, eslora, anioFabricacion);
        this.numeroCamarotes = numeroCamarotes;
    }

    public Integer getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(Integer numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

    public void crearYate() {

        crearBarcoMotor();

        System.out.println(Constantes.INGRESE_CANTIDAD_CAMAROTES);

        this.numeroCamarotes = leer.nextInt();

    }

    @Override
    public void calcularPrecio(int difDias) {

        int precioFinal = difDias * (eslora * 10) + this.numeroCamarotes + this.potenciaCV;

        System.out.println("Precio final: " + precioFinal);
    }

    @Override
    public String toString() {
        return "Yate de lujo";
    }

}
