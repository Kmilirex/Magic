package Logic.Objetos;

import java.util.LinkedList;
import java.util.List;

public class Inventario {
    private List<Objeto> baul;

    public Inventario() {
        this.baul = new LinkedList<Objeto>();
    }

    public Objeto eliminarObjetoPorNombre(String nombreObjeto) {
        if (!estaVacia()) {
            for (Objeto objeto: baul) {
                if (objeto.getName().equals(nombreObjeto)) {
                    return objeto;
                }
            }
        }
        return null;
    }

    public boolean estaVacia() {
        return baul.isEmpty();
    }
}
