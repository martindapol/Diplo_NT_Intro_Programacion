/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.dominio;

import java.util.Comparator;

/**
 *
 * @author MARTIN
 */
public class CriterioPeso implements Comparator<Carga>{

    @Override
    public int compare(Carga t, Carga t1) {
        if(t == null )
            return 0;
        if(t1 == null)
            return 0;
        return t.compareTo(t1);
    }
    
}
