public class Cliente {
    private static int idInstancia = 1;
    private String id;
    private String nombre;
    private String direccion;
    private Plan plan;

    public Cliente(String nombre, String id, String direccion) {
        this.idInstancia = idInstancia++;
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.plan = null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public void asignarPlan(Plan plan) {
        if (this.plan == null || !this.plan.getDireccion().equals(this.direccion)) {
            this.plan = plan;
        } else {
            System.out.println("El cliente ya tiene un plan asignado para esta dirección.");
        }
    }

    public void eliminarPlan() {
        this.plan = null;
    }

    @Override
    public String toString() {
        return "Cliente [ID=" + id + ", Nombre=" + nombre + ", Identificación=" + numeroIdentificacion +
                ", Dirección=" + direccion + ", Plan=" + (plan != null ? plan.toString() : "Sin plan asignado") + "]";
    }
}
