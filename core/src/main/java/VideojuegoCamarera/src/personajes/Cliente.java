package personajes;

import restaurante.Pedido;

public class Cliente {

    private String nombre;
    private int paciencia;
    private boolean atendido;

    public Cliente(String nombre) {

        this.nombre = nombre;
        paciencia = 100;
        atendido = false;
    }

    public void reducirPaciencia(int cantidad) {

        paciencia = paciencia - cantidad;

        if (paciencia < 0) {
            paciencia = 0;
        }
    }

    public boolean sigueEsperando() {

        if (paciencia > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void atender() {

        atendido = true;
    }

    public String getNombre() {

        return nombre;
    }

    public int getPaciencia() {

        return paciencia;
    }

    public boolean estaAtendido() {

        return atendido;
    }
}
