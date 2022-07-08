package Entidades;

public final class Camping extends AlojamientoExtraHotelero {

    private Integer capacidadMaximaCarpas;
    private Integer cantidadBañosDisplonibles;
    private boolean poseeRestaurante;

    public Camping() {
    }

    public Camping(Integer capacidadMaximaCarpas, Integer cantidadBañosDisplonibles, boolean poseeRestaurante, boolean isPrivado, Integer cantidadMetrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(isPrivado, cantidadMetrosCuadrados, nombre, direccion, localidad, gerente);
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.cantidadBañosDisplonibles = cantidadBañosDisplonibles;
        this.poseeRestaurante = poseeRestaurante;
    }

    public Integer getCapacidadMaximaCarpas() {
        return capacidadMaximaCarpas;
    }

    public void setCapacidadMaximaCarpas(Integer capacidadMaximaCarpas) {
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
    }

    public Integer getCantidadBañosDisplonibles() {
        return cantidadBañosDisplonibles;
    }

    public void setCantidadBañosDisplonibles(Integer cantidadBañosDisplonibles) {
        this.cantidadBañosDisplonibles = cantidadBañosDisplonibles;
    }

    public boolean isPoseeRestaurante() {
        return poseeRestaurante;
    }

    public void setPoseeRestaurante(boolean poseeRestaurante) {
        this.poseeRestaurante = poseeRestaurante;
    }

    public void crearCamping() {

        System.out.println("Creamos un camping");

        crearAlojamientoExtraHotelero();
        
        validarSiPoseeResturante(this.poseeRestaurante);

        System.out.println("Ingrese la capacidad maxima de carpas");

        this.capacidadMaximaCarpas = leer.nextInt();

        System.out.println("Ingrese la cantidad de baños que posee");

        this.cantidadBañosDisplonibles = leer.nextInt();

    }

    public void validarSiPoseeResturante(boolean poseeRestaurante) {

        String restauranteAux;

        do {

            System.out.println("Ingrese si el restaurante posee restaurante (SI/NO)");

            restauranteAux = leer.next();

            if (restauranteAux.equalsIgnoreCase("SI")) {

                this.poseeRestaurante = true;

            } else {

                this.poseeRestaurante = false;

            }

        } while (!restauranteAux.equalsIgnoreCase("SI") && !restauranteAux.equalsIgnoreCase("NO"));

    }

    @Override
    public String toString() {
        return super.toString() + "\nCamping"
                + "\nCapacidad maxima de carpas: " + capacidadMaximaCarpas
                + "\nCantidad de baños disponibles: " + cantidadBañosDisplonibles
                + "\nPosee restaurante?" + poseeRestaurante;
    }

}
