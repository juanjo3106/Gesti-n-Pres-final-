public class Tablet extends Dispositivo {
    
    private String Almacenamiento;
    private float Peso;
   
    public Tablet(String serial, String marca, float tamaño, float precio, String almacenamiento, float peso) {
        super(serial, marca, tamaño, precio);
        Almacenamiento = almacenamiento;
        Peso = peso;
    }
    public String getAlmacenamiento() {
        return Almacenamiento;
    }
    public void setAlmacenamiento(String almacenamiento) {
        Almacenamiento = almacenamiento;
    }
    public float getPeso() {
        return Peso;
    }
    public void setPeso(float peso) {
        Peso = peso;
    }

    public void MostrarMaestro(){
        super.MostrarMaestroD();
        System.out.println("Almacenamiento: "+ Almacenamiento);
        System.out.println("Peso: "+ Peso);
    }
}