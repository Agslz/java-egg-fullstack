package Entidades;

public class Meses {

    final String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    final String mesSecreto = mes[(int) (Math.random() * 12)];

    public String[] getMes() {
        return mes;
    }
    public String getMesSecreto() {
        return mesSecreto;
    }

}
