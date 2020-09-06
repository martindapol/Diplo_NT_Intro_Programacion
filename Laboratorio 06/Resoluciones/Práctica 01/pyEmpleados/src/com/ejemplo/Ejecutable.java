/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo;

import com.ejemplo.dominio.Consultor;
import com.ejemplo.dominio.Empleado;
import com.ejemplo.dominio.Empresa;
import com.ejemplo.dominio.TrabajadorFijo;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author MARTIN
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear dos objetos Empleados;
        Empleado c = new Consultor(200, 100, 1, "Juan", Calendar.getInstance().getTime(), "Gerente");
        Empleado t = new TrabajadorFijo(30000, 10, 2, "Andrés", new Date(), "Desarrollador Junior");
        
        //crear un objeto empresa y asociar los empleados:
        Empresa empresa = new Empresa();
        empresa.agregarTrabajador(c);
        empresa.agregarTrabajador(t);
        //Mostrar nómina de empleados ordenados en orden alfabético y presupuesto mensual:
        System.out.println(empresa.mostrarNomina());
        
        //Incrementar un 20% el sueldo solo a trabajadores fijos y mostrar nómina nuevamente:
        empresa.incrementarSueldo(20);
        System.out.println(empresa.mostrarNomina());
    }
}
