package Servicios;

import Constantes.Constantes;
import Entidades.Clientes;
import Entidades.Cuotas;
import Entidades.Poliza;
import Entidades.Vehiculo;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosMenu {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final ServiciosClientes ServClientes = new ServiciosClientes();
    private final ServiciosVehiculos ServVehiculos = new ServiciosVehiculos();
    private final ServiciosPoliza ServPoliza = new ServiciosPoliza();
    private final ServiciosCuotas ServCuotas = new ServiciosCuotas();
    private final ArrayList<Vehiculo> listaVehiculo = new ArrayList<>();
    private final ArrayList<Clientes> listaClientes = new ArrayList<>();
    private final ArrayList<Poliza> listaPolizas = new ArrayList<>();
    private final ArrayList<Cuotas> listaCuotas = new ArrayList<>();

    public void menu() {

        System.out.println(Constantes.DATOS_PERSONA);

        listaClientes.add(ServClientes.crearClientes());

        System.out.println(Constantes.DATOS_VEHICULO);

        listaVehiculo.add(ServVehiculos.crearVehiculos());

        System.out.println(Constantes.DATOS_POLIZA);

        listaPolizas.add(ServPoliza.crearPoliza());

        System.out.println(Constantes.DATOS_CUOTAS);

        listaCuotas.add(ServCuotas.crearCuotas());

        ejecutarMenu();

    }

    public void ejecutarMenu() {

        int opc;

        System.out.println(Constantes.MENU_OPCIONES);

        do {
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    mostrarDatosCliente(listaClientes);
                    break;
                case 2:
                    mostrarDatosVehiculo(listaVehiculo);
                    break;
                case 3:
                    mostrarDatosPoliza(listaPolizas);
                    break;
                case 4:
                    mostrarDatosCuotas(listaCuotas);
                    break;
                case 5:
                    System.out.println(Constantes.MENU_OPCIONES);
                    break;
                case 6:
                    break;
                default:
                    System.out.println(Constantes.OPCION_INVALIDA);
            }
        } while (opc != 6);
    }

    public void mostrarDatosCliente(ArrayList<Clientes> clientes) {
        for (Clientes cliente1 : clientes) {
            System.out.println(cliente1);
        }
    }
    public void mostrarDatosVehiculo(ArrayList<Vehiculo> vehiculo) {
        for (Vehiculo vehiculo1 : vehiculo) {

            System.out.println(vehiculo1);
        }
    }
    public void mostrarDatosPoliza(ArrayList<Poliza> poliza) {
        for (Poliza poliza1 : poliza) {

            System.out.println(poliza1);
        }
    }
    public void mostrarDatosCuotas(ArrayList<Cuotas> cuota) {
        for (Cuotas cuotas : cuota) {

            System.out.println(cuotas);
        }
    }
}
