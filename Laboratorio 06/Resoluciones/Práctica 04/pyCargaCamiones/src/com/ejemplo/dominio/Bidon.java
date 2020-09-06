package com.ejemplo.dominio;

/**
 *
 * @author MARTIN
 */
public class Bidon extends Carga{
    private float densidad;
    private float capacidad;

    public Bidon(float densidad, float capacidad, String contenido) {
        super(contenido);
        this.densidad = densidad;
        this.capacidad = capacidad;
    }

    public float getDensidad() {
        return densidad;
    }

    public void setDensidad(float densidad) {
        this.densidad = densidad;
    }

    public float getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(float capacidad) {
        this.capacidad = capacidad;
    }
    
    @Override
    public float peso() {
        return densidad * capacidad;
    }

    @Override
    public String toString() {
        return super.toString() + " |Densidad: " + densidad + " |Capacidad: " + capacidad;
    }
    
    
}
