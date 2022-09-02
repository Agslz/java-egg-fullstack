package Libreria.Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "prestamo")
public class Prestamo implements Serializable {

    @Id
    @Column(name = "id_prestamo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fechaDePrestamo", unique = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDePrestamo;

    @Column(name = "fechaDeDevolucion", unique = false, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeDevolucion;

    @OneToOne
    private Libro libro;

    @OneToOne
    private Cliente cliente;

    public Prestamo() {
    }

    public Prestamo(Integer id, Date fechaDePrestamo, Date fechaDeDevolucion, Libro libro, Cliente cliente) {
        this.id = id;
        this.fechaDePrestamo = fechaDePrestamo;
        this.fechaDeDevolucion = fechaDeDevolucion;
        this.libro = libro;
        this.cliente = cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaDePrestamo() {
        return fechaDePrestamo;
    }

    public void setFechaDePrestamo(Date fechaDePrestamo) {
        this.fechaDePrestamo = fechaDePrestamo;
    }

    public Date getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public void setFechaDeDevolucion(Date fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Fecha de prestamo: " + fechaDePrestamo + ", Fecha de devolución: " + fechaDeDevolucion + " Libro: " + libro + ", Cliente: " + cliente;
    }

}
