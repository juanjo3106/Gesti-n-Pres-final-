import javax.swing.JOptionPane;
import java.util.LinkedList;

public class MetodosInge {
    public LinkedList<Estudiante> LLenarListaE(LinkedList<Estudiante> lista) {

        boolean bandera = true;
        boolean flag = true;
        boolean condition = true;

        String cedula = "";
        String nombre = "";
        String apellido = "";
        String telefono = "";
        String serial = "";
        int numSemestreActual = 0;
        float promedioAcum = 0;

        while (bandera) {
            JOptionPane.showMessageDialog(null, "\tDatos del estudiante\t");

            while (flag) {
                cedula = JOptionPane.showInputDialog("Ingrese la cedula del estudiante:");
                if (cedula != null && !cedula.isEmpty() && cedula.matches("\\d+")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: La cédula debe contener solo números.");
                }
            }

            for (Estudiante est : lista) {
                EstIngenieria e2 = (EstIngenieria) est;

                if (e2.getCedula().equalsIgnoreCase(cedula)) {
                    JOptionPane.showMessageDialog(null, "Ya existe un un estudiante con esa cedula.");
                    condition = false;
                }

            }

            if (condition == false) {
                break;
            }

            while (flag) {
                nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
                if (nombre != null && !nombre.isEmpty() && nombre.matches("[a-zA-Z ]+")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese un nombre válido (solo letras y espacios).");
                }
            }

            while (flag) {
                apellido = JOptionPane.showInputDialog("Ingrese el apellido del estudiante:");
                if (apellido != null && !apellido.isEmpty() && apellido.matches("[a-zA-Z ]+")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese un apellido válido (solo letras y espacios).");
                }
            }

            while (flag) {
                telefono = JOptionPane.showInputDialog("Ingrese el telefono del estudiante:");
                if (telefono != null && !telefono.isEmpty() && telefono.matches("\\d+")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: El teléfono debe contener solo números.");
                }
            }

            while (flag) {
                serial = JOptionPane.showInputDialog("Ingrese el serial del dispositivo de prestamo: ");
                if (serial != null && !serial.isEmpty() && serial.matches("\\d+")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: El serial debe contener solo números.");
                }
            }

            for (Estudiante est : lista) {
                EstIngenieria e2 = (EstIngenieria) est;

                if (e2.getSerial().equalsIgnoreCase(serial)) {
                    JOptionPane.showMessageDialog(null, "Ya existe un un estudiante usando este dispositivo.");
                    condition = false;
                }

            }

            if (condition == false) {
                break;
            }

            while (flag) {
                try {
                    numSemestreActual = Integer
                            .parseInt(JOptionPane.showInputDialog("Ingrese el semestre que cursa actualmente:"));
                    if (numSemestreActual > 0) {
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: El semestre debe ser un número positivo.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido para el semestre.");
                }
            }

            while (flag) {
                try {
                    promedioAcum = Float
                            .parseFloat(JOptionPane.showInputDialog("Ingrese el promedio acumulado del semestre:"));
                    if (promedioAcum >= 0 && promedioAcum <= 5) {
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: El promedio debe estar entre 0 y 5.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido para el promedio.");
                }
            }

            EstIngenieria estI = new EstIngenieria(cedula, nombre, apellido, telefono, serial, numSemestreActual,
                    promedioAcum);
            lista.add(estI);

            bandera = false;
        }

        return lista;
    }

    public LinkedList<Dispositivo> LLenarListaD(LinkedList<Dispositivo> lista) {

        boolean bandera = true;
        boolean flag = true;
        boolean condition = true;

        String serial = "";
        String marca = "";
        float tamaño = 0;
        float precio = 0;

        while (bandera) {

            JOptionPane.showMessageDialog(null, "\tDatos del Dispositivo\t");

            while (flag) {
                serial = JOptionPane.showInputDialog("Ingrese el serial del dispositivo: ");
                if (serial != null && !serial.isEmpty() && serial.matches("\\d+")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: El serial debe contener solo números.");
                }
            }

            for (Dispositivo disp : lista) {
                Laptop lap = (Laptop) disp;

                if (lap.getSerial().equalsIgnoreCase(serial)) {
                    JOptionPane.showMessageDialog(null, "Ya existe un dispositivo con ese serial.");
                    condition = false;
                }
            }

            if (condition == false) {
                break;
            }

            while (flag) {
                marca = JOptionPane.showInputDialog("Ingrese la marca del dispositivo:");
                if (marca != null && !marca.isEmpty() && marca.matches("[a-zA-Z ]+")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese una marca válida (solo letras y espacios).\"");
                }
            }

            while (flag) {
                try {
                    tamaño = Float
                            .parseFloat(JOptionPane.showInputDialog("Ingrese tamaño del dipositivo (En pulagadas): "));
                    if (tamaño >= 0 && tamaño <= 60) {
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: El tamaño debe estar entre 0 y 60 (pulgadas).");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido para el tamaño.");
                }
            }

            while (flag) {
                try {
                    precio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del dispositivo: "));
                    if (precio >= 0 && precio <= 10000000) {
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: El precio debe estar entre 0 y 10'000.000 (cop).");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido para el precio.");
                }
            }

            String sistemaOperativo = "";
            int opt = 0;
            boolean r = true;
            do {
                String mensaje = "Escoja el sistema operativo: \n" +
                        "1. Windows 7 \n" +
                        "2. Windows 10 \n" +
                        "3. Widows 11 \n";
                opt = (Integer.parseInt(JOptionPane.showInputDialog(mensaje)));

                if (opt == 1 || opt == 2 || opt == 3) {
                    while (opt == 1 || opt == 2 || opt == 3) {
                        if (opt == 1) {
                            sistemaOperativo = "Windos 7";
                            opt = 0;
                        } else if (opt == 2) {
                            sistemaOperativo = "Windows 10";
                            opt = 0;
                        } else {
                            sistemaOperativo = "Windows 11";
                            opt = 0;
                        }
                    }
                    r = false;
                } else {
                    r = true;
                }
            } while (r);

            String procesador = "";
            int opt1 = 0;
            boolean s = true;
            do {
                String mensaje1 = "Escoja el procesador: \n" +
                        "1. AMD Ryzen \n" +
                        "2. Intel® Core™ i5\n";
                opt1 = (Integer.parseInt(JOptionPane.showInputDialog(mensaje1)));

                if (opt1 == 1 || opt1 == 2) {
                    while (opt1 == 1 || opt1 == 2) {
                        if (opt1 == 1) {
                            procesador = "AMD Ryzen";
                            opt1 = 0;
                        } else {
                            procesador = "Intel® Core™ i5";
                            opt1 = 0;
                        }
                    }
                    s = false;
                } else {
                    s = true;
                }
            } while (s);

            Laptop lap = new Laptop(serial, marca, tamaño, precio, sistemaOperativo, procesador);
            lista.add(lap);

            bandera = false;
        }

        return lista;
    }

    public void Mostrarlistas(LinkedList<Estudiante> lista, LinkedList<Dispositivo> lista2) {
        JOptionPane.showMessageDialog(null, "\t Prestamos Ingenieria \t");
        String mensaje1 = "";
        for (Estudiante est : lista) {
            mensaje1 = mensaje1 + est.MostrarMaestroE();
            EstIngenieria e2 = (EstIngenieria) est;
            mensaje1 = mensaje1 + "Semestre actual: " + e2.getNumSemestreActual() + "\n";
            mensaje1 = mensaje1 + "Promedio acomulado: " + e2.getPromedioAcum() + "\n";
            mensaje1 = mensaje1 + "\n";
        }
        for (Dispositivo disp : lista2) {
            mensaje1 = mensaje1 + disp.MostrarMaestroD();
            Laptop lap = (Laptop) disp;
            mensaje1 = mensaje1 + "Sistema operativo: " + lap.getSistemaOperativo() + "\n";
            mensaje1 = mensaje1 + "Procesador: " + lap.getProcesador() + "\n";
            mensaje1 = mensaje1 + "\n";
        }
        JOptionPane.showMessageDialog(null, mensaje1, "resultados", 1);

    }

    public String Buscar(LinkedList<Estudiante> lista, LinkedList<Dispositivo> lista2, String serialBuscar) {
        String mensaje = "";

        if (lista2.isEmpty()) {
            mensaje = "No se ha encontrado un dispositivo con ese ese serial, intente de nuevo";
            JOptionPane.showMessageDialog(null, mensaje);
        } else if (!lista2.isEmpty() && lista.isEmpty()) {
            for (Dispositivo disp : lista2) {
                Laptop lap = (Laptop) disp;
                if (lap.getSerial().equalsIgnoreCase(serialBuscar)) {
                    mensaje = "\t El equipo que se busco es \t\n" +
                            disp.MostrarMaestroD() +
                            "Sistema operativo: " + lap.getSistemaOperativo() + "\n" +
                            "Procesador: " + lap.getProcesador() + "\n" +
                            "Y NO CORRESPONDE A NINGUN ESTUDINATE, (ESTÁ DISPONIBLE)";
                    JOptionPane.showMessageDialog(null, mensaje);
                } else {
                    JOptionPane.showMessageDialog(null, "Error: No se ha encontrado un dispositivo con ese serial");
                }

            }
        } else {
            for (Dispositivo disp : lista2) {
                Laptop lap = (Laptop) disp;
                for (Estudiante est : lista) {
                    EstIngenieria e2 = (EstIngenieria) est;

                    if (lap.getSerial().equalsIgnoreCase(serialBuscar)
                            && e2.getSerial().equalsIgnoreCase(serialBuscar)) {

                        mensaje = "\t El equipo que se busco es: \t\n" +
                                disp.MostrarMaestroD() +
                                "Sistema operativo: " + lap.getSistemaOperativo() + "\n" +
                                "Procesador: " + lap.getProcesador() + "\n" +
                                "\n\t Corresponde al estudiante \t\n" +
                                est.MostrarMaestroE() +
                                "Semestre actual: " + e2.getNumSemestreActual() + "\n" +
                                "Promedio acomulado: " + e2.getPromedioAcum() + "\n";

                        JOptionPane.showMessageDialog(null, mensaje);
                    } else {
                        JOptionPane.showMessageDialog(null,"Error: No se ha encontrado ni estudiante, ni dispositivo con ese serial. Intente de nuevo");
                    }
                }
            }
        }

        return mensaje;

    }

    public LinkedList<Estudiante> Modificar(String buscarSerial, LinkedList<Dispositivo> lista,
            LinkedList<Estudiante> lista2) {

        boolean flag = true;

        String cedula = "";
        String nombre = "";
        String apellido = "";
        String telefono = "";
        int numSemestreActual = 0;
        float promedioAcum = 0;

        if (lista.isEmpty() && lista2.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Error: No se ha encontrado ni estudiante, ni dispositivo con ese serial. Intente de nuevo");
        } else if (lista2.isEmpty() && !lista.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Error: No se puede modificar el prestamo ya que no hay ningun estudiante vinculado al dispositivo");
        } else {
            for (Estudiante est : lista2) {
                EstIngenieria e2 = (EstIngenieria) est;
                for (Dispositivo disp : lista) {
                    Laptop lap = (Laptop) disp;

                    if (lap.getSerial().equalsIgnoreCase(buscarSerial)
                            && e2.getSerial().equalsIgnoreCase(buscarSerial)) {

                        JOptionPane.showMessageDialog(null, "Se modificará el estudinate que está usando el equipo");

                        while (flag) {
                            cedula = JOptionPane.showInputDialog("Ingrese la cedula del estudiante:");
                            if (cedula != null && !cedula.isEmpty() && cedula.matches("\\d+")) {
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null, "Error: La cédula debe contener solo números.");
                            }
                        }
                        e2.setCedula(cedula);
                        while (flag) {
                            nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
                            if (nombre != null && !nombre.isEmpty() && nombre.matches("[a-zA-Z ]+")) {
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null,
                                        "Error: Ingrese un nombre válido (solo letras y espacios).");
                            }
                        }
                        e2.setNombre(nombre);
                        while (flag) {
                            apellido = JOptionPane.showInputDialog("Ingrese el apellido del estudiante:");
                            if (apellido != null && !apellido.isEmpty() && apellido.matches("[a-zA-Z ]+")) {
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null,
                                        "Error: Ingrese un apellido válido (solo letras y espacios).");
                            }
                        }
                        e2.setApellido(apellido);
                        while (flag) {
                            telefono = JOptionPane.showInputDialog("Ingrese el telefono del estudiante:");
                            if (telefono != null && !telefono.isEmpty() && telefono.matches("\\d+")) {
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null, "Error: El teléfono debe contener solo números.");
                            }
                        }
                        e2.setTelefono(telefono);

                        JOptionPane.showMessageDialog(null,
                                "El serial es el mismo, ya que se esta modificando el usuario que hace uso del dispositivo");
                        e2.setSerial(buscarSerial);

                        while (flag) {
                            try {
                                numSemestreActual = Integer.parseInt(
                                        JOptionPane.showInputDialog("Ingrese el semestre que cursa actualmente:"));
                                if (numSemestreActual > 0) {
                                    break;
                                } else {
                                    JOptionPane.showMessageDialog(null,
                                            "Error: El semestre debe ser un número positivo.");
                                }
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null,
                                        "Error: Ingrese un número válido para el semestre.");
                            }
                        }
                        e2.setNumSemestreActual(numSemestreActual);
                        while (flag) {
                            try {
                                promedioAcum = Float.parseFloat(
                                        JOptionPane.showInputDialog("Ingrese el promedio acumulado del semestre:"));
                                if (promedioAcum >= 0 && promedioAcum <= 5) {
                                    break;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Error: El promedio debe estar entre 0 y 5.");
                                }
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null,
                                        "Error: Ingrese un número válido para el promedio.");
                            }
                        }
                        e2.setPromedioAcum(promedioAcum);
                    }else{
                        JOptionPane.showMessageDialog(null,"Error: No se ha encontrado ni estudiante, ni dispositivo con ese serial. Intente de nuevo");
                    }
                }
            }
        }

        return lista2;
    }

    public LinkedList<Estudiante> Eliminar(String buscarSerial, LinkedList<Estudiante> lista2) {
        boolean flag = true;

        if(lista2.isEmpty()){
            JOptionPane.showMessageDialog(null,"Error: No se ha encontrado ni estudiante vinculado con algun dispositivo con ese serial. Intente de nuevo");
        }else{
            while (flag) {
                buscarSerial = JOptionPane.showInputDialog("Ingrese el serial del dispositico, para la devolucion del equipo: ");
                if (buscarSerial != null && !buscarSerial.isEmpty() && buscarSerial.matches("\\d+")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: El serial solo debe contener solo números.");
                }
            }
    
            for (Estudiante est : lista2) {
                EstIngenieria e2 = (EstIngenieria) est;
    
                if (e2.getSerial().equalsIgnoreCase(buscarSerial)) {
                    lista2.remove(e2);
                    JOptionPane.showMessageDialog(null,"Se ha devuelto el equipo correctamente, por ende el estudiante ya no esta vinculado con el dispositivo. Muchas Gracias");
                } else {
                    JOptionPane.showMessageDialog(null,"No se ha encontrado un dispositivo con ese serial, intente de nuevo.");
                }
    
            }
        }
        
        return lista2;
    }
}
