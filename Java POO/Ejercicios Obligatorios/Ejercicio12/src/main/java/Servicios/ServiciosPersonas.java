package Servicios;

import Entidades.Personas;
import java.util.Date;
import java.util.Scanner;

public class ServiciosPersonas {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Date fechaActual = new Date();

    public Personas crearPersona() {

        Personas p1 = new Personas();

        System.out.println("Ingrese su nombre");

        p1.setNombre(leer.next());

        System.out.println("Ingrese su apellido");

        p1.setApellido(leer.next());

        System.out.println("Ingrese su fecha de nacimiento");

        System.out.println("Ingrese el dia");

        int dia = leer.nextInt();

        System.out.println("Ingrese el mes");

        int mes = leer.nextInt();

        System.out.println("Ingrese el año");

        int year = leer.nextInt();

        Date dob = new Date(year - 1900, mes - 1, dia);

        p1.setFechaNacimiento(dob);

        return p1;

    }

    public void calcularEdad(Personas p1) {

        System.out.printf("La persona tiene %d años. \n", fechaActual.getYear() - p1.getFechaNacimiento().getYear());
    }

    public boolean menorQue(Personas p1, int edad) {

        int edadActual = fechaActual.getYear() - p1.getFechaNacimiento().getYear();

        return edadActual < edad;
    }

    public void mostrarPersona(Personas p1) {
        
        System.out.println("Nombre: " + p1.getNombre());
        
        System.out.println("Apellido: "+p1.getApellido());
        
        System.out.println("Fecha de Nacimiento: " + p1.getFechaNacimiento());
        
        System.out.println("Edad: " + (fechaActual.getYear() - p1.getFechaNacimiento().getYear()));
    }

}
