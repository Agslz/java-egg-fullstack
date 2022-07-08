package Servicios;

import Constantes.Constantes;
import Entidades.Vehiculo;

import java.util.Scanner;

public class ServiciosVehiculos {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Vehiculo crearVehiculos() {

        Vehiculo v = new Vehiculo();

        System.out.println(Constantes.MARCA_VEHICULO);

        v.setMarca(leer.next());

        System.out.println(Constantes.MODELO_VEHICULO);

        v.setModelo(leer.next());

        System.out.println(Constantes.YEAR_VEHICULO);

        v.setAño(leer.nextInt());

        System.out.println(Constantes.NUMERO_MOTOR);

        v.setNumeroMotor(leer.nextInt());

        System.out.println(Constantes.NUMERO_CHASIS);

        v.setNumeroChasis(leer.nextInt());

        System.out.println(Constantes.COLOR_VEHICULO);

        v.setColor(leer.next());

        System.out.println(Constantes.TIPO_VEHICULO);

        String tipoDeVehiculo = leer.next();

        while (!tipoDeVehiculo.equalsIgnoreCase("Camioneta") && !tipoDeVehiculo.equalsIgnoreCase("Auto") && !tipoDeVehiculo.equalsIgnoreCase("Moto")) {

            System.out.println(Constantes.VEHICULO_INVALIDO);

            tipoDeVehiculo = leer.next();

        }

        v.setTipo(tipoDeVehiculo);

        return v;
    }
}
