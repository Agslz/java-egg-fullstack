package com.mycompany.ejercicio7extra;

import java.util.Scanner;

public class Ejercicio7Extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int cantidadNum, numero, numMenor = 0, numMayor = 0;
        double promedio, suma = 0;
        System.out.println("Ingrese la cantidad de numeros a evaluar");
        cantidadNum = leer.nextInt();
        for (int i = 0; i < cantidadNum; i++) {
            System.out.println("Ingrese el numero en la posicion " + (i + 1));
            numero = leer.nextInt();
            suma = suma + numero;
            if (i == 0) {
                numMenor = numero;
                numMayor = numero;
            } else if (numero < numMenor) {
                numMenor = numero;
            }
            if (numero > numMayor) {
                numMayor = numero;
            }
        }
        promedio = suma / cantidadNum ;
        System.out.println("El promedio de los numeros ingresados es: "+promedio);
        System.out.println("El mayor es: "+numMayor);
        System.out.println("El menor es; "+numMenor);

    }

}
