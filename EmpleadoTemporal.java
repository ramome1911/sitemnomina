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
    @Override
    public double calcularSalariobruto() {
        return mesescontrato * salariobase();
    } 
    @Override
    public String mostrarInformacion() {
        return "Empleado Temporal: " + "\n"
            + "nombre: " + getnombre() + "\n"
            + ", Contrato: " + mesescontrato + "\n"
            + ", Salario mensual: " + salariobase + "\n"
            + ", Salario bruto: " + calcularSalariobruto() + "\n"
            + ", Deducciones: " + calcularDeducciones() + "\n";
    }
}
