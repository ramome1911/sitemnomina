public class EmpleadoHora extends empleados{

    private int horasTrabajadas;
    private boolean fondoAhorro;
    private int añosAfiliacion;

    public EmpleadoHora(String nombre, int horasTrabajadas, double salariobase, boolean fondoAhorro, int añosAfiliacion) {
        super(nombre, salariobase);
        this.horasTrabajadas = horasTrabajadas;
        this.fondoAhorro = fondoAhorro;
        this.añosAfiliacion = añosAfiliacion;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getAñosAfiliacion() {
        return añosAfiliacion;
    }

    public void setAñosAfiliacion(int añosAfiliacion) {
        this.añosAfiliacion = añosAfiliacion;
    }

    public boolean isFondoAhorro() {
        return fondoAhorro;
    }

    public void setFondoAhorro(boolean fondoAhorro) {
        this.fondoAhorro = fondoAhorro;
    }

}