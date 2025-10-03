public class EmpleadoTemporal extends empleados {

    private int mesescontrato;

    public EmpleadoTemporal(String nombre, int mesescontrato, double salariobase) {
        super(nombre, salariobase);
        this.mesescontrato = mesescontrato;
    }

    public int getMesescontrato() {
        return mesescontrato;
    }

    public void setMesescontrato(int mesescontrato) {
        this.mesescontrato = mesescontrato;
    }
}
