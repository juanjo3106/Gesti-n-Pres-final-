

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class PrincipalMenu {

    public static void main(String[] args) {

        LinkedList<Estudiante> listaEI = new LinkedList<>();
        LinkedList<Dispositivo> listaDI = new LinkedList<>();
        LinkedList<Estudiante> listaED = new LinkedList<>();
        LinkedList<Dispositivo> listaDD = new LinkedList<>();
        MetodosInge mi = new MetodosInge();
        MetodosDise md = new MetodosDise();

        int opt = 0;
        int opt1 = 0;
        int opt2 = 0;

        do {
            String mensaje = "------- \tIngrese la opcion que desea ejecutar\t ------ \n" +
                    "1. Estudiante de Ingenieria. \n" +
                    "2. Estudiante de Diseño. \n" +
                    "3. Imprimir inventario total. \n" +
                    "4. Importar Archivo. \n" +
                    "5. Exportar Archivo. \n" +
                    "6. Salir del prgrama.";
            opt = (Integer.parseInt(JOptionPane.showInputDialog(mensaje)));

            switch (opt) {
                case 1:
                    // Estudiante ingenieria
                    while (opt1 != 5) {
                        String mensaje1 = "\n\t Que desea hacer \t\n" +
                                "1 Registrar préstamo de equipo.\n" +
                                "2 Modificar préstamo del equipo (Por Serial).\n" +
                                "3 Devolucion del equipo (Por Serial).\n" +
                                "4 Buscar equipo (Por Serial).\n" +
                                "5 volver al menú principal.";
                        opt1 = (Integer.parseInt(JOptionPane.showInputDialog(mensaje1)));

                        switch (opt1) {
                            case 1:
                                // Registrar equipo
                                listaEI = mi.LLenarListaE(listaEI);

                                for (Dispositivo disp : listaDI) {
                                    Laptop lap = (Laptop) disp;
                                    for (Estudiante est : listaEI) {
                                        EstIngenieria e2 = (EstIngenieria) est;

                                        if (e2.getSerial().equalsIgnoreCase(lap.getSerial())) {
                                            e2.setSerial(lap.getSerial());
                                        } else {
                                            break;
                                        }

                                    }
                                }

                                listaDI = mi.LLenarListaD(listaDI);

                                break;

                            case 2:
                                // Modificar equipo
                                String serialB;
                                serialB = JOptionPane.showInputDialog("Ingrese el serial del dispositivo, Donde se modificará el Estudiante que hace uso del el.");
                                mi.Modificar(serialB, listaDI, listaEI);

                                break;

                            case 3:
                                // Devolucion de equipo
                                String bs = "";
                                mi.Eliminar(bs, listaEI);
                                break;

                            case 4:
                                // Buscar equipo
                                String buscarSerial;
                                buscarSerial = JOptionPane
                                        .showInputDialog("Ingrese el serial del dispositivo que desea buscar.");

                                mi.Buscar(listaEI, listaDI, buscarSerial);

                                break;

                            case 5:
                                // Salir del menú 2
                                JOptionPane.showMessageDialog(null, "volviendo al menú principal");
                                break;

                            default:
                                JOptionPane.showMessageDialog(null,
                                        "Seleccionó una opcion incorrecta, intente de nuevo");
                                break;
                        }
                    }
                    opt1 = 0;
                    break;

                case 2:
                    // Estudiante Diseño
                    while (opt2 != 5) {
                        String mensaje2 = "\n\t Que desea hacer \t\n" +
                                "1 Registrar préstamo de equipo.\n" +
                                "2 Modificar préstamo del equipo (Por Serial).\n" +
                                "3 Devolucion del equipo (Por Serial).\n" +
                                "4 Buscar equipo (Por Serial).\n" +
                                "5 volver al menú principal.";
                        opt2 = (Integer.parseInt(JOptionPane.showInputDialog(mensaje2)));

                        switch (opt2) {
                            case 1:
                                // Registrar equipo
                                listaED = md.LLenarListaE(listaED);

                                for (Dispositivo disp : listaDD) {
                                    Tablet tab = (Tablet) disp;
                                    for (Estudiante est : listaED) {
                                        EstIngenieria e2 = (EstIngenieria) est;

                                        if (e2.getSerial().equalsIgnoreCase(tab.getSerial())) {
                                            e2.setSerial(tab.getSerial());
                                        } else {
                                            break;
                                        }

                                    }
                                }

                                listaDD = md.LLenarListaD(listaDD);
                                break;

                            case 2:
                                // Modificar equipo
                                String serialB;
                                serialB = JOptionPane.showInputDialog("Ingrese el serial del dispositivo, Donde se modificará el Estudiante que hace uso del el.");
                                md.Modificar(serialB, listaDD, listaED);
                                break;

                            case 3:
                                // Devolucion de equipo
                                String bs = "";
                                md.Eliminar(bs, listaED);
                                break;

                            case 4:
                                // Buscar equipo
                                String buscarSerial;
                                buscarSerial = JOptionPane.showInputDialog("Ingrese el serial del dispositivo que desea buscar.");

                                md.Buscar(listaED, listaDD, buscarSerial);

                                break;

                            case 5:
                                // Salir del menú 2
                                JOptionPane.showMessageDialog(null, "volviendo al menú principal");
                                break;

                            default:
                                JOptionPane.showMessageDialog(null,"Seleccionó una opcion incorrecta, intente de nuevo");
                                break;
                        }
                    }
                    opt2 = 0;
                    break;

                case 3:
                    mi.Mostrarlistas(listaEI, listaDI);
                    md.Mostrarlistas(listaED, listaDD);
                    break;

                case 4:
                    //importar
                    break;
                    
                case 5:
                    //exportar
                    break;    

                case 6:
                    JOptionPane.showMessageDialog(null,"\tSaliendo del programa, Gracias por usar nuestro servicio.\t");
                    break;

                default:

                    JOptionPane.showMessageDialog(null, "Seleccionó una opcion incorrecta, intente de nuevo");
                    break;
            }
        } while (opt != 6);

    }
}