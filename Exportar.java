import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Exportar {

    public static void exportarDatos(LinkedList<Estudiante> listaEI, LinkedList<Dispositivo> listaDI, LinkedList<Estudiante> listaED, LinkedList<Dispositivo> listaDD) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("datos.txt"))) {
            for (Dispositivo dispositivo : listaDI) {
                if (dispositivo instanceof Laptop) {
                    Laptop laptop = (Laptop) dispositivo;
                    writer.println("Laptop," + laptop.getSerial() + "," + laptop.getMarca() + "," + laptop.getTamaño() + "," + laptop.getPrecio() + "," + laptop.getSistemaOperativo() + "," + laptop.getProcesador());
                } 
            }
            for (Dispositivo dispositivo : listaDD) {
                if (dispositivo instanceof Tablet) {
                    Tablet tablet = (Tablet) dispositivo;
                    writer.println("Tablet," + tablet.getSerial() + "," + tablet.getMarca() + "," + tablet.getTamaño() + "," + tablet.getPrecio() + "," + tablet.getAlmacenamiento() + "," + tablet.getPeso());
                }
            }
            for (Estudiante estudiante : listaEI) {
                if (estudiante instanceof EstIngenieria) {
                    EstIngenieria estInge = (EstIngenieria) estudiante;
                    writer.println("EstudianteIngenieria," + estInge.getCedula() + "," + estInge.getNombre() + "," + estInge.getApellido() + "," + estInge.getTelefono() + "," + estInge.getSerial()+ "," + estInge.getNumSemestreActual()+ "," + estInge.getPromedioAcum());
                }
            } 
            for (Estudiante estudiante : listaED) {
                if (estudiante instanceof EstDiseño) {
                    EstDiseño estDise = (EstDiseño) estudiante;
                    writer.println("EstudianteDiseno," + estDise.getCedula() + "," + estDise.getNombre() + "," + estDise.getApellido() + "," + estDise.getTelefono() + "," + estDise.getSerial()+ "," + estDise.getModEstudio()+ "," + estDise.getCantAsignaturas());
                }
            }
            writer.flush();
            }catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al exportar datos: " + e.getMessage());
            }

        } 
    
    }
