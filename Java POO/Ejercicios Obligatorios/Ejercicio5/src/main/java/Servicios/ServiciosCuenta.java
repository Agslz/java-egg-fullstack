package Servicios;

import Entidades.Cuenta;
import java.util.Scanner;

public class ServiciosCuenta {

    Scanner leer = new Scanner(System.in);

    Cuenta cta = new Cuenta();

    public Cuenta crearCuenta() {

        System.out.println("Ingrese el numero de cuenta");

        cta.setNumeroCuenta(leer.nextInt());

        System.out.println("Ingrese su DNI");

        cta.setDNI(leer.nextInt());

        System.out.println("Ingrese su saldo actual");

        cta.setSaldoActual(leer.nextInt());

        return cta;
    }

    public void ingresarDinero(double ingreso) {

        cta.setSaldoActual(cta.getSaldoActual() + ingreso);

    }

    public void retirarDinero(double ingreso) {

        if (ingreso < cta.getSaldoActual()) {

            cta.setSaldoActual(cta.getSaldoActual() - ingreso);

        } else {

            cta.setSaldoActual(0);

        }
    }

    public void extraccionRapida(double ingreso) {

        if (ingreso <= cta.getSaldoActual() * 0.2) {

            cta.setSaldoActual(cta.getSaldoActual() - ingreso);

        } else {

            System.out.println("No puede extraer más del 20% del total del saldo disponible");
        }
    }

    public String consultarSaldo() {

        return "Su saldo actual es: " + cta.getSaldoActual();

    }

    public void consultarDatos() {

        System.out.println("---Datos Personales---");

        System.out.println("Numero de cuenta " + cta.getNumeroCuenta());
        System.out.println("Dni " + cta.getDNI());
        System.out.println("Saldo actual " + cta.getSaldoActual());

    }

    public void ejecutarMenu(ServiciosCuenta cta) {

        System.out.println("1.Consultar el saldo en la cuenta \n"
                + "2.Depositar dinero\n"
                + "3.Retirar dinero\n"
                + "4.Extracción rapida\n"
                + "5.Consultar Datos");

        int opcion;

        do {
            System.out.println("Ingrese una opción");

            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println(cta.consultarSaldo());
                    break;
                case 2:
                    System.out.println("Ingrese una cantidad de dinero a ingresar");
                    cta.ingresarDinero(leer.nextDouble());
                    break;
                case 3:
                    System.out.println("Ingrese una cantidad a retirar de dinero");
                    cta.retirarDinero(leer.nextDouble());
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de dinero a retirar");
                    cta.extraccionRapida(leer.nextDouble());
                    break;
                case 5:
                    cta.consultarDatos();
                    break;
                default:
                    System.out.println("Ingrese una opción correcta");
            }
        } while (opcion != 5);

    }

}
