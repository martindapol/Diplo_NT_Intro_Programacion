
package com.ejemplo.domain;

import java.util.Calendar;

/**
 *
 * @author MARTIN
 */
public abstract class ObjetoExp implements Comparable<ObjetoExp> {

    private int cod;
    private String nombre;
    private int anio;

    public ObjetoExp() {
    }

    public ObjetoExp(int cod, String nombre, int anio) {
        this.cod = cod;
        this.nombre = nombre;
        this.anio = anio;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Código: " + cod + "| Nombre: " + nombre + "| Año: " + anio;
    }

    public int antiguedad() {
        int actual = Calendar.getInstance().get(Calendar.YEAR);
        int ant;
        if (this.anio < 0) //AC:
        {
            ant = actual + Math.abs(this.anio);
        } else {
            ant = actual - this.anio;
        }

        return ant;
    }

    @Override
    public int compareTo(ObjetoExp t) {
        return this.antiguedad()-t.antiguedad();
    }

}
