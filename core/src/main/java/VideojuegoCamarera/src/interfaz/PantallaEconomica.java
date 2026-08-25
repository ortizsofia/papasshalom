package interfaz;

import economia.Economia;

public class PantallaEconomica {

    private Economia economia;

    public PantallaEconomica(Economia economia) {
        this.economia = economia;
    }

    public void mostrar() {

        System.out.println("===== ADMINISTRACIÓN =====");

        System.out.println(
            "Dinero disponible: "
            + economia.getDineroDisponible()
        );

        System.out.println("1. Pagar renta");
        System.out.println("2. Comprar alimentos");
        System.out.println("3. Pagar calefacción");
    }
}
