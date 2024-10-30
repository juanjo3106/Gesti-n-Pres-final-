public class Estudiante {
    
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private String Serial;
    
    public Estudiante(String cedula, String nombre, String apellido, String telefono, String serial) {
        Cedula = cedula;
        Nombre = nombre;
        Apellido = apellido;
        Telefono = telefono;
        Serial = serial;
    }

    public String getCedula() {
        return Cedula;
    }
    public void setCedula(String cedula) {
        Cedula = cedula;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public String getTelefono() {
        return Telefono;
    }
    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
    public String getSerial() {
        return Serial;
    }
    public void setSerial(String serial) {
        Serial = serial;
    }

    public String MostrarMaestroE(){
        String mensaje = "Cedula: "+ Cedula +"\n"+
                    "Nombre: "+ Nombre +"\n"+
                    "Apellido: "+ Apellido +"\n"+
                    "Telefono: "+ Telefono +"\n"+
                    "Serial: "+ Serial + "\n";
        return mensaje;
    }
    
}
