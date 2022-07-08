package com.mycompany.ejercicio17extra;

import java.util.Scanner;

public class Ejercicio17Extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número e indicaré si es primo o no:");
        int n = leer.nextInt();
        System.out.println(es_primo(n));
    }
public static boolean es_primo(int n){
    boolean primo;
    primo = false;
    if(n%1 == 0){
        if(n%2 != 0){
            if(n%3 != 0){
                if(n%5 != 0){ 
                    if(n%7 != 0){
                        if(n%n == 0){
                            primo = true;
                        }
                    }
                    else if(n%7 == 0){
                        if(n == 7){
                            primo = true;
                        }
                        else{
                            primo = false;
                        }
                    }
                }
                else if(n%5 == 0){
                    if(n == 5){
                        primo = true;
                    }
                    else{
                        primo = false;
                    }
                }
            }
            else if(n % 3 == 0){
                if(n == 3){
                    primo = true;
                }
                else{
                    primo = false;
                }
            }
        }
        else if(n%2==0){
            if(n==2){
                primo = true;
            }
            else{
                primo = false;
            }
        }
    }
    return primo;
}
}