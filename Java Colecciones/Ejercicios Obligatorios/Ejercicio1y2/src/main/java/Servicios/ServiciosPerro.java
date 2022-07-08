package Servicios;

import Entidades.Perro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ServiciosPerro {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<String> razas = new ArrayList<>();

    public Perro crearPerro() {

        Perro p1 = new Perro();

        System.out.println("Ingrese la raza de su mascota");

        razas.add(leer.next());

        System.out.println("¿Desea ingresar más razas? (S/N)"); 

        String opcion = leer.next();

        while (!opcion.equalsIgnoreCase("N")) {

            System.out.println("Ingrese las razas que desee o ingrese N para salir:");

            p1.setRaza(leer.next());

            razas.add(p1.getRaza());

            System.out.println("¿Desea ingresar más razas? (S/N)");

            opcion = leer.next().substring(0, 1);

        }

        System.out.println("Las razas en la lista son: ");

        for (String var : razas) {

            System.out.println(var);

        }

        /*--------------------------------Comienzo del Ejercicio 2--------------------------------*/
        
        System.out.println("Ingrese una de las razas a eliminar");
        
        p1.setEliminar(leer.next());

        Collections.sort(razas);

        Iterator<String> it = razas.iterator();

        boolean encontrado = false;

        while (it.hasNext()) {

            if (it.next().equals(p1.getEliminar())) {

                it.remove();

                encontrado = true;
            }
        }

        if (!encontrado) {

            System.out.println("Se ha encontrado y eliminado: " + p1.getEliminar());

        } else {

            System.out.println("La raza ingresada no se ha encontrado");
        }

        System.out.println("Las razas que quedan son:" + razas);

        return p1;
    }
}
