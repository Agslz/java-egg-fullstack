package Entidades;

import Constantes.Constantes;

public class AlojamientoExtraHotelero extends Alojamiento {

    protected boolean isPrivado;
    protected Integer cantidadMetrosCuadrados;

    public AlojamientoExtraHotelero() {
    }

    public AlojamientoExtraHotelero(boolean isPrivado, Integer cantidadMetrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.isPrivado = isPrivado;
        this.cantidadMetrosCuadrados = cantidadMetrosCuadrados;
    }

    public boolean isIsPrivado() {
        return isPrivado;
    }

    public void setIsPrivado(boolean isPrivado) {
        this.isPrivado = isPrivado;
    }

    public Integer getCantidadMetrosCuadrados() {
        return cantidadMetrosCuadrados;
    }

    public void setCantidadMetrosCuadrados(Integer cantidadMetrosCuadrados) {
        this.cantidadMetrosCuadrados = cantidadMetrosCuadrados;
    }

    public void crearAlojamientoExtraHotelero() {

        crearAlojamiento();

        validarAlojamientoPrivado(this.isPrivado);

        System.out.println(Constantes.INGRESE_CANTIDAD_METROS);

        this.cantidadMetrosCuadrados = leer.nextInt();

    }

    public void validarAlojamientoPrivado(boolean isPrivado) {

        String aux;

        do {

            System.out.println(Constantes.ALOJAMIENTO_PRIVADO);

            aux = leer.next();

            if (aux.equalsIgnoreCase("SI")) {

                this.isPrivado = true;

            } else {

                this.isPrivado = false;

            }

        } while (!aux.equalsIgnoreCase("SI") && !aux.equalsIgnoreCase("NO"));

    }

    @Override
    public String toString() {
        return super.toString() + "\nAlojamiento extra hotelero"
                + "\nEs privado: " + isPrivado
                + "\nCantidad de metros cuadrados: " + cantidadMetrosCuadrados;
    }

}
