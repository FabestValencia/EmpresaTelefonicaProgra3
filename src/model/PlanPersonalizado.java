public class PlanPersonalizado extends Plan {
    private PlanTelefonia planTelefonia;
    private PlanInternet planInternet;
    private PlanTelevision planTelevision;

    public PlanPersonalizado(double costoMensual) {
        super("Plan Personalizado", costoMensual, 0, 0, 0);
    }

    public void agregarPlanTelefonia(PlanTelefonia plan) {
        if (this.planTelefonia == null) {
            this.planTelefonia = plan;
            actualizarCosto();
        } else {
            throw new IllegalArgumentException("Solo se puede agregar un plan de telefonía.");
        }
    }

    public void agregarPlanInternet(PlanInternet plan) {
        if (this.planInternet == null) {
            this.planInternet = plan;
            actualizarCosto();
        } else {
            throw new IllegalArgumentException("Solo se puede agregar un plan de internet.");
        }
    }

    public void agregarPlanTelevision(PlanTelevision plan) {
        if (this.planTelevision == null) {
            this.planTelevision = plan;
            actualizarCosto();
        } else {
            throw new IllegalArgumentException("Solo se puede agregar un plan de televisión.");
        }
    }

    private void actualizarCosto() {
        double costoTotal = 0;
        if (planTelefonia != null) {
            costoTotal += planTelefonia.getCostoMensual();
        }
        if (planInternet != null) {
            costoTotal += planInternet.getCostoMensual();
        }
        if (planTelevision != null) {
            costoTotal += planTelevision.getCostoMensual();
        }
        // Actualizamos el costo total del plan personalizado
        super.costoMensual = costoTotal;
    }

    @Override
    public double calcularCostoTotal() {
        double costoTotal = super.costoMensual;

        // Aplicar descuentos si es necesario
        int servicios = 0;
        if (planTelefonia != null) servicios++;
        if (planInternet != null) servicios++;
        if (planTelevision != null) servicios++;

        if (servicios == 2) {
            costoTotal *= 0.90; // 10% de descuento
        } else if (servicios == 3) {
            costoTotal *= 0.80; // 20% de descuento
        }

        return costoTotal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", Servicios incluidos: ");
        if (planTelefonia != null) sb.append("Telefonía ");
        if (planInternet != null) sb.append("Internet ");
        if (planTelevision != null) sb.append("Televisión ");
        return sb.toString();
    }
}
