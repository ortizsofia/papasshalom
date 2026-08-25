package restaurante;

import personajes.Cliente;

public class Mesa {

    private int numero;
    private boolean ocupada;
    private Cliente cliente;

    public Mesa(int numero) {

        this.numero = numero;
        ocupada = false;
        cliente = null;
    }

    public boolean estaDisponible() {

        if (ocupada == false) {
            return true;
        } else {
            return false;
        }
    }

    public void asignarCliente(Cliente cliente) {

        this.cliente = cliente;
        ocupada = true;
    }

    public void liberarMesa() {

        cliente = null;
        ocupada = false;
    }

    public int getNumero() {

        return numero;
    }

    public Cliente getCliente() {

        return cliente;
    }
}
