public abstract class Plan {
    private static int idCounter = 1;
    private String nombreplan;
    private double costoMensual;

    // Servicios incluidos
    private int minutosLlamadas;
    private int gigasInternet;
    private int canalesTV;

    public Plan(String nombrePlan, double costoMensual, int minutosLlamadas, int gigasInternet, int canalesTV) {
        this.id = idCounter++;
        this.nombrePlan = nombrePlan;
        this.costoMensual = costoMensual;
        this.minutosLlamadas = minutosLlamadas;
        this.gigasInternet = gigasInternet;
        this.canalesTV = canalesTV;
    }

    public String getNombreplan() {
        return nombreplan;
    }

    public void setNombreplan(String nombreplan) {
        this.nombreplan = nombreplan;
    }

    public double getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(double costoMensual) {
        this.costoMensual = costoMensual;
    }

    public int getMinutosLlamadas() {
        return minutosLlamadas;
    }

    public void setMinutosLlamadas(int minutosLlamadas) {
        this.minutosLlamadas = minutosLlamadas;
    }

    public int getGigasInternet() {
        return gigasInternet;
    }

    public void setGigasInternet(int gigasInternet) {
        this.gigasInternet = gigasInternet;
    }

    public int getCanalesTV() {
        return canalesTV;
    }

    public void setCanalesTV(int canalesTV) {
        this.canalesTV = canalesTV;
    }

    // Método abstracto que calculará el costo total
    public abstract double calcularCostoTotal();

    @Override
    public String toString() {
        return nombre + " [ID=" + id + ", Costo Mensual=" + costoMensual +
                ", Minutos de Llamadas=" + minutosLlamadas +
                ", Gigas de Internet=" + gigasInternet +
                ", Canales de TV=" + canalesTV + "]";
    }
}
