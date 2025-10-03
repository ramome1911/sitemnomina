public abstract class empleados {
    protected String nombre;
    protected double salariobase;

    public empleados(String nombre, double salariobase) {
        this.nombre = nombre;
        this.salariobase = salariobase;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public double salariobase() {
        return salariobase;
    }

    public void setSalario(double salariobase) {
        this.salariobase = salariobase;
    }

    public abstract String mostrarInformacion();

    public abstract double calcularSalariobruto();

    public double calcularBeneficios() {
        return 0; // Por defecto, sin beneficios adicionales
    }

    public double calcularDeducciones() {
        double deduccion = calcularSalariobruto() * (0.004 + 0.005); // deducciones de Arl,salud y pension
        return deduccion;
    }
}