public class PlanInternet extends Plan {
    private boolean fibraOptica;

    public PlanInternet(double costoMensual, int gigasInternet, boolean fibraOptica) {
        super("Plan Internet", costoMensual, 0, gigasInternet, 0);
        this.fibraOptica = fibraOptica;
    }

    public boolean isFibraOptica() {
        return fibraOptica;
    }

    public void setFibraOptica(boolean fibraOptica) {
        this.fibraOptica = fibraOptica;
    }

    @Override
    public double calcularCostoTotal() {
        double costoFibraOptica = fibraOptica ? 30000.00 : 0.00;
        return getCostoMensual() + costoFibraOptica;
    }
}
