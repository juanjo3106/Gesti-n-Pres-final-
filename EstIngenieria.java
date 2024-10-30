public class EstIngenieria extends Estudiante {
    
    private int NumSemestreActual;
    private float PromedioAcum;

    public EstIngenieria(String cedula, String nombre, String apellido, String telefono, String serial, int numSemestreActual, float promAcum){
        super(cedula, nombre, apellido, telefono, serial);
        NumSemestreActual = numSemestreActual;
        PromedioAcum = promAcum;
    }

    public int getNumSemestreActual() {
        return NumSemestreActual;
    }
    public void setNumSemestreActual(int numSemestreActual) {
        NumSemestreActual = numSemestreActual;
    }
    public float getPromedioAcum() {
        return PromedioAcum;
    }
    public void setPromedioAcum(float promedioAcum) {
        PromedioAcum = promedioAcum;
    }

    public void MostrarMaestro(){
        super.MostrarMaestroE();
        System.out.println("Semestre actual: "+ NumSemestreActual);
        System.out.println("Promedio acomulado: "+ PromedioAcum);
    }
}
