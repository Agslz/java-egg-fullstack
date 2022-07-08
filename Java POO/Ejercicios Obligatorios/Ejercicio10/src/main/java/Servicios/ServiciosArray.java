package Servicios;

import Entidades.Array;
import java.util.Arrays;

public class ServiciosArray {

    public void cargarArray() {

        Array arr1 = new Array();

        double A1[] = new double[50];

        for (int i = 0; i < A1.length; i++) {

            A1[i] = Math.random() * 50;

        }

        arr1.setA(A1);

        System.out.println("El arreglo A es:");

        printArray(arr1.getA());

        System.out.println("El Arreglo A ordenado es: ");

        Arrays.sort(arr1.getA());

        printArray(arr1.getA());

        arr1.setB(Arrays.copyOf(arr1.getA(), 20));

        Arrays.fill(arr1.getB(), 10, 20, 0.5);

        System.out.println("El arreglo B es:");

        printArray(arr1.getB());

    }

    public void printArray(double array[]) {

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);

        }
    }

}
