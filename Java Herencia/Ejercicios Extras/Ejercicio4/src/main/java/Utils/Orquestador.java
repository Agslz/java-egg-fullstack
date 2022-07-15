package Utils;

import Entidades.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Constantes.Constantes;

public class Orquestador {

    private static final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void crearOrquestador() {

        List<Persona> listaPersonas = new ArrayList<>();

        crearPersonas(listaPersonas);

        int opc;

        System.out.println(Constantes.MENU);

        do {

            System.out.println(Constantes.INGRESE_OPCION);

            opc = leer.nextInt();

            switch (opc) {
                case 1 ->
                    cambiarEstadoCivil(listaPersonas);
                case 2 ->
                    reasignarDespachoEmpleado(listaPersonas);
                case 3 ->
                    nuevaMatriculacion(listaPersonas);
                case 4 ->
                    cambioDepartamentoProfesor(listaPersonas);
                case 5 ->
                    trasladarEmpleadoServicio(listaPersonas);
                case 6 ->
                    mostraIndividuos(listaPersonas);
                case 7 ->
                    System.out.println(Constantes.MENU);
                case 8 ->
                    System.out.println("Usted salió");
                default ->
                    System.out.println("La opción ingresada es invalida");
            }

        } while (opc
                != 8);

    }

    public static void crearPersonas(List<Persona> listaPersonas) {

        for (int i = 0; i < 1; i++) {

            Estudiantes newEstudiante = new Estudiantes();

            newEstudiante.crearEstudiante();

            listaPersonas.add(newEstudiante);

            Profesores newProfesores = new Profesores();

            newProfesores.crearProfesor();

            listaPersonas.add(newProfesores);

            PersonalDeServicio newPersonalDeServicio = new PersonalDeServicio();

            newPersonalDeServicio.crearPersonalDeServicio();

            listaPersonas.add(newPersonalDeServicio);

        }

    }

    public static void cambiarEstadoCivil(List<Persona> listaPersonas) {

        for (Persona aux : listaPersonas) {

            if (validarDNI(listaPersonas)) {

                System.out.println("Ingrese su nuevo estado civil");

                String nuevoEstado = leer.next();

                aux.setEstadoCivil(nuevoEstado);

                break;

            } else {

                System.out.println("El DNI ingresado no es encuentra en la base de datos");

                break;

            }

        }

    }

    public static void reasignarDespachoEmpleado(List<Persona> listaPersonas) {

        for (Persona aux : listaPersonas) {

            if (validarDNI(listaPersonas)) {

                if (aux instanceof Profesores auxProfesores) {

                    System.out.println("Ingrese el nuevo despacho al cual fue reasignado");

                    Integer nuevoDespacho = leer.nextInt();

                    auxProfesores.setNumeroDespachoAsignado(nuevoDespacho);

                    break;

                } else {

                    System.out.println("El DNI ingresado no es encuentra en la base de datos");

                    break;

                }

            }

            if (validarDNI(listaPersonas)) {

                if (aux instanceof PersonalDeServicio auxPersonal) {

                    System.out.println("Ingres el nuevo despacho al cual fue reasignado");

                    Integer nuevoDespacho = leer.nextInt();

                    auxPersonal.setNumeroDespachoAsignado(nuevoDespacho);

                    break;

                } else {

                    System.out.println("El nombre ingresado no es encuentra en la base de datos");

                    break;

                }

            }

        }

    }

    public static void nuevaMatriculacion(List<Persona> listaPersonas) {

        for (Persona aux : listaPersonas) {

            if (validarDNI(listaPersonas)) {

                if (aux instanceof Estudiantes estudiantes) {

                    System.out.println("Ingrese su nuevo numero de matricula");

                    String nuevaMatricula = leer.next();

                    estudiantes.setCursoActual(nuevaMatricula);

                    break;

                } else {

                    System.out.println("El DNI ingresado no es encuentra en la base de datos");

                    break;

                }

            }

        }

    }

    public static void cambioDepartamentoProfesor(List<Persona> listaPersonas) {

        for (Persona aux : listaPersonas) {

            if (validarDNI(listaPersonas)) {

                if (aux instanceof Profesores profesores) {

                    System.out.println("Ingrese el nuevo departamento al cual fue reasignado");

                    String nuevoDepartamento = leer.next();

                    profesores.setDepartamento(nuevoDepartamento);

                    break;

                } else {

                    System.out.println("El DNI ingresado no es encuentra en la base de datos");

                    break;

                }

            }

        }

    }

    public static void trasladarEmpleadoServicio(List<Persona> listaPersonas) {

        for (Persona aux : listaPersonas) {

            if (validarDNI(listaPersonas)) {

                if (aux instanceof PersonalDeServicio personalDeServicio) {

                    System.out.println("Ingrese la nueva sección a la cual fue trasladado");

                    String servicioAux = leer.next();

                    personalDeServicio.setServicioAsignado(servicioAux);

                    break;

                } else {

                    System.out.println("El DNI ingresado no es encuentra en la base de datos");

                    break;

                }

            }

        }

    }

    public static void mostraIndividuos(List<Persona> listaPersonas) {

        listaPersonas.forEach((Persona aux) -> System.out.println(aux));

    }

    public static boolean validarDNI(List<Persona> listaPersonas) {

        System.out.println("Ingrese el DNI a validar");

        int dniAux = leer.nextInt();

        for (Persona aux : listaPersonas) {

            if (aux.getDNI() == dniAux) {

                return true;
            }

        }
        return false;

    }

}
