package Servicios;

import Entidades.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosArray {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Array crearArray() {

        Array p1 = new Array();

        ArrayList<Integer> num = new ArrayList<>();

        int numero = 0;

        while (numero != -99) {

            System.out.println("Ingrese un numero");

            numero = leer.nextInt();

            num.add(numero);
            
            p1.setNumeros(num);
        }

        num.remove(num.size() - 1); //Removemos el ultimo numero ingresado 

        return p1;

    }

    public void mostrar(ArrayList<Integer> num) {

        System.out.println("Los numeros ingresados son:");

        for (Integer integer : num) {

            System.out.println(integer);

        }
    }

    public void tamaño(ArrayList<Integer> num) {

        System.out.println("La cantidad de numeros ingresados son:" + num.size());

    }

    public void suma(ArrayList<Integer> num) {

        Integer suma = 0;

        for (Integer nume : num) {

            if (nume == -99) {

                break;

            } else {

                suma += nume;
            }
        }

        System.out.println("La suma de los numeros ingresados es: " + suma);

        System.out.println("El promedio de los numeros ingresados es: " + (suma) / num.size());

    }
}
