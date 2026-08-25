package juego;



import restaurante.Restaurante;

public class Nivel {

    private int numero;
    private int tiempo;
    private int clientesObjetivo;

    private Restaurante restaurante;

    public Nivel(int numero) {

        this.numero = numero;

        configurarNivel();
    }

    private void configurarNivel() {

        switch (numero) {

            case 1:
                tiempo = 600;
                clientesObjetivo = 6;
                break;

            case 2:
                tiempo = 500;
                clientesObjetivo = 10;
                break;

            case 3:
                tiempo = 400;
                clientesObjetivo = 15;
                break;

            case 4:
                tiempo = 300;
                clientesObjetivo = 20;
                break;
        }
    }

    public void iniciar() {

        restaurante = new Restaurante();

        System.out.println("Nivel " + numero);
        System.out.println("Clientes objetivo: " + clientesObjetivo);
    }
}