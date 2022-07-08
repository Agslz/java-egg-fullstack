package Servicios;

import Constantes.Constantes;
import Entidades.Cuotas;
import java.util.Calendar;
import java.util.Scanner;

public class ServiciosCuotas {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuotas crearCuotas() {

        Cuotas c = new Cuotas();

        System.out.println(Constantes.NUMERO_CUOTA);

        c.setNumeroDeCuenta(leer.nextInt());

        System.out.println(Constantes.MONTO_TOTAL_CUOTA);

        c.setMontoTotal(leer.nextInt());

        System.out.println(Constantes.ESTA_PAGADA);

        String pago = leer.next();

        if (pago.equalsIgnoreCase("SI")) {

            c.setCuotaPagada(true);

        } else {

            c.setCuotaPagada(false);
        }

        System.out.println(Constantes.FECHA_VENCIMIENTO);

        ingresarFechaVencimiento(c);

        System.out.println(Constantes.FORMA_DE_PAGO);

        c.setFormaDePago(leer.next());

        return c;

    }

    public void ingresarFechaVencimiento(Cuotas c) {

        Calendar fechaVencimiento = Calendar.getInstance();

        System.out.println(Constantes.DIA);
        int dia = leer.nextInt();
        System.out.println(Constantes.MES);
        int mes = leer.nextInt();
        System.out.println(Constantes.YEAR);
        int year = leer.nextInt();

        fechaVencimiento.set(Calendar.YEAR, year);
        fechaVencimiento.set(Calendar.MONTH, mes);
        fechaVencimiento.set(Calendar.DATE, dia);

        System.out.println("Año: " + fechaVencimiento.get(Calendar.YEAR));
        System.out.println("Mes: " + fechaVencimiento.get(Calendar.MONTH));
        System.out.println("Dia: " + fechaVencimiento.get(Calendar.DATE));

        c.setFechaVencimiento(fechaVencimiento);

    }

}
