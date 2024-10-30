public class Dispositivo {
    
    private String Serial;
    private String Marca;
    private float Tamaño;
    private float Precio;

    public Dispositivo(String serial, String marca, float tamaño, float precio) {
        Serial = serial;
        Marca = marca;
        Tamaño = tamaño;
        Precio = precio;
    }
    public String getSerial() {
        return Serial;
    }
    public void setSerial(String serial) {
        Serial = serial;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public float getTamaño() {
        return Tamaño;
    }
    public void setTamaño(float tamaño) {
        Tamaño = tamaño;
    }
    public float getPrecio() {
        return Precio;
    }
    public void setPrecio(float precio) {
        Precio = precio;
    }

    public String MostrarMaestroD(){
        String mensaje = "Serial: "+ Serial +"\n"+
                    "Marca: "+ Marca +"\n"+
                    "Tamaño: "+ Tamaño +"\n"+
                    "Precio: "+ Precio +"\n";
        return mensaje;
    }
    
}
