package restaurante;

import java.util.ArrayList;

public class Restaurante {

    private Mesa[] mesas;

    public Restaurante() {

        mesas = new Mesa[6];

        for (int i = 0; i < mesas.length; i++) {

            mesas[i] = new Mesa(i + 1);
        }
    }

    public Mesa buscarMesaDisponible() {

        for (int i = 0; i < mesas.length; i++) {

            if (mesas[i].estaDisponible()) {

                return mesas[i];
            }
        }

        return null;
    }

    public void mostrarMesas() {

        System.out.println();
        System.out.println("Mesas del restaurante:");

        for (int i = 0; i < mesas.length; i++) {

            if (mesas[i].estaDisponible()) {

                System.out.println(
                    "Mesa " + mesas[i].getNumero() + ": Disponible"
                );

            } else {

                System.out.println(
                    "Mesa " + mesas[i].getNumero() + ": Ocupada"
                );
            }
        }
    }
}
