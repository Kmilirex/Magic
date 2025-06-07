package Logic;

import Logic.Objetos.Inventario;


public abstract class  Personaje {

    protected String name;
    protected Inventario inventario;
    protected int vida;
    protected int defensa;
    protected int ataque;

    public void atacar(Personaje enemigo){
        enemigo.recibirAtaque(ataque,name);
    }

    public abstract void atacarEspecial(Personaje enemigo);
    public abstract void establecerInventario();


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
