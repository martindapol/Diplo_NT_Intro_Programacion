package com.ejemplo.dominio;

import java.util.Date;

/**
 *
 * @author MARTIN
 */
public class Consultor extends Empleado{
    private int horas;
    private float valorHora;
    
    public Consultor(int legajo, String nombre, Date fechaCto, String puesto) {
        super(legajo, nombre, fechaCto, puesto);
    }

    public Consultor(float valorHora, int horas, int legajo, String nombre, Date fechaCto, String puesto) {
       this(legajo, nombre, fechaCto, puesto);
       this.horas = horas;
       this.valorHora = valorHora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public float calcularSueldo() {
        return valorHora * horas;
    }  
}
