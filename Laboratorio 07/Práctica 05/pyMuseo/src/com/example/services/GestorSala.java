/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.services;

import com.example.domain.Historico;
import com.example.domain.ObjetoExp;
import com.example.domain.ObraArte;
import com.example.domain.Sala;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MARTIN
 */
public class GestorSala {
    private List<Sala> salas;

    public GestorSala() {
        salas = new ArrayList<>();
        
        Sala unaSala = new Sala();
        unaSala.setNombre("Sala Prueba");
        unaSala.setAla("Norte");
        
        ObjetoExp obj1 = new Historico("Africa", "Incierto", 1, "fosil de ejemplo", -1355);
        ObjetoExp obj2 = new ObraArte("Davinci", "Italia", 2, "Mona Lisa", 1503);
        unaSala.addObjeto(obj1);
        unaSala.addObjeto(obj2);
       
        salas.add(unaSala);
    }

    public Object[] getSalas() {
        return salas.toArray();
    }
    
    public void agregarObjeto(ObjetoExp obj, String s){
        for (Sala sala : salas) {
            if(sala.getNombre().equals(s)){
                sala.addObjeto(obj);
                break;
            }
        }
    }
    
    
}
