package Servicios;

import Entidades.NIF;
import java.util.Scanner;

public class ServiciosNIF {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public NIF crearNif() {

        NIF p1 = new NIF();

        System.out.println("Ingrese el DNI");

        p1.setDNI(leer.nextInt());

        int NIF = (int) (p1.getDNI() % 23);

        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V",
            "H", "L", "C", "K", "E"};

        p1.setLetra((letras[NIF]));

        return p1;
    }

    public void mostrar(NIF p1) {

        System.out.println(p1.getDNI() + "-" + p1.getLetra());
    }

}
