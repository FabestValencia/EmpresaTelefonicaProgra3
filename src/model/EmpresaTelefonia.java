import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmpresaTelefonia {
    private List<Cliente> clientes;

    public EmpresaTelefonia() {
        this.clientes = new ArrayList<>();
    }

    public void registrarCliente(Cliente cliente) {
        if (buscarClientePorDocumento(cliente.getNumeroIdentificacion()).isEmpty()) {
            clientes.add(cliente);
            System.out.println("Cliente registrado exitosamente.");
        } else {
            System.out.println("Cliente con este número de identificación ya está registrado.");
        }
    }

    public void modificarCliente(int id, String nuevoNombre, String nuevaIdentificacion, String nuevaDireccion) {
        clientes.stream()
                .filter(cliente -> cliente.getId() == id)
                .findFirst()
                .ifPresent(cliente -> {
                    cliente.setNombre(nuevoNombre);
                    cliente.setNumeroIdentificacion(nuevaIdentificacion);
                    cliente.setDireccion(nuevaDireccion);
                });
    }

    public Optional<Cliente> buscarClientePorDocumento(String numeroIdentificacion) {
        return clientes.stream()
                .filter(cliente -> cliente.getNumeroIdentificacion().equals(numeroIdentificacion))
                .findFirst();
    }

    public void modificarCliente(String id, String nuevoNombre, String nuevaDireccion) {
        clientes.stream()
                .filter(cliente -> cliente.getId() == id)
                .findFirst()
                .ifPresent(cliente -> {
                    cliente.setNombre(nuevoNombre);
                    cliente.setDireccion(nuevaDireccion);
                });
    }

    public void eliminarCliente(int id) {
        clientes = clientes.stream()
                .filter(cliente -> cliente.getId() != id)
                .collect(Collectors.toList());
    }

    /*
    public void asignarPlan(Cliente cliente, Plan plan) {
        if (!cliente.getPlan().isPresent()) {
            cliente.setPlan(plan);
            System.out.println("Plan asignado exitosamente.");
        } else {
            System.out.println("El cliente ya tiene un plan asignado.");
        }
    }
    */

    public void generarResumenFacturacion() {
        clientes.forEach(cliente -> {
            Optional<Plan> plan = cliente.getPlan();
            if (plan.isPresent()) {
                System.out.println(cliente.getNombre() + " - Plan: " + plan.get().getNombre() + " - Costo: " + plan.get().getCostoMensual());
            } else {
                System.out.println(cliente.getNombre() + " - Sin plan asignado.");
            }
        });
    }
}
