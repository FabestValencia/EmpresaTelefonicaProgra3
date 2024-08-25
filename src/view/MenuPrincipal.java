import javax.swing.JOptionPane;

public class MenuPrincipal {
    public void mostrarInfo() {
        int opcion = 0;
        while (opcion != 6) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese:\n" +
                    "1 si desea crear un plan personalizado\n" +
                    "2 si desea crear un plan de telefonía\n" +
                    "3 si desea crear un plan de televisión\n" +
                    "4 si desea crear un plan de internet\n" +
                    "5 si desea modificar un cliente\n" +
                    "6 si desea salir de la APP"));
            if (opcion == 1) {
                // Handle plan personalizado
            } else if (opcion == 2) {
                // Handle plan de telefonía
            } else if (opcion == 3) {
                // Handle plan de televisión
            } else if (opcion == 4) {
                // Handle plan de internet
            } else if (opcion == 5) {
                // Handle modificar un cliente
            }
        }
}