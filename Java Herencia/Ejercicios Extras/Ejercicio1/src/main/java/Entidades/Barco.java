package Entidades;

import Constantes.Constantes;
import java.util.Scanner;

public class Barco {

    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected Integer matricula;
    protected Integer eslora;
    protected Integer anioFabricacion;

    public Barco() {
    }

    public Barco(Integer matricula, Integer eslora, Integer anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void crearBarco() {

        System.out.println(Constantes.INGRESE_MATRICULA);

        this.matricula = leer.nextInt();

        System.out.println(Constantes.INGRESE_ESLORA);

        this.eslora = leer.nextInt();

        System.out.println(Constantes.INGRESE_ANIO_FABRICACION);

        this.anioFabricacion = leer.nextInt();

    }
 
}
