package Logic.Magos;

import Logic.Personaje;

public class MagoAbisal extends Personaje{

    @Override
    public void atacarEspecial(Personaje enemigo) {
        System.out.println("Mago abisal realizó un ataque especial.");
    }

    @Override
    public void establecerInventario() {

    }
}
