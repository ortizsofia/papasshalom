package juego;

public class Juego  {

    private EstadoJuego estado;
    private Etapa etapaActual;
    private Nivel nivelActual;

    public Juego() {
        estado = new EstadoJuego();
    }

    public void iniciar() {

        System.out.println("Iniciando juego...");

        etapaActual = new Etapa(1);
        nivelActual = new Nivel(1);

        nivelActual.iniciar();
    }

    public void cambiarNivel() {
        // Pasar al siguiente nivel
    }

    public void cambiarEtapa() {
        // Pasar al siguiente restaurante
    }
}