package Entidades;

import Constantes.Constantes;

public final class PersonalDeServicio extends Empleado {

    private String servicioAsignado;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(String servicioAsignado, Integer anioIncorporacion, Integer numeroDespachoAsignado, String nombre, String apellido, Integer numeroIdentificacion, String estadoCivil) {
        super(anioIncorporacion, numeroDespachoAsignado, nombre, apellido, numeroIdentificacion, estadoCivil);
        this.servicioAsignado = servicioAsignado;
    }

    public String getServicioAsignado() {
        return servicioAsignado;
    }

    public void setServicioAsignado(String servicioAsignado) {
        this.servicioAsignado = servicioAsignado;
    }

    public void crearPersonalDeServicio() {

        System.out.println("Creando personal de servicio");

        crearEmpleado();

        String auxServicioAsignado;

        do {

            System.out.println(Constantes.INGRESE_SECCION_ASIGNADO);

            auxServicioAsignado = leer.next();

        } while (!auxServicioAsignado.equalsIgnoreCase("Biblioteca") && !auxServicioAsignado.equalsIgnoreCase("Decanato") && !auxServicioAsignado.equalsIgnoreCase("Secretaría"));

        this.servicioAsignado = auxServicioAsignado;

    }

    @Override
    public String toString() {
        return super.toString() + "\nPersonal de servicio:"
                + "\nServicio asignado: " + servicioAsignado;
    }

}
