package com.ejemplo.dominio;

import java.util.Random;

/**
 *
 * @author MARTIN
 */
public class Baraja {

    private Carta maso[];
    private int siguiente;

    public Baraja() {
        maso = new Carta[40];
        inicializarMaso();
    }

    private void inicializarMaso() {
        Palo[] palos = {new Palo("Oro"), new Palo("Basto"), new Palo("Espada"), new Palo("Copa")};
        int pos = 0;
        for (int i = 0; i < palos.length; i++) { //i barre palos
            for (int j = 0; j < 10; j++) { //j barre números
                //relación entre las vueltas de los ciclos y la posición del arreglo:
                pos = i * 10 + j;

                if (j <= 6) {
                    maso[pos] = new Carta(j + 1, palos[i]);
                } else {
                    maso[pos] = new Carta(j + 3, palos[i]);
                }
            }
        }
    }

    public void barajar() {
        int pos;
        Random rand = new Random();
        Carta aux = null;
        for (int i = 0; i < maso.length; i++) {
            pos = rand.nextInt(40); // (int)(Math.random()* 40);
            aux = maso[i];
            maso[i] = maso[pos];
            maso[pos] = aux;
        }
    }
    
    
    
    public String mostrarBaraja(){
       StringBuilder sb = new StringBuilder("");
                
        for (int i = siguiente; i < maso.length; i++) {
            sb.append(maso[i]).append("\n");
        }
        return sb.toString();
    }

    public Carta siguienteCarta(){
        Carta aux = null;
        
        if(siguiente < maso.length){  
            aux = maso[siguiente];
            siguiente++;
        }
        return aux;
    }
    
    
}
