package juego;

import economia.Economia;

public class EstadoJuego {

    private int dinero;
    private int puntuacion;
    private int etapa;
    private int nivel;

    private Economia economia;

    public EstadoJuego() {
        dinero = 0;
        puntuacion = 0;
        etapa = 1;
        nivel = 1;

        economia = new Economia();
    }

    public int getDinero() {
        return dinero;
    }

    public void agregarDinero(int cantidad) {
        dinero += cantidad;
    }

    public void agregarPuntuacion(int puntos) {
        puntuacion += puntos;
    }
}
