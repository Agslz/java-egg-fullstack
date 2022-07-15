package Entidades;

import Constantes.Constantes;

public final class Estudiantes extends Persona {

    private String cursoActual;

    public Estudiantes() {
    }

    public Estudiantes(String cursoActual, String nombre, String apellido, Integer numeroIdentificacion, String estadoCivil) {
        super(nombre, apellido, numeroIdentificacion, estadoCivil);
        this.cursoActual = cursoActual;
    }

    public String getCursoActual() {
        return cursoActual;
    }

    public void setCursoActual(String cursoActual) {
        this.cursoActual = cursoActual;
    }

    public void crearEstudiante() {
        
        System.out.println("Creando un estudiante");

        String auxCurso;

        crearPersona();

        do {

            System.out.println(Constantes.INGRESE_CURSO_ACTUAL);

            auxCurso = leer.next();

        } while (!auxCurso.equalsIgnoreCase("Lengua") && !auxCurso.equalsIgnoreCase("Matematica") && !auxCurso.equalsIgnoreCase("Arquitectura") && !auxCurso.equalsIgnoreCase("Ingenieria"));

        cursoActual = auxCurso;

    }

    @Override
    public String toString() {
        return super.toString() + "\nEstudiantes"
                + "\nCurso actual: " + cursoActual;
    }

}
