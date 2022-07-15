package Entidades;

import Constantes.Constantes;

public class Hotel extends Alojamiento {

    protected Integer cantidadHabitaciones;
    protected Integer cantidadDeCamas;
    protected Integer cantidadDePisos;
    protected Double precioHabitaciones;

    public Hotel() {
    }

    public Hotel(Integer cantidadHabitaciones, Integer cantidadDeCamas, Integer cantidadDePisos, Double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.cantidadDeCamas = cantidadDeCamas;
        this.cantidadDePisos = cantidadDePisos;
        this.precioHabitaciones = precioHabitaciones;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public Integer getCantidadDeCamas() {
        return cantidadDeCamas;
    }

    public void setCantidadDeCamas(Integer cantidadDeCamas) {
        this.cantidadDeCamas = cantidadDeCamas;
    }

    public Integer getCantidadDePisos() {
        return cantidadDePisos;
    }

    public void setCantidadDePisos(Integer cantidadDePisos) {
        this.cantidadDePisos = cantidadDePisos;
    }

    public Double getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(Double precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    public void crearHotel() {

        crearAlojamiento();

        System.out.println(Constantes.INGRESE_CANTIDAD_HABITACIONES);

        this.cantidadHabitaciones = leer.nextInt();

        System.out.println(Constantes.INGRESE_CANTIDAD_CAMAS);

        this.cantidadDeCamas = leer.nextInt();

        System.out.println(Constantes.INGRESE_CANTIDAD_PISOS);

        this.cantidadDePisos = leer.nextInt();

    }

    @Override
    public String toString() {
        return super.toString() + "\nHotel"
                + "\nCantidad de habitaciones: " + cantidadHabitaciones
                + "\nCantidad de camas: " + cantidadDeCamas
                + "\nCantidad de pisos: " + cantidadDePisos
                + "\nPrecio de habitaciones: " + precioHabitaciones;
    }

}
