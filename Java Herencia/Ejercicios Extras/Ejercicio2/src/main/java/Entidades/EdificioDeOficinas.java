package Entidades;

import Constantes.Constantes;

public final class EdificioDeOficinas extends Edificio {

    private Integer numeroDeOficinas;
    private Integer numerodePersonasPorOficina;
    private Integer numeroDePisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer numeroDeOficinas, Integer numerodePersonasPorOficina, Integer numeroDePisos, Double alto, Double ancho, Double largo) {
        super(alto, ancho, largo);
        this.numeroDeOficinas = numeroDeOficinas;
        this.numerodePersonasPorOficina = numerodePersonasPorOficina;
        this.numeroDePisos = numeroDePisos;
    }

    public Integer getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    public void setNumeroDeOficinas(Integer numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }

    public Integer getNumerodePersonasPorOficina() {
        return numerodePersonasPorOficina;
    }

    public void setNumerodePersonasPorOficina(Integer numerodePersonasPorOficina) {
        this.numerodePersonasPorOficina = numerodePersonasPorOficina;
    }

    public Integer getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(Integer numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }

    @Override
    public void calcularSuperficie() {

        double superficie = this.largo * this.ancho;

        System.out.println(Constantes.SUPERFICIE + superficie);

    }

    @Override
    public void calcularVolumen() {

        double volumen = this.largo * this.ancho * this.alto;

        System.out.println(Constantes.SUPERFICIE + volumen);

    }

    public void crearEdificioDeOficinas() {

        crearEdificio();

        System.out.println(Constantes.NUMERO_PISOS);

        this.numeroDePisos = leer.nextInt();

        System.out.println(Constantes.NUMERO_OFICINAS);

        this.numeroDeOficinas = leer.nextInt();

        System.out.println(Constantes.CANTIDAD_PERSONAS_POR_OFICINA);

        this.numerodePersonasPorOficina = leer.nextInt();

    }

    public void cantPersonas() {

        this.numeroDeOficinas = this.numeroDePisos; //Segun la guía la cantidad de oficinas es igual a la cantidad de pisos

        int cantidadPersonasOficina = this.numeroDeOficinas;

        int cantidadPersonasEdificio = this.numeroDeOficinas * this.numerodePersonasPorOficina;

        System.out.println(Constantes.CANTIDAD_PERSONAS_OFICINA + cantidadPersonasOficina);

        System.out.println(Constantes.CANTIDAD_PERSONAS + cantidadPersonasEdificio);

    }

    @Override
    public String toString() {
        return "Edificio de oficinas" + ""
                + "\nNumero de Oficinas: " + numeroDeOficinas
                + "\nNumero de personas por oficina:" + numerodePersonasPorOficina
                + "\nNumero de pisos: " + numeroDePisos;
    }

}
