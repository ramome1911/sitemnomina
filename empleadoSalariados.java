public class empleadoSalariados extends empleados {

    private int antiguedad;

    public empleadoSalariados(String nombre, double salariobase, int antiguedad) {
        super(nombre, salariobase);
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
}