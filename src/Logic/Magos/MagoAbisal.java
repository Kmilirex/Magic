package Logic.Magos;

import Logic.HabilidadMago;
import Logic.Personaje;

public class MagoAbisal extends Personaje implements HabilidadMago {

    @Override
    public void lanzarHechizo() {
        System.out.println("Lanzo un hechizo");
    }
}
