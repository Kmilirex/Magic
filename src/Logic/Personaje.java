package Logic;

import java.util.List;

public abstract class  Personaje {

    protected String name;
    protected List<Objeto> inventario;
    protected int vida;
    protected int defensa;
    protected int ataque;

    protected void atacar(Personaje enemigo){
        enemigo.recibirAtaque(ataque,name);
    }



    protected void recibirAtaque(int cantidadAtaque, String nombreEnemigo ) {
        if (cantidadAtaque > (vida + defensa)) {
            vida = 0;
            System.out.println(name + " HA MUERTO");
            return;
        }

        if (cantidadAtaque > defensa){
            vida = vida - (cantidadAtaque - defensa);

        } else if(cantidadAtaque <= defensa){
            System.out.println( nombreEnemigo + "No inflige daño");

        }


    }


}
