package Entidades;

import Constantes.Constantes;

public class HotelCuatroEstrellas extends Hotel {

    protected String gimnasio;
    protected String nombreRestaurante;
    protected Integer capacidadRestaurante;

    public HotelCuatroEstrellas() {
    }

    public HotelCuatroEstrellas(String gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantidadHabitaciones, Integer cantidadDeCamas, Integer cantidadDePisos, Double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadHabitaciones, cantidadDeCamas, cantidadDePisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public void crearHotelCuatroEstrellas() {
        
        System.out.println("Creamos un hotel");

        crearHotel();

        String gimaux;

        do {

            System.out.println(Constantes.INGRESE_TIPO_GIMNASIO);

            gimaux = leer.next();

        } while (!gimaux.equalsIgnoreCase("A") && !gimaux.equalsIgnoreCase("B"));

        this.gimnasio = gimaux;

        System.out.println(Constantes.INGRESE_NOMBRE_RESTAURANTE);

        this.nombreRestaurante = leer.next();

        System.out.println(Constantes.INGRESE_CAPACIDAD_RESTAURANTE);

        this.capacidadRestaurante = leer.nextInt();

    }

    public void calcularPrecio() {

        double precioHabitacionFinal;

        precioHabitacionFinal = (50 + this.cantidadDeCamas * this.cantidadHabitaciones);

        if (this.capacidadRestaurante < 30) {

            precioHabitacionFinal += 10;

        } else if (this.capacidadRestaurante >= 30 && this.capacidadRestaurante <= 50) {

            precioHabitacionFinal += 30;

        } else {

            precioHabitacionFinal += 50;

        }

        if (gimnasio.equalsIgnoreCase("A")) {

            precioHabitacionFinal += 50;

        } else {

            precioHabitacionFinal += 30;

        }

        this.precioHabitaciones = precioHabitacionFinal;

    }

    @Override
    public String toString() {
        return super.toString() + "\nHotel cuatro estrellas"
                + "\nTipo de gimnasio: " + gimnasio
                + "\nNombre de restaurante: " + nombreRestaurante
                + "\nCapacidad de restaurante: " + capacidadRestaurante;
    }

}
