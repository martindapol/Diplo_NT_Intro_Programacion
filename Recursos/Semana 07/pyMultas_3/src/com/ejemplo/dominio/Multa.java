/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.dominio;

/**
 *
 * @author MARTIN
 */
public class Multa{
    //atributos:
    private long acta;
    private int codigo;
    private float monto;
    
    //contructores:
    public Multa(long acta, int codigo, float monto) {
        this.acta = acta;
        this.codigo = codigo;
        this.monto = monto;
    }

    //comportamientos de acceso:
    public long getActa() {
        return acta;
    }

    public void setActa(long acta) {
        this.acta = acta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    //comportamientos propios:
    public float calcularMonto(){
        return monto;
    }

    @Override
    public String toString() {
        return "Acta Nº: " + acta + " |Código de infracción: " + codigo + "| monto: $" + monto;
    }
}
