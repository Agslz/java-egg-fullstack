package Entidades;

import Constantes.Constantes;

public final class Residencia extends AlojamientoExtraHotelero {

    private Integer cantidaDeHabitaciones;
    private boolean descuentosGremios;
    private boolean poseeCampoDeportivo;

    public Residencia() {
    }

    public Residencia(Integer cantidaDeHabitaciones, boolean descuentosGremios, boolean poseeCampoDeportivo, boolean isPrivado, Integer cantidadMetrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(isPrivado, cantidadMetrosCuadrados, nombre, direccion, localidad, gerente);
        this.cantidaDeHabitaciones = cantidaDeHabitaciones;
        this.descuentosGremios = descuentosGremios;
        this.poseeCampoDeportivo = poseeCampoDeportivo;
    }

    public Integer getCantidaDeHabitaciones() {
        return cantidaDeHabitaciones;
    }

    public void setCantidaDeHabitaciones(Integer cantidaDeHabitaciones) {
        this.cantidaDeHabitaciones = cantidaDeHabitaciones;
    }

    public boolean isDescuentosGremios() {
        return descuentosGremios;
    }

    public void setDescuentosGremios(boolean descuentosGremios) {
        this.descuentosGremios = descuentosGremios;
    }

    public boolean isPoseeCampoDeportivo() {
        return poseeCampoDeportivo;
    }

    public void setPoseeCampoDeportivo(boolean poseeCampoDeportivo) {
        this.poseeCampoDeportivo = poseeCampoDeportivo;
    }

    public void crearResidencia() {

        System.out.println("Creamos una residencia");

        crearAlojamientoExtraHotelero();

        System.out.println(Constantes.INGRESE_CANTIDAD_HABITACIONES);

        cantidaDeHabitaciones = leer.nextInt();

        validarDescuentosGremios(this.descuentosGremios);

        validarSiPoseeCamposDeportivos(this.poseeCampoDeportivo);

    }

    public void validarDescuentosGremios(boolean descuentosGremios) {

        String descuentosGremiosAux;

        do {

            System.out.println(Constantes.INGRESE_SI_POSEE_DESCUENTO_GREMIOS);

            descuentosGremiosAux = leer.next();

            if (descuentosGremiosAux.equalsIgnoreCase("SI")) {

                this.descuentosGremios = true;

            } else {

                this.descuentosGremios = false;

            }

        } while (!descuentosGremiosAux.equalsIgnoreCase("SI") && !descuentosGremiosAux.equalsIgnoreCase("NO"));

    }

    public void validarSiPoseeCamposDeportivos(boolean poseeCampoDeportivo) {

        String camposDeportivosAux;

        do {

            System.out.println(Constantes.INGRESE_SI_POSEE_CAMPOS);

            camposDeportivosAux = leer.next();

            if (camposDeportivosAux.equalsIgnoreCase("SI")) {

                this.poseeCampoDeportivo = true;

            } else {

                this.poseeCampoDeportivo = false;

            }

        } while (!camposDeportivosAux.equalsIgnoreCase("SI") && !camposDeportivosAux.equalsIgnoreCase("NO"));

    }

    @Override
    public String toString() {
        return super.toString() + "\nResidencia"
                + "\nCantidad de habitaciones: " + cantidaDeHabitaciones
                + "\nPosee descuento para gremios?: " + descuentosGremios
                + "\nPosee campo deportivo?: " + poseeCampoDeportivo;
    }

}
