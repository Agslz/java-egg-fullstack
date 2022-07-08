package Entidades;

public class Clientes {

    private String nombre;
    private String apellido;
    private Integer DNI;
    private String mail;
    private String domicilio;
    private Integer telefono;

    public Clientes() {
    }

    public Clientes(String nombre, String apellido, Integer DNI, String mail, String domicilio, Integer telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + "\nApellido: " + apellido
                + "\nDNI: " + DNI
                + "\nMail: " + mail
                + "\nDomicilio: " + domicilio
                + "\nTelefono: " + telefono;
    }

}
