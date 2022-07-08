package Servicios;

import Constantes.Constantes;
import Entidades.Poliza;
import java.util.Calendar;
import java.util.Scanner;

public class ServiciosPoliza {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Poliza crearPoliza() {

        Poliza p = new Poliza();

        System.out.println(Constantes.NUMERO_POLIZA);

        p.setNumeroPoliza(leer.nextInt());

        fechasPoliza(p);

        System.out.println(Constantes.CANTIDAD_CUOTAS);

        p.setCantidadCuotas(leer.nextInt());

        System.out.println(Constantes.FORMA_DE_PAGO);

        p.setFormaDePago(leer.next());

        System.out.println(Constantes.MONTO_TOTAL_ASEGURADO);

        p.setMontoTotalAsegurado(leer.nextInt());

        System.out.println(Constantes.GRANIZO);

        String granizo = leer.next();

        if (granizo.equalsIgnoreCase("SI")) {

            p.setIncluyeGranizo(true);

            System.out.println(Constantes.MONTO_MAXIMO_GRANIZO);

            p.setMontoMaximoGranizo(leer.nextInt());

        } else {

            p.setIncluyeGranizo(false);
        }

        System.out.println(Constantes.TIPO_COBERTURA);

        p.setTipoDeCobertura(leer.next());

        return p;
    }

    public void fechasPoliza(Poliza p) {

        Calendar fechaInicio = Calendar.getInstance();
        Calendar fechaFin = Calendar.getInstance();

        System.out.println(Constantes.FECHA_INICIO);

        System.out.println(Constantes.DIA);
        int dia = leer.nextInt();
        System.out.println(Constantes.MES);
        int mes = leer.nextInt();
        System.out.println(Constantes.YEAR);
        int year = leer.nextInt();

        fechaInicio.set(Calendar.YEAR, year);
        fechaInicio.set(Calendar.MONTH, mes);
        fechaInicio.set(Calendar.DATE, dia);

        System.out.println("Año: " + fechaInicio.get(Calendar.YEAR));
        System.out.println("Mes: " + fechaInicio.get(Calendar.MONTH));
        System.out.println("Dia: " + fechaInicio.get(Calendar.DATE));

        p.setFechaDeInicio(fechaInicio);

        System.out.println(Constantes.FECHA_FIN_POLIZA);

        System.out.println(Constantes.DIA);
        dia = leer.nextInt();
        System.out.println(Constantes.MES);
        mes = leer.nextInt();
        System.out.println(Constantes.YEAR);
        year = leer.nextInt();

        fechaFin.set(Calendar.YEAR, year);
        fechaFin.set(Calendar.MONTH, mes);
        fechaFin.set(Calendar.DATE, dia);

        System.out.println("Año: " + fechaFin.get(Calendar.YEAR));
        System.out.println("Mes: " + fechaFin.get(Calendar.MONTH));
        System.out.println("Dia: " + fechaFin.get(Calendar.DATE));

        p.setFechaDeSalida(fechaFin);

    }

}
