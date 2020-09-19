package com.ejemplo.dominio;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author MARTIN
 */
public abstract class Empleado{
    private final int legajo;
    private String nombre;
    private Date fechaCto;
    private String puesto;
  
    public Empleado(int legajo, String nombre, Date fechaCto, String puesto) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.fechaCto = fechaCto;
        this.puesto = puesto;
    }
    
      public int getLegajo() {
        return legajo;
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCto() {
        return fechaCto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public abstract float calcularSueldo();

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String cadena = "|legajo:" + legajo + "| nombre:" + nombre + "| fechaCto:" + sdf.format(fechaCto) + "| puesto:" + puesto + "| Sueldo $: " + this.calcularSueldo(); 
        return  cadena ;
    }
    
}
 