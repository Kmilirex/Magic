package Logic.Objetos;

import java.util.LinkedList;
import java.util.List;

public class Inventario {
    private List<Objeto> baul;
    private int capacidad;

    public Inventario() {
        this.baul = new LinkedList<Objeto>();
    }

    public Objeto eliminarObjetoPorNombre(String nombreObjeto) {
        if (!estaVacia()) {
            for (Objeto objeto: baul) {
                if (objeto.getName().equals(nombreObjeto)) {
                    baul.remove(objeto);
                }
            }
        }
        return null;
    }

    public Objeto getObjetoPorNombre(String nombreObjeto) {
        if (!estaVacia()) {
            for (Objeto objeto: baul) {
                if (objeto.getName().equals(nombreObjeto)) {
                    return objeto;
                }
            }
        }
        return null;
    }

    public int getCapacidadInventario() {
        return baul.size();
    }

    public boolean añadirObjeto(Objeto objeto) {
        if (!(getCapacidadInventario() < capacidad)) {
            System.out.println("Inventario lleno");
            return false;
        }
        baul.add(objeto);
        return true;
    }

    public boolean estaVacia() {
        return baul.isEmpty();
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "baul=" + baul +
                '}';
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
