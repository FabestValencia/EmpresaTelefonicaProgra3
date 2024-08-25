public class PlanTelevision extends Plan {
    private boolean incluyeHD;

    public PlanTelevision(double costoMensual, int canalesTV, boolean incluyeHD) {
        super("Plan Televisión", costoMensual, 0, 0, canalesTV);
        this.incluyeHD = incluyeHD;
    }

    public boolean isIncluyeHD() {
        return incluyeHD;
    }

    public void setIncluyeHD(boolean incluyeHD) {
        this.incluyeHD = incluyeHD;
    }

    @Override
    public double calcularCostoTotal() {
        // Costo adicional por incluir canales HD
        double costoHD = incluyeHD ? 20000.00 : 0.00;
        return getCostoMensual() + costoHD;
    }
}
