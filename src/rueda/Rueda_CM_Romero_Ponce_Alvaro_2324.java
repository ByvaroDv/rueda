package rueda;

public class Rueda_CM_Romero_Ponce_Alvaro_2324 {

    private double combustible_queda;
    private double centimos_litro;

    //capacidad del depósito en litros.
    private int capacidad;

    // litros a los cien.
    private double consumo_CM_Romero_Ponce_Alvaro_2324;

    public Rueda_CM_Romero_Ponce_Alvaro_2324() {

    }

    public Rueda_CM_Romero_Ponce_Alvaro_2324(double combustible_queda, double centimos_litro, int capacidad) {

        this.combustible_queda = combustible_queda;
        this.centimos_litro = centimos_litro;
        this.capacidad = capacidad;
        this.consumo_CM_Romero_Ponce_Alvaro_2324 = 6.1;

    }

    public double getcombustible() {

        return getCombustible_queda();
    }

    public void viaje(int km) throws Exception {

        if (km * this.getConsumo_CM_Romero_Ponce_Alvaro_2324() / 100 > this.getCombustible_queda()) {

            throw new Exception("No hay suficiente combustible para esa distancia.");
        }

        if (km <= 0) {

            throw new Exception("No tiene sentido recorrer una distancia que no sea positiva.");
        }

        this.setCombustible_queda(this.getCombustible_queda() - (km * this.getConsumo_CM_Romero_Ponce_Alvaro_2324() / 100));

    }

    public void rellenarDeposito(int litros, double dinero, double centimosLitro_CM_Romero_Ponce_Alvaro_2324) throws Exception {

        if ((dinero <= 0) || (litros <= 0)) {

            throw new Exception("No se puede rellenar el depósito.");
        }

        if (this.getCombustible_queda() + litros > getCapacidad()) {

            throw new Exception("No se puede rellenar, porque se supera la capacidad del depósito.");
        }

        if (dinero < litros * getCentimos_litro()) {

            throw new Exception("No tiene dinero suficiente para rellenar el depósito.");
        }

        this.setCombustible_queda(this.getCombustible_queda() + litros);

    }

    /**
     * @return the combustible_queda
     */
    public double getCombustible_queda() {
        return combustible_queda;
    }

    /**
     * @param combustible_queda the combustible_queda to set
     */
    public void setCombustible_queda(double combustible_queda) {
        this.combustible_queda = combustible_queda;
    }

    /**
     * @return the centimos_litro
     */
    public double getCentimos_litro() {
        return centimos_litro;
    }

    /**
     * @param centimos_litro the centimos_litro to set
     */
    public void setCentimos_litro(double centimos_litro) {
        this.centimos_litro = centimos_litro;
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the consumo_CM_Romero_Ponce_Alvaro_2324
     */
    public double getConsumo_CM_Romero_Ponce_Alvaro_2324() {
        return consumo_CM_Romero_Ponce_Alvaro_2324;
    }

    /**
     * @param consumo_CM_Romero_Ponce_Alvaro_2324 the consumo_CM_Romero_Ponce_Alvaro_2324 to set
     */
    public void setConsumo_CM_Romero_Ponce_Alvaro_2324(double consumo_CM_Romero_Ponce_Alvaro_2324) {
        this.consumo_CM_Romero_Ponce_Alvaro_2324 = consumo_CM_Romero_Ponce_Alvaro_2324;
    }
}
