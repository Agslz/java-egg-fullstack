package Entidades;

import java.util.Calendar;

public class Cuotas {

    private Integer numeroDeCuenta;
    private Integer montoTotal;
    private boolean cuotaPagada;
    private Calendar fechaVencimiento;
    private String formaDePago;

    public Cuotas() {
    }

    public Cuotas(Integer numeroDeCuenta, Integer montoTotal, boolean cuotaPagada, Calendar fechaVencimiento, String formaDePago) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.montoTotal = montoTotal;
        this.cuotaPagada = cuotaPagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formaDePago = formaDePago;
    }

    public Integer getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(Integer numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public Integer getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Integer montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isCuotaPagada() {
        return cuotaPagada;
    }

    public void setCuotaPagada(boolean cuotaPagada) {
        this.cuotaPagada = cuotaPagada;
    }

    public Calendar getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Calendar fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    @Override
    public String toString() {
        return "Numero de cuenta: " + numeroDeCuenta
                + "\nMonto total: " + montoTotal
                + "\nCuota pagada: " + cuotaPagada
                + "\nFecha de vencimiento: " + fechaVencimiento
                + "\nForma de pago: " + formaDePago;
    }

}
