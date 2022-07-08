package Entidades;

import java.util.Calendar;

public class Poliza {

    private Integer numeroPoliza;
    private Calendar fechaDeInicio;
    private Calendar fechaDeSalida;
    private Integer cantidadCuotas;
    private String formaDePago;
    private Integer montoTotalAsegurado;
    private boolean incluyeGranizo;
    private Integer montoMaximoGranizo;
    private String tipoDeCobertura;

    public Poliza() {
    }

    public Poliza(Integer numeroPoliza, Calendar fechaDeInicio, Calendar fechaDeSalida, Integer cantidadCuotas, Integer montoTotalAsegurado, boolean incluyeGranizo, Integer montoMaximoGranizo, String tipoDeCobertura) {

        this.numeroPoliza = numeroPoliza;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeSalida = fechaDeSalida;
        this.cantidadCuotas = cantidadCuotas;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.incluyeGranizo = incluyeGranizo;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.tipoDeCobertura = tipoDeCobertura;
    }

    public Integer getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(Integer numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public Calendar getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(Calendar fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public Calendar getFechaDeSalida() {
        return fechaDeSalida;
    }

    public void setFechaDeSalida(Calendar fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
    }

    public Integer getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(Integer cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public Integer getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(Integer montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public Integer getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(Integer montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public String getTipoDeCobertura() {
        return tipoDeCobertura;
    }

    public void setTipoDeCobertura(String tipoDeCobertura) {
        this.tipoDeCobertura = tipoDeCobertura;
    }

    @Override
    public String toString() {
        return "Numero de poliza:" + numeroPoliza
                + "\nFecha de inicio: " + fechaDeInicio.getTime()
                + "\nFecha de fin de poliza: " + fechaDeSalida.getTime() //ToDo mostrar fehca bien
                + "\nCantidad de cuotas: " + cantidadCuotas
                + "\nForma de pago: " + formaDePago
                + "\nMonto total asegudoro: " + montoTotalAsegurado
                + "\n¿Incluye granizo?" + incluyeGranizo
                + "\nMonto maximo granizo: " + montoMaximoGranizo
                + "\nTipo de cobertura: " + tipoDeCobertura;
    }
}
