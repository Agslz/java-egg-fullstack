package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;

public class ServiciosCircunferencia {

    private final Scanner leer = new Scanner(System.in);

    public Circunferencia crearCircunferencia() { 

        Circunferencia circ = new Circunferencia();

        System.out.println("Ingresa el Radio de la Circunferencia:");
        
        circ.setRadio(leer.nextDouble());

        return circ;

    }

    public double calcularArea(double radio) { 

        return Math.PI * Math.pow(radio, 2); 

    }

    public double calcularPerimetro(double radio) { 

        return 2 * Math.PI * radio;

    }

}
