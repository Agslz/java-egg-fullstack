package Entidades;

import Constantes.Constantes;

public class HotelCincoEstrellas extends HotelCuatroEstrellas {

    protected Integer cantidadDeSalones;
    protected Integer cantidadDeSuites;
    protected Integer cantidadDeLimosinas;

    public HotelCincoEstrellas() {
    }

    public HotelCincoEstrellas(Integer cantidadDeSalones, Integer cantidadDeSuites, Integer cantidadDeLimosinas, String gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantidadHabitaciones, Integer cantidadDeCamas, Integer cantidadDePisos, Double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombreRestaurante, capacidadRestaurante, cantidadHabitaciones, cantidadDeCamas, cantidadDePisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.cantidadDeSalones = cantidadDeSalones;
        this.cantidadDeSuites = cantidadDeSuites;
        this.cantidadDeLimosinas = cantidadDeLimosinas;
    }

    public Integer getCantidadDeSalones() {
        return cantidadDeSalones;
    }

    public void setCantidadDeSalones(Integer cantidadDeSalones) {
        this.cantidadDeSalones = cantidadDeSalones;
    }

    public Integer getCantidadDeSuites() {
        return cantidadDeSuites;
    }

    public void setCantidadDeSuites(Integer cantidadDeSuites) {
        this.cantidadDeSuites = cantidadDeSuites;
    }

    public Integer getCantidadDeLimosinas() {
        return cantidadDeLimosinas;
    }

    public void setCantidadDeLimosinas(Integer cantidadDeLimosinas) {
        this.cantidadDeLimosinas = cantidadDeLimosinas;
    }

    public void crearHotelCincoEstrellas() {

        crearHotelCuatroEstrellas();

        System.out.println(Constantes.INGRESE_CANTIDAD_SALONES);

        this.cantidadDeSalones = leer.nextInt();

        System.out.println(Constantes.INGRESE_CANTIDAD_LIMOSINAS);

        this.cantidadDeLimosinas = leer.nextInt();

        System.out.println(Constantes.INGRESE_CANTIDAD_SUITES);

        this.cantidadDeSuites = leer.nextInt();

    }

    @Override
    public void calcularPrecio() {

        super.calcularPrecio();

        this.precioHabitaciones += (15 * this.cantidadDeLimosinas);

    }

    @Override
    public String toString() {
        return super.toString() + "\nHotel cinco estrellas"
                + "\nCantidad de salones: " + cantidadDeSalones
                + "\nCantidad de suits: " + cantidadDeSuites
                + "\nCantidad de limosinas: " + cantidadDeLimosinas;
    }

}
