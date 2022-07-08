package com.mycompany.ejercicio6extra;

import java.util.Scanner;

public class EJercicio6Extra {

     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas:");
        int cantidad = leer.nextInt();
        int contmenor = 0;
        double suma = 0;
        double sumamenor = 0;
        double sumamayor = 0;
        
        System.out.println("Ingrese " + cantidad + " alturas:");
        for (int i = 0; i < cantidad; i++) {
            double altura = leer.nextDouble();
            if(altura < 1.60){
                sumamenor = sumamenor + altura;
                suma = suma + altura;
                contmenor = contmenor + 1;
            }
            else{
                suma = suma + altura;
                sumamayor += 1;
            }
        }   
        System.out.println("El promedio de las alturas es: " + (suma/sumamayor) + "m");
        System.out.println("El promedio de las alturas menores a 1.60m es: " + (sumamenor/contmenor) + "m");
    }      
}
