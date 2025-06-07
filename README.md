*MAGIC VS BLOOD*

Es un juego de estrategia para dos jugadores hecho en java.
En el que consiste en acomodar y usar inteligentemente ciertas condiciones (Estados) aleatorias a favor para sobre ponerse ante el rival y ganar el duelo.
El juego cuenta con dos clases principales mago y guerrero y 3 sub clases por cada clase principal, para añadir variedad y distintas estrategias.

*MECANICAS*

#Estados: Son condiciones que modifican la partida (Mas/menos daño, defensa, otros efectos...)  es decir que los efectos son para ambos jugadores.

- Cada 3 turnos se mostraran tres estados aleatorios distintos para cada jugador.
- El jugador tendra la opcion opcion de escoger un estado u omitirlo a cambio de un pequeño beneficio aleatorio.

#Comodines: Es un objeto con la capacidad de modificar los estados.

- Codicia: El siguiente estado que tomes se juega dos veces.
- Egoismo: El siguiente estado que tomes es solo para ti.
- Envidia: Borra un estado (Tuyo/combate/rival).
  
#Inventario: El inventario es la capacidad de almacenamiento que tiene cada jugador para llevar objetos.

- El inventario para ambos jugadores esta prederminado en 3 slot, y en cada slot se puedo alamcenar un solo comodin.
- Cada 5 turnos el inventario llena los slot vacios con comodines aleatorios.
- El juegor 2, inicia con un comodin extra en el inventario pero sigue teniendo 3 slot.
- Se pueden borrar comodines del inventario.
