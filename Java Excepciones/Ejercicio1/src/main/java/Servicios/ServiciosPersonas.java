
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

public class ServiciosPersonas {

    final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona creaPersona() {

        Persona p1 = new Persona();

        System.out.println("Ingrese su nombre");

        p1.setNombre(leer.next());

        System.out.println("Ingrese su sexo");

        System.out.println("H(Hombre),M(Mujer),O(Otro)");

        System.out.println("H, M, O");

        String sexo = leer.next().toUpperCase();

        while (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")) {

            System.out.println("Ingrese una opción válida: ");

            sexo = leer.next().toUpperCase();
        }

        p1.setSexo(sexo);

        System.out.println("Ingrese su edad");

        p1.setEdad(leer.nextInt());

        System.out.println("Ingrese su peso");

        p1.setPeso(leer.nextDouble());

        System.out.println("Ingrese su altura");

        p1.setAltura(leer.nextDouble());

        return p1;

    }

    public double calcularIMc(Persona p1) {

        double peso = p1.getPeso();

        double altura = p1.getAltura();

        double imc = peso / (altura * altura);

        if (imc < 20) {

            System.out.println("Usted se encuentra por debajo de su peso ideal");

            return -1;

        } else if (imc >= 20 && imc <= 25) {

            System.out.println("Usted se encuentra en su peso ideal");

            return 0;

        } else {

            System.out.println("Usted se encuentra por arriba de su peso ideal");

            return 1;

        }

    }

    public boolean esMayorDeEdad(Persona p1) {

        int edad = p1.getEdad();

        if (edad > 18) {

            System.out.println("Es mayo de edad");

            return true;

        } else {

            System.out.println("Es menor de edad");

            return false;

        }

    }

}
