package personajes;


public class Camarera {

    private String nombre;
    private int dinero;
    private int puntuacion;

    public Camarera() {

        nombre = "Camarera";
        dinero = 0;
        puntuacion = 0;
    }

    public void recibirCliente() {

        System.out.println("La camarera recibe al cliente.");
    }

    public void tomarPedido() {

        System.out.println("La camarera toma el pedido.");
    }

    public void servirPedido() {

        System.out.println("La camarera sirve el pedido.");
    }

    public void cobrar() {

        System.out.println("La camarera cobra el pedido.");
    }

    public void limpiarMesa() {

        System.out.println("La camarera limpia la mesa.");
    }

    public void agregarDinero(int cantidad) {

        dinero = dinero + cantidad;
    }

    public void agregarPuntos(int puntos) {

        puntuacion = puntuacion + puntos;
    }

    public int getDinero() {

        return dinero;
    }

    public int getPuntuacion() {

        return puntuacion;
    }
}

