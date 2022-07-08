package com.mycompany.ejercicio12extra;

import java.util.Scanner;

public class Ejercicio12Extra {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int[] count = new int[3];
        for (int x = 0; x <= num; x++) {
            int counter = x;
            count[2] = counter % 10;
            count[1] = counter / 10 % 10;
            count[0] = counter / 100 % 10;
            for (int y = 0; y < 3; y++) {
                if (count[y] != 3) {
                    System.out.print(count[y] + "-");
                } else {
                    System.out.println("E");
                }
            }
            System.out.println("");
        }
        for (int x = 0; x < 3; x++) {
            System.out.print(count[x] + "-");
        }
    }
}
