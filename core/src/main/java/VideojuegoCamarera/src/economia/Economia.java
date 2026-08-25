package economia;


public class Economia {

    private double salario;
    private double propinas;
    private double dineroDisponible;

    private double renta;
    private double alimentacion;
    private double calefaccion;

    public Economia() {

        salario = 0;
        propinas = 0;
        dineroDisponible = 0;

        renta = 0;
        alimentacion = 0;
        calefaccion = 0;
    }

    public void agregarSalario(double cantidad) {
        salario += cantidad;
        actualizarDinero();
    }

    public void agregarPropina(double cantidad) {
        propinas += cantidad;
        actualizarDinero();
    }

    private void actualizarDinero() {

        dineroDisponible = salario + propinas
                - renta
                - alimentacion
                - calefaccion;
    }

    public void pagarRenta(double cantidad) {
        renta += cantidad;
        actualizarDinero();
    }

    public void comprarAlimentos(double cantidad) {
        alimentacion += cantidad;
        actualizarDinero();
    }

    public void pagarCalefaccion(double cantidad) {
        calefaccion += cantidad;
        actualizarDinero();
    }

    public double getDineroDisponible() {
        return dineroDisponible;
    }
}
