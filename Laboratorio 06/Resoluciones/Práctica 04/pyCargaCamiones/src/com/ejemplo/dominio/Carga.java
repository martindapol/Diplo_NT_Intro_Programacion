package com.ejemplo.dominio;

/**
 *
 * @author MARTIN
 */
public abstract class Carga implements Comparable<Carga>{
   private String contenido;

    public Carga(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
   
    public abstract float peso();

    @Override
    public String toString() {
        return "Contenido: " + contenido;
    }

    @Override
    public int compareTo(Carga t) {
        return (int)(this.peso() - t.peso());
    }
    
}
