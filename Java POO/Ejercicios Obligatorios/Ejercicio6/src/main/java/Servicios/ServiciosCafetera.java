package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class ServiciosCafetera {

    private final Scanner leer = new Scanner(System.in);

    public Cafetera crearCafetera() {

        Cafetera cafe1 = new Cafetera();

        System.out.println("Ingresa la cantidad maxima de la cafetera: ");

        cafe1.setCapacidadMaxima(leer.nextInt());

        System.out.println("Ingresa la cantidad actual de la cafetera: ");

        cafe1.setCantidadActual(leer.nextInt());

        return cafe1;
    }

    public void llenarCafetera(Cafetera cafe1) {

        cafe1.setCantidadActual(cafe1.getCapacidadMaxima());

        System.out.println("Se llenó por completo la cafetera.");

    }

    public void servirTaza(Cafetera cafe1) {

        System.out.println("Ingrese una cantidad a servir");

        int cantidadServir = leer.nextInt();

        if (cantidadServir > cafe1.getCantidadActual()) {

            System.out.println("No se ha podido llenar la taza");

            System.out.println("Se ha llenado " + cafe1.getCantidadActual() + " unidades, faltaron " + (cantidadServir - cafe1.getCantidadActual()) + " unidades para llenar la taza.");

            cafe1.setCantidadActual(0);

        } else {

            System.out.println("La taza se ha llenado");

            cafe1.setCantidadActual(cafe1.getCantidadActual() - cantidadServir);

            System.out.println("Le queda a la cafetera: " + (cafe1.getCantidadActual() - cantidadServir));
        }

    }

    public void vaciarCafetera(Cafetera cafe1) {

        cafe1.setCantidadActual(0);

        System.out.println("Se vació por completo la cafetera");

    }

    public void agregarCafe(Cafetera cafe1) {

        System.out.println("Ingrese la cantidad a agregar");

        int cantAgregar = leer.nextInt();

        if (cafe1.getCantidadActual() + cantAgregar > cafe1.getCapacidadMaxima()) {

            System.out.println("Se ha excedido la capacidad máxima, se llenará la cafetera y se descartará el excedente");

            llenarCafetera(cafe1);
            
        } else {

            System.out.println("Se ha recargado la cafetera, contiene " + (cafe1.getCantidadActual() + cantAgregar) + " unidades de " + cafe1.getCapacidadMaxima());

            cafe1.setCantidadActual(cafe1.getCantidadActual() + cantAgregar);
        }

    }

}
