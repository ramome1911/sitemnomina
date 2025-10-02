public class EmpleadoComision extends empleados { private double ventasMensuales;

    public EmpleadoComision (String nombre, double salariobase, double ventasMensuales) {
        super(nombre, salariobase);
        this.ventasMensuales = ventasMensuales;

    }
    public double getVentasMensuales() {
        return ventasMensuales;
    }
    public void setVentasMensuales(double ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }
    
}
