public class Laptop extends Dispositivo{
    
    private String SistemaOperativo;
    private String Procesador;  

    public Laptop(String serial, String marca, float tamaño, float precio, String sistemaOperativo, String procesador) {
        super(serial, marca, tamaño, precio);
        SistemaOperativo = sistemaOperativo;
        Procesador = procesador;
    }
    public String getSistemaOperativo() {
        return SistemaOperativo;
    }
    public void setSistemaOperativo(String sistemaOperativo) {
        SistemaOperativo = sistemaOperativo;
    }
    public String getProcesador() {
        return Procesador;
    }
    public void setProcesador(String procesador) {
        Procesador = procesador;
    }

    public void MostrarMaestro(){
        super.MostrarMaestroD();
        System.out.println("Sistema Operativo: "+ SistemaOperativo);
        System.out.println("Procesador: "+ Procesador);
    }
}