import javax.swing.JOptionPane;
import java.util.LinkedList;

public class MetodosDise {

    public LinkedList<Estudiante> LLenarListaE(LinkedList<Estudiante> lista) {

        boolean bandera = true;
        boolean flag = true;
        boolean condition = true;

        String cedula = "";
        String nombre = "";
        String apellido = "";
        String telefono = "";
        String serial = "";
        String ModEstudio = "";
        int CantAsignaturas = 0;

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
                EstDiseño e = (EstDiseño) est;

                if (e.getCedula().equalsIgnoreCase(cedula)) {
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
                EstDiseño e = (EstDiseño) est;

                if (e.getSerial().equalsIgnoreCase(serial)) {
                    JOptionPane.showMessageDialog(null, "Ya existe un un estudiante usando este dispositivo.");
                    condition = false;
                }

            }

            if (condition == false) {
                break;
            }

            while (true) {
                try {
                    ModEstudio = JOptionPane.showInputDialog("Ingrese el modo de estudio (Virtual/Presencial):");
                    if (ModEstudio == null) {
                        return lista;
                    } else if (!ModEstudio.equalsIgnoreCase("virtual") && !ModEstudio.equalsIgnoreCase("presencial")) {
                        throw new IllegalArgumentException("Modalidad no válida. Debe ser 'virtual' o 'presencial'.");
                    }
                    break;
                } catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }

            while (flag) {
                try {
                    CantAsignaturas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de asiganaturas que este cursando:"));
                    if (CantAsignaturas >= 0 && CantAsignaturas <= 10) {
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null,"Error: Las cantidades de aignaturas debe estar entre 0 y 10");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,"Error: Ingrese un número válido para la cantidad de asignaturas.");
                }
            }

            EstDiseño estD = new EstDiseño(cedula, nombre, apellido, telefono, serial, ModEstudio, CantAsignaturas);
            lista.add(estD);

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
        float peso = 0;

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
                Tablet lap = (Tablet) disp;

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

            String almacenamiento = "";
            boolean r = true;
            int opt = 0;

            do {
                String mensaje = "Escoja el almacenamiento: \n" +
                        "1. 256 GB \n" +
                        "2. 512 GB \n" +
                        "3. 1 TB \n";
                opt = (Integer.parseInt(JOptionPane.showInputDialog(mensaje)));
                if (opt == 1 || opt == 2 || opt == 3) {
                    while (opt == 1 || opt == 2 || opt == 3) {
                        if (opt == 1) {
                            almacenamiento = "256 GB";
                            opt = 0;
                        } else if (opt == 2) {
                            almacenamiento = "512 GB";
                            opt = 0;
                        } else {
                            almacenamiento = "1 TB";
                            opt = 0;
                        }
                    }
                    r = false;
                } else {
                    r = true;
                }

            } while (r);

            while (flag) {
                try {
                    peso = Float.parseFloat(JOptionPane.showInputDialog("Ingrese peso del dipositivo (En Kg): "));
                    if (peso >= 0 && peso <= 20) {
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: El peso debe estar entre 0 y 20 (kg).");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido para el peso.");
                }
            }

            Tablet tab = new Tablet(serial, marca, tamaño, precio, almacenamiento, peso);
            lista.add(tab);

            bandera = false;
        }
        return lista;
    }

    public void Mostrarlistas(LinkedList<Estudiante> lista, LinkedList<Dispositivo> lista2) {
        JOptionPane.showMessageDialog(null, "\t Prestamos Diseño \t");
        String mensaje1 = "";
        for (Estudiante est : lista) {
            mensaje1 = mensaje1 + est.MostrarMaestroE();
            EstDiseño e = (EstDiseño) est;
            mensaje1 = mensaje1 + "Modo de estudio: " + e.getModEstudio() + "\n";
            mensaje1 = mensaje1 + "Cantidad Asignaturas: " + e.getCantAsignaturas() + "\n";
            mensaje1 = mensaje1 + "\n";
        }
        for (Dispositivo disp : lista2) {
            mensaje1 = mensaje1 + disp.MostrarMaestroD();
            Tablet Tab = (Tablet) disp;
            mensaje1 = mensaje1 + "Almacenamiento: " + Tab.getAlmacenamiento() + "\n";
            mensaje1 = mensaje1 + "Peso: " + Tab.getPeso() + "\n";
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
                Tablet tab = (Tablet) disp;
                if (tab.getSerial().equalsIgnoreCase(serialBuscar)) {
                    mensaje = "\t El equipo que se busco es \t\n" +
                            disp.MostrarMaestroD() +
                            "Alamacenamiento: " + tab.getAlmacenamiento() + "\n" +
                            "Peso: " + tab.getPeso() + "\n" +
                            "Y NO CORRESPONDE A NINGUN ESTUDINATE, (ESTÁ DISPONIBLE)";
                    JOptionPane.showMessageDialog(null, mensaje);
                }else{
                    JOptionPane.showMessageDialog(null,"Error: No se ha encontrado un dispositivo con ese serial");
                }

            }
        } else {
            for (Dispositivo disp : lista2) {
                Tablet tab = (Tablet) disp;
                for (Estudiante est : lista) {
                    EstDiseño e = (EstDiseño) est;

                    if (tab.getSerial().equalsIgnoreCase(serialBuscar) && e.getSerial().equalsIgnoreCase(serialBuscar)) {

                        mensaje = "\t El equipo que se busco es \t\n" +
                                disp.MostrarMaestroD() +
                                "Almacenamiento: " + tab.getAlmacenamiento() + "\n" +
                                "Peso: " + tab.getPeso() + "\n" +
                                "\n\t Corresponde al estudiante \t\n" +
                                est.MostrarMaestroE() +
                                "Modo de estudio: " + e.getModEstudio() + "\n" +
                                "Cantidad de asignaturas: " + e.getCantAsignaturas() + "\n";

                        JOptionPane.showMessageDialog(null, mensaje);
                    }else{
                        JOptionPane.showMessageDialog(null,"Error: No se ha encontrado ni estudiante, ni dispositivo con ese serial. Intente de nuevo");
                    }
                }
            }
        }

        return mensaje;
    }

    public LinkedList<Estudiante> Modificar(String buscarSerial, LinkedList<Dispositivo> lista, LinkedList<Estudiante> lista2) {

        boolean flag = true;

        String cedula = "";
        String nombre = "";
        String apellido = "";
        String telefono = "";
        String ModEstudio = "";
        int CantAsignaturas = 0;

        if (lista.isEmpty() && lista2.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Error: No se ha encontrado ni estudiante, ni dispositivo con ese serial. Intente de nuevo");
        } else if (lista2.isEmpty() && !lista.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Error: No se puede modificar el prestamo ya que no hay ningun estudiante vinculado al dispositivo");
        } else {
            for (Estudiante est : lista2) {
                EstDiseño e1 = (EstDiseño) est;
                for (Dispositivo disp : lista) {
                    Tablet tab = (Tablet) disp;

                    if (tab.getSerial().equalsIgnoreCase(buscarSerial) && e1.getSerial().equalsIgnoreCase(buscarSerial)) {

                        JOptionPane.showMessageDialog(null, "Se modificará el estudiante que está usando el Dispositivo");

                        while (flag) {
                            cedula = JOptionPane.showInputDialog("Ingrese la cedula del estudiante:");
                            if (cedula != null && !cedula.isEmpty() && cedula.matches("\\d+")) {
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null, "Error: La cédula debe contener solo números.");
                            }
                        }
                        e1.setCedula(cedula);
                        while (flag) {
                            nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
                            if (nombre != null && !nombre.isEmpty() && nombre.matches("[a-zA-Z ]+")) {
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null,"Error: Ingrese un nombre válido (solo letras y espacios).");
                            }
                        }
                        e1.setNombre(nombre);
                        while (flag) {
                            apellido = JOptionPane.showInputDialog("Ingrese el apellido del estudiante:");
                            if (apellido != null && !apellido.isEmpty() && apellido.matches("[a-zA-Z ]+")) {
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null,"Error: Ingrese un apellido válido (solo letras y espacios).");
                            }
                        }
                        e1.setApellido(apellido);
                        while (flag) {
                            telefono = JOptionPane.showInputDialog("Ingrese el telefono del estudiante:");
                            if (telefono != null && !telefono.isEmpty() && telefono.matches("\\d+")) {
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null, "Error: El teléfono debe contener solo números.");
                            }
                        }
                        e1.setTelefono(telefono);

                        JOptionPane.showMessageDialog(null,"El serial es el mismo, ya que se esta modificando el usuario que hace uso del dispositivo");
                        e1.setSerial(buscarSerial);

                        while (true) {
                            try {
                                ModEstudio = JOptionPane.showInputDialog("Ingrese el modo de estudio (Virtual/Presencial):");
                                if (ModEstudio == null) {
                                    return lista2;
                                } else if (!ModEstudio.equalsIgnoreCase("virtual")
                                        && !ModEstudio.equalsIgnoreCase("presencial")) {
                                    throw new IllegalArgumentException("Modalidad no válida. Debe ser 'virtual' o 'presencial'.");
                                }
                                break;
                            } catch (IllegalArgumentException e) {
                                JOptionPane.showMessageDialog(null, e.getMessage());
                            }
                        }
                        e1.setModEstudio(ModEstudio);

                        while (flag) {
                            try {
                                CantAsignaturas = Integer.parseInt(
                                        JOptionPane.showInputDialog("Ingrese la cantidad de asiganaturas que este cursando:"));
                                if (CantAsignaturas >= 0 && CantAsignaturas <= 10) {
                                    break;
                                } else {
                                    JOptionPane.showMessageDialog(null,"Error: Las cantidades de aignaturas debe estar entre 0 y 10");
                                }
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null,"Error: Ingrese un número válido para la cantidad de asignaturas.");
                            }
                        }
                        e1.setCantAsignaturas(CantAsignaturas);
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
                EstDiseño e1 = (EstDiseño) est;
    
                if (e1.getSerial().equalsIgnoreCase(buscarSerial)) {
                    lista2.remove(e1);
                    JOptionPane.showMessageDialog(null,"se ha devuelto el equipo correctamente, por ende el estudiante ya no esta vinculado con el dispositivo. Muchas Gracias");
                } else {
                    JOptionPane.showMessageDialog(null,"No se ha encontrado un dispositivo con ese serial, intente de nuevo.");
                }
    
            }
        }
        return lista2;
    }

}
