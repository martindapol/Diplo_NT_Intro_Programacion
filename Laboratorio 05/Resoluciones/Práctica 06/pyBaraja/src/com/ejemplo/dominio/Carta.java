package com.ejemplo.dominio;

/**
 *
 * @author MARTIN
 */
public class Carta {
    private final int numero;
    private final Palo palo;

   
    public Carta(int numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "[" + numero + "|" + palo + "]";
    }

}
