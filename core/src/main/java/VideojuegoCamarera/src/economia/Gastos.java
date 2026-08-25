package economia;

public class Gastos {

    private double renta;
    private double alimentacion;
    private double calefaccion;

    public Gastos() {

        renta = 0;
        alimentacion = 0;
        calefaccion = 0;
    }

    public void pagarRenta(double cantidad) {
        renta += cantidad;
    }

    public void pagarAlimentacion(double cantidad) {
        alimentacion += cantidad;
    }

    public void pagarCalefaccion(double cantidad) {
        calefaccion += cantidad;
    }
}
