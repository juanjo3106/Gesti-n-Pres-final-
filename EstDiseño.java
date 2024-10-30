public class EstDiseño extends Estudiante {

    private String ModEstudio;
    private int CantAsignaturas;

    public EstDiseño(String cedula, String nombre, String apellido, String telefono, String serial, String modEstudio, int cantAsiganturas){
        super(cedula, nombre, apellido, telefono, serial);
        ModEstudio = modEstudio;
        CantAsignaturas = cantAsiganturas;
    }

    public String getModEstudio() {
        return ModEstudio;
    }
    public void setModEstudio(String modEstudio) {
        ModEstudio = modEstudio;
    }
    public int getCantAsignaturas() {
        return CantAsignaturas;
    }
    public void setCantAsignaturas(int cantAsignaturas) {
        CantAsignaturas = cantAsignaturas;
    }

    public void MostarMaestro(){
        super.MostrarMaestroE();
        System.out.println("ModEstudiante: "+ ModEstudio);
        System.out.println("Catidad Asignaturas: "+ CantAsignaturas);
    }

}
