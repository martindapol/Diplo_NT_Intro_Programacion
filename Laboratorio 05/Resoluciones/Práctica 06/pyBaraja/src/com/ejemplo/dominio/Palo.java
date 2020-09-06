
package com.ejemplo.dominio;

/**
 *
 * @author MARTIN
 */
public class Palo extends Object{
    private final String nombre;

    public Palo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() { //permite obtener el estado de un objeto como cadena
        return nombre;
    }
}
