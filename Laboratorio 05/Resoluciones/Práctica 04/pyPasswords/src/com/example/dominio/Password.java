/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.dominio;

/**
 *
 * @author MARTIN
 */
public class Password {

    private final String valor;
    private int largo;

    public Password() {
        largo = 8;
        valor = generarPassword();
    }

    public Password(int largo) {
        this.largo = largo;
        valor = generarPassword();
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getLargo() {
        return largo;
    }

    public boolean esFuerte() {
        int cMay, cMin, cNum;
        int ascii;
        //asignación múltiple...
        cMay = cMin = cNum = 0;
        for (int i = 0; i < largo; i++) {
            //tomar automáticamente el código ASCII:
            ascii = valor.charAt(i);
            if (ascii >= 48 && ascii <= 57) {
                cNum++;
            } else if (ascii >= 65 && ascii <= 90) {
                cMay++;
            } else {
                cMin++;
            }
        }//fin for...
        return (cMay > 3 && cMin > 1 && cNum > 5);
    }

    private String generarPassword() {
        char[] vec = new char[62];
        for (int i = 0; i < vec.length; i++) {
            if (i < 26) {
                vec[i] = (char) (65 + i);
            } else if (i < 52) {
                vec[i] = (char) (97 + i - 26);
            } else {
                vec[i] = (char) (48 + i - 52);
            }
        }//fin for..

        String aux = "";
        //concatenar cadena con caracteres aleatorios:
        for (int j = 0; j < largo; j++) {
            int rand = (int) (Math.random() * 62);
            aux += vec[rand];
        }

        return aux;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        String aux = "Débil";
        if (esFuerte()) {
            aux = "Fuerte";
        }
        return getValor() + "|" + aux;
    }

}
