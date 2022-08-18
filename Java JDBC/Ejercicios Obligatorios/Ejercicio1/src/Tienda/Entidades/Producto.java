package Tienda.Entidades;

public class Producto {

    private int codigo;
    private String nombre;
    private Double precio;
    private int codigoFabricante;
    private Fabricante fabricante;

    public Producto() {
    }

    public Producto(int codigo, String nombre, Double precio, int codigoFabricante, Fabricante fabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.codigoFabricante = codigoFabricante;
        this.fabricante = fabricante;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCodigoFabricante() {
        return codigoFabricante;
    }

    public void setCodigoFabricante(int codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Codigo:" + codigo + ", Nombre:" + nombre + ", Precio:" + precio + ", Codigo de fabricante:" + codigoFabricante + ", Fabricante:" + fabricante;
    }

}
