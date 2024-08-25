import javax.swing.JOptionPane;
public class MostrarInformacion {
    public static void main(String[] args) {

    }
    public void mostrarInfo{
        int opcion=0;
        while(opcion!=5){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(" ingrese 1 si desea crear un plan personalizado" +
                    " ingrese 2 si desea crear un plan de telefonia" +
                    " ingrese 3 si desea crear un plan de television " +
                    " ingrese 4 si desea crear un plan de internet " +
                    " ingrese 5 si desea salir de la APP"));
        }

    }
}