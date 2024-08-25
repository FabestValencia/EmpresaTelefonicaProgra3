public class PlanTelefonia extends Plan {
    private boolean llamadasInternacionales;

    public PlanTelefonia(double costoMensual, int minutosLlamadas, boolean llamadasInternacionales) {
        super("Plan Telefonía", costoMensual, minutosLlamadas, 0, 0);
        this.llamadasInternacionales = llamadasInternacionales;
    }

    public boolean isLlamadasInternacionales() {
        return llamadasInternacionales;
    }

    public void setLlamadasInternacionales(boolean llamadasInternacionales) {
        this.llamadasInternacionales = llamadasInternacionales;
    }

    @Override
    public double calcularCostoTotal() {
        double costoLlamadasInternacionales = llamadasInternacionales ? 15000.00 : 0.00;
        return getCostoMensual() + costoLlamadasInternacionales;
    }
}
