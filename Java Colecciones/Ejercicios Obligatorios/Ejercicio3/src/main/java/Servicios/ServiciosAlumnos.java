package Servicios;

import Entidades.Alumnos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServiciosAlumnos {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Alumnos> listaDeAlumnos = new ArrayList<>();

    public Alumnos crearAlumnos() {

        Alumnos a1 = new Alumnos();

        System.out.println("Ingrese su nombre");

        a1.setNombre(leer.next());

        System.out.println("Ingrese su apellido");

        a1.setApellido(leer.next());

        ArrayList<Integer> notas = new ArrayList();

        for (int i = 0; i < 3; i++) {

            System.out.println("Ingrese la nota " + (i + 1));

            notas.add(leer.nextInt());

        }

        a1.setNotas(notas);

        return a1;
    }

    public double notaFinal(ArrayList<Integer> notas) {

        double notaFinal = 0;

        for (Integer aux : notas) { // 8 + 8 + 10

            notaFinal += aux;

        }
        return notaFinal / 3;
    }

    public void alumnos() {

        String opc = "";

        while (!opc.equalsIgnoreCase("NO")) {

            listaDeAlumnos.add(crearAlumnos()); //Llamamos al metodo crearAlumnos dentro de un ArrayList de tipo Alumnos

            System.out.println("Desea Ingresar otro alumno? (SI/NO)");

            opc = leer.next().substring(0, 2);
        }
    }

    public void calcularNota() {

        System.out.println("Ingrese el nombre del alumno al que quiere calcular su nota final: ");

        String nombreBuscar = leer.next();

        boolean flag = false;

        Iterator<Alumnos> it = listaDeAlumnos.iterator();

        while (it.hasNext()) {

            Alumnos next = it.next();

            if (next.getNombre().equals(nombreBuscar)) {

                System.out.println("El alumno ingresado tiene una nota final de: " + notaFinal(next.getNotas()));

                flag = true;

            }
        }

        if (!flag) {

            System.out.println("El alumno ingresado no existe");
        }
    }

    public void menu() {

        System.out.println("""
                           1.Agregar alumnos
                           2.Calcular nota final
                           3.Mostrar alumnos
                           4.Salir
                           """);

    }

    public void mostrarAlumnos() {

        for (Alumnos listaDeAlumno : listaDeAlumnos) {

            System.out.println("Nombre: " + listaDeAlumno.getNombre());

            System.out.println("Apellido: " + listaDeAlumno.getApellido());

            System.out.println("Notas: " + listaDeAlumno.getNotas());

        }
    }
}
