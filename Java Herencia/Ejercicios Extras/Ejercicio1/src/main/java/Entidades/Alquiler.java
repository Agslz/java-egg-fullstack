package Entidades;

import java.time.LocalDate;
import java.util.Scanner;
import Constantes.Constantes;
import java.time.Duration;

public final class Alquiler {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private String apellido;
    private Integer documento;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private Integer posicionAmarre = 0;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, String apellido, Integer documento, LocalDate fechaAlquiler, LocalDate fechaDevolucion, Integer posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = 0;
        this.barco = barco;
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

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public void crearAlquiler() {

        System.out.println(Constantes.INGRESE_NOMBRE);

        this.nombre = leer.next();

        System.out.println(Constantes.INGRESE_APELLIDO);

        this.apellido = leer.next();

        System.out.println(Constantes.INGRESE_DOCUMENTO);

        this.documento = leer.nextInt();

        crearFecha();

        calcularDias(fechaAlquiler, fechaDevolucion);

    }

    public void crearFecha() {

        String fechaAlquilerAux;
        String fechaDevolucionAux;

        do {
            System.out.println(Constantes.INGRESE_FECHA_ALQUILER);

            fechaAlquilerAux = leer.next();

        } while (!fechaAlquilerAux.contains("-"));

        this.fechaAlquiler = LocalDate.parse(fechaAlquilerAux);

        do {

            System.out.println(Constantes.INGRESE_FECHA_DEVOLUCION);

            fechaDevolucionAux = leer.next();

        } while (!fechaDevolucionAux.contains("-"));

        this.fechaDevolucion = LocalDate.parse(fechaDevolucionAux);

    }

    public int calcularDias(LocalDate fechaAlquiler, LocalDate fechaDevolucion) {

        int Difdias;

        Duration dd = Duration.between(fechaAlquiler.atStartOfDay(), fechaDevolucion.atStartOfDay());

        Difdias = (int) dd.toDays();

        return Difdias;

    }

    @Override
    public String toString() {
        return "--Alquiler--"
                + "\nNombre: " + nombre
                + "\nApellido: " + apellido
                + "\nDocumento: " + documento
                + "\nFecha de Alquiler: " + fechaAlquiler
                + "\nFecha de devolución: " + fechaDevolucion
                + "\nTipo de barco: " + barco;
    }

}
