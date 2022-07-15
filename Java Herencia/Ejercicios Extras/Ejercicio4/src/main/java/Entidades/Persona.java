package Entidades;

import java.util.Scanner;
import Constantes.Constantes;

public class Persona {

    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected String nombre;
    protected String apellido;
    protected Integer DNI;
    protected String estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer numeroIdentificacion, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = numeroIdentificacion;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void crearPersona() {

        System.out.println(Constantes.INGRESE_NOMBRE);

        this.nombre = leer.next();

        System.out.println(Constantes.INGRESE_APELIIDO);

        this.apellido = leer.next();

        System.out.println(Constantes.INGRESE_DNI);

        this.DNI = leer.nextInt();

        System.out.println(Constantes.INGRESE_ESTADO_CIVIL);

        this.estadoCivil = leer.next();

    }

    @Override
    public String toString() {
        return "Persona"
                + "\nNombre: " + nombre
                + "\nApellido: " + apellido
                + "\nNumero de identificación: " + DNI
                + "\nEstado civil: " + estadoCivil;
    }

}
