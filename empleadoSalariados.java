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
@Override
    public double calcularSalariobruto() {
        double bonoAntiguedad = 0;
        if (antiguedad > 5) {
            bonoAntiguedad = salariobase * 0.10; // 10% de bono por antiguedad mayor a 5 años
            return salariobase + bonoAntiguedad;
        } else {
            return salariobase;
        }
    }
    @Override
    public double calcularBeneficios() {
        double Alimentacion = 1000000; // bono de alimentacion
        return Alimentacion;
    }

    @Override
    public String mostrarInformacion() {
        return "Empleado Asalariado: " + "\n" + " nombre: " + getNombre() + "\n"
                + " Salario Base: " + salariobase + "\n"
                + " Antiguedad: " + antiguedad + " años" + "\n"
                + " Beneficios: " + calcularBeneficios() + "\n"
                + " salario mensual: " + calcularSalariobruto() + "\n"
                + " deducciones: " + calcularDeducciones();
    }