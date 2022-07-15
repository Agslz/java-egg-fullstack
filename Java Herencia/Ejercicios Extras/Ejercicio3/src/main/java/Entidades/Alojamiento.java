package Entidades;

import java.util.Scanner;
import Constantes.Constantes;

public class Alojamiento {

    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerente;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public void crearAlojamiento() {

        System.out.println(Constantes.INGRESE_NOMBRE_HOTEL);

        this.nombre = leer.next();

        System.out.println(Constantes.INGRESE_DIRECCION_HOTEL);

        this.direccion = leer.next();

        System.out.println();

        this.localidad = leer.next(Constantes.INGRESE_LOCALIDAD_HOTEL);

        System.out.println();

        this.gerente = leer.next(Constantes.INGRESE_NOMBRE_GERENTE);

    }

    @Override
    public String toString() {
        return "Alojamiento"
                + "\nNombre: " + nombre
                + "\nDireccion: " + direccion
                + "\nLocalidad: " + localidad
                + "\nGerente:" + gerente;
    }

}
