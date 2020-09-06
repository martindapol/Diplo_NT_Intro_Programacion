package com.ejemplo;

import com.ejemplo.domain.Historico;
import com.ejemplo.domain.ObjetoExp;
import com.ejemplo.domain.ObraArte;
import com.ejemplo.domain.Sala;
import java.util.Scanner;
import javafx.scene.transform.Scale;


/**
 *
 * @author MARTIN
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Crear dos objetos de exposición:
        ObjetoExp obj1 = new Historico("Africa", "Desconocido", 1, "Fosil Africa", -1500);
        ObjetoExp obj2 = new ObraArte("Van Gogh", "Holanda", 2, "Los girasoles", 1888);
        
        //Crear una sala y asociar objetos de exposición en dicha sala:
        Sala sala = new Sala();
        sala.addObjeto(obj1);
        sala.addObjeto(obj2);
        
        //Mostrar datos de los objetos en exposición:
        System.out.println(sala.mostrarObjetos());
        System.out.println("Total de objetos: " + sala.getTotalObjetos());
        
        //Ingresar un valor de antiguedad:
        int antiguedad;
        do {            
            System.out.println("\nIngrese antiguedad de consulta:");
            antiguedad = entrada.nextInt();
        } while (antiguedad <=0);
 
        System.out.print("Total de objetos con antiguedad superior a: " + antiguedad);
        System.out.println(" años: " + sala.calcularCtdObjetos(antiguedad));
        
       
    }
    
}
