package com.ejemplo;

import com.ejemplo.dominio.Bidon;
import com.ejemplo.dominio.Caja;
import com.ejemplo.dominio.Camion;
import com.ejemplo.dominio.Carga;
import com.ejemplo.dominio.Packing;

/**
 *
 * @author MARTIN
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear objetos carga para subir al camión:
        Carga c1 = new Caja(42, "Cerámicos");
        Carga c2 = new Bidon(20, 5, "Liquido de limpieza");
        Carga c3 = new Packing(20, 5, 600, "Repuestos");
        
        //Crear objeto camión (con capacidad máxima de 2000 kg) y subir las cargas:
        Camion camion = new Camion();
        camion.setCargaMaxima(2000);
        camion.subirCarga(c1);
        System.out.println("Carga: " + c1.toString() + " subiendo...");
        camion.subirCarga(c2);
        System.out.println("Carga: " + c2.toString() + " subiendo...");
        camion.subirCarga(c3);
        System.out.println("Carga: " + c3.toString() + " subiendo...");
        
        //Mostrar listado de cargas ordenadas por peso:
        System.out.println("\nListado de Cargas\n" + camion.listarCargasPorPeso());
        
        //Validar si el camión está listo para salir:
        if(camion.listoParaSalir())
            System.out.println("Listo para salir de viaje!");
        else
            System.out.println("Camión en carga!");
    }
    
}
