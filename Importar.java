import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Importar {

    public static void importarDatos(LinkedList<Estudiante> listaEstudiantes, LinkedList<Dispositivo> listaDispositivos) {
        try (BufferedReader reader = new BufferedReader(new FileReader("datos.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                // Lógica para importar datos según el tipo de línea
                if (data[0].equals("Laptop")) {
                    listaDispositivos.add(new Laptop(data[1], data[2], Float.parseFloat(data[3]), Float.parseFloat(data[4]), data[5], data[6]));
                } else if (data[0].equals("Tablet")) {
                    listaDispositivos.add(new Tablet(data[1], data[2], Float.parseFloat(data[3]), Float.parseFloat(data[4]), data[5], Float.parseFloat(data[6])));
                } else if (data[0].equals("EstudianteIngenieria")) {
                    listaEstudiantes.add(new EstIngenieria(data[1], data[2], data[3], data[4], data[5], Integer.parseInt(data[6]), Float.parseFloat(data[7])));
                } else if (data[0].equals("EstudianteDiseno")) {
                    listaEstudiantes.add(new EstDiseño(data[1], data[2], data[3], data[4], data[5], data[6], Integer.parseInt(data[7])));
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al importar datos: " + e.getMessage());
        }
    }
}
