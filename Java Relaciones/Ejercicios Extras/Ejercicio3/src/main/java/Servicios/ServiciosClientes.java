package Servicios;

import Constantes.Constantes;
import Entidades.Clientes;
import java.util.Scanner;

public class ServiciosClientes {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Clientes crearClientes() {

        Clientes c = new Clientes();

        System.out.println(Constantes.NOMBRE);

        c.setNombre(leer.next());

        System.out.println(Constantes.APELLIDO);

        c.setApellido(leer.next());

        System.out.println(Constantes.DNI);

        c.setDNI(leer.nextInt());

        System.out.println(Constantes.MAIL);

        String mail = leer.next();

        while (!mail.contains("@") || !mail.contains(".com")) {

            System.out.println(Constantes.MAIL_INVALIDO);

            mail = leer.next();

        }

        c.setMail(mail);

        System.out.println(Constantes.DOMICILIO);

        c.setDomicilio(leer.next());

        System.out.println(Constantes.TELEFONO);

        c.setTelefono(leer.nextInt());

        return c;
    }

}
