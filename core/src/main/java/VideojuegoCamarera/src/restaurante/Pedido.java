package restaurante;

import java.util.ArrayList;

public class Pedido {

    private String comida;
    private String bebida;
    private double precio;
    private boolean preparado;
    private boolean servido;

    public Pedido(String comida, String bebida, double precio) {

        this.comida = comida;
        this.bebida = bebida;
        this.precio = precio;

        preparado = false;
        servido = false;
    }

    public void preparar() {

        preparado = true;

        System.out.println("El pedido está preparado.");
    }

    public void servir() {

        if (preparado == true) {

            servido = true;

            System.out.println("El pedido fue servido.");

        } else {

            System.out.println("El pedido todavía no está preparado.");
        }
    }

    public double getPrecio() {

        return precio;
    }

    public boolean estaPreparado() {

        return preparado;
    }

    public boolean estaServido() {

        return servido;
    }

    public String getComida() {

        return comida;
    }

    public String getBebida() {

        return bebida;
    }
}