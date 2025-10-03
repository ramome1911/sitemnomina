public class EmpleadoComision extends empleados {
    private double ventasMensuales;

    public EmpleadoComision(String nombre, double salariobase, double ventasMensuales) {
        super(nombre, salariobase);
        this.ventasMensuales = ventasMensuales;

    }

    public double getVentasMensuales() {
        return ventasMensuales;
    }

    public void setVentasMensuales(double ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }

    @Override
    public double calcularBeneficios() {
        double Alimentacion = 1000000; // bono de alimentacion
        return Alimentacion;
    }

    @Override
    public double calcularSalariobruto() {
        if (ventasMensuales > 20000000) {
            double comision = ventasMensuales * 0.03;
            return salariobase + comision;
        } else {
            return salariobase;
        }

    }

    @Override
    public String mostrarInformacion() {
        return "Empleado por Comisión: " + "\n" + " nombre: " + getnombre() + "\n"
                + " Salario Base: " + salariobase() + "\n"
                + " Ventas Mensuales: " + ventasMensuales + "\n"
                + " Beneficios: " + calcularBeneficios() + "\n"
                + " salario mensual: " + calcularSalariobruto() + "\n"
                + " deducciones: " + calcularDeducciones();
    }
}
