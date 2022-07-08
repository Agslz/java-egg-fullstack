package Entidades;

public final class Profesores extends Empleado {

    private String departamento;

    public Profesores() {
    }

    public Profesores(String departamento, Integer anioIncorporacion, Integer numeroDespachoAsignado, String nombre, String apellido, Integer numeroIdentificacion, String estadoCivil) {
        super(anioIncorporacion, numeroDespachoAsignado, nombre, apellido, numeroIdentificacion, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void crearProfesor() {
        
        System.out.println("Creando profesor");

        crearEmpleado();

        String auxDepartamento;

        do {

            System.out.println("Ingrese el departamento al cual pertenece (Lengua/ Matematica/ Arquitectura/ Ingenieria)");

            auxDepartamento = leer.next();

        } while (!auxDepartamento.equalsIgnoreCase("Lengua") && !auxDepartamento.equalsIgnoreCase("Matematica") && !auxDepartamento.equalsIgnoreCase("Arquitectura") && !auxDepartamento.equalsIgnoreCase("Ingenieria"));

        this.departamento = auxDepartamento;

    }

    @Override
    public String toString() {
        return super.toString() + "\nProfesores"
                + "\nDepartamento: " + departamento;
    }

}
