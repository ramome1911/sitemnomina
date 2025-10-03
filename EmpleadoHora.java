public class EmpleadoHora extends empleados {

    private int horasTrabajadas;
    private boolean fondoAhorro;
    private int añosAfiliacion;

    public EmpleadoHora(String nombre, int horasTrabajadas, double salariobase, boolean fondoAhorro,
            int añosAfiliacion) {
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

    @Override
    public double calcularBeneficios() {
        double beneficio = 0;
        if (fondoAhorro && añosAfiliacion > 1) {
            beneficio = salariobase * 0.02; // 2% fondo ahorro
        }
        return beneficio;
    }

    @Override
    public double calcularSalariobruto() {
        if (horasTrabajadas > 40) {
            double pagoHorasExtra = (horasTrabajadas - 40) * salariobase * 1.5;
            return (40 * salariobase) + pagoHorasExtra + calcularBeneficios();
        } else {
            return horasTrabajadas * salariobase + calcularBeneficios();
        }
    }

    @Override
    public String mostrarInformacion() {
        return "Empleado por Hora: " + "\n" + " Nombre: " + getnombre() + "\n"
                + " Horas Trabajadas: " + horasTrabajadas + "\n"
                + " Salario por Hora: " + salariobase() + "\n"
                + " Fondo de Ahorro: " + (fondoAhorro ? "Sí" : "No") + "\n"
                + " Años de Afiliación: " + añosAfiliacion + "\n"
                + " Beneficios: " + calcularBeneficios() + "\n"
                + " Deducciones: " + calcularDeducciones() + "\n"
                + " Salario total: " + calcularSalariobruto();
    }

}