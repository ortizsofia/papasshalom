package juego;

public class Etapa {

    private int numero;
    private String nombreRestaurante;

    public Etapa(int numero) {

        this.numero = numero;

        switch (numero) {

            case 1:
                nombreRestaurante = "Restaurante 1";
                break;

            case 2:
                nombreRestaurante = "Restaurante 2";
                break;

            case 3:
                nombreRestaurante = "Restaurante 3";
                break;
        }
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }
}