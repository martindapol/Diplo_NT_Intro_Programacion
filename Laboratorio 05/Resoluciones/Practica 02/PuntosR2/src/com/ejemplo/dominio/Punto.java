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
public class Punto {

    private int x, y;

    public Punto() {
        x = y = 0;
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double calcularDistancia() {
        double dis = Math.sqrt(x * x + y * y);
        return dis;
    }

    public String conocerCuadrante() {
        String cuadrante;
        if (x >= 0 && y >= 0) {
            cuadrante = "I";
        } else if (x < 0 && y >= 0) {
            cuadrante = "II";
        } else if (x < 0 && y < 0) {
            cuadrante = "III";
        } else {
            cuadrante = "IV";
        }

        return cuadrante;

    }

    public String mostrarPunto() {
        return "(" + x + ";" + y + ")";
    }

}
