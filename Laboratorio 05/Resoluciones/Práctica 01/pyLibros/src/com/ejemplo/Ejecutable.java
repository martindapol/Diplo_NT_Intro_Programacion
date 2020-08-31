/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo;

import com.ejemplo.dominio.Libro;
import java.util.Scanner;

/**
 *
 * @author MARTIN
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // para cadenas
        Scanner entrada2 = new Scanner(System.in); // para otros tipos de variables

        // Libro creado con valores por defecto:
        Libro libro1, libro2; // son objetos? son referencias valen null;
        libro1 = new Libro();
        libro1.setIsbn("324-343444-44");
        libro1.setAutor("Otro autor");
        libro1.setPaginas(500);
        
        

        //Libreo creado con valores ingresados por teclado:
        System.out.println("Ingrese ISBN del libro: ");
        String isbn = entrada.nextLine();

        System.out.println("Ingrese Título del libro: ");
        String tit = entrada.nextLine();

        System.out.println("Ingrese Autor del libro: ");
        String autor = entrada.nextLine();

        System.out.println("Ingrese cantidad de páginas del libro: ");
        int paginas = entrada2.nextInt();

        libro2 = new Libro(isbn, autor, tit, paginas);

        //Resultados:
        System.out.println("Libro 1: " + libro1);
        System.out.println("Libro 2: " + libro2.toString());
       
        if (libro1.getPaginas() > libro2.getPaginas()) {
            System.out.println(libro1.getTitulo() +  " con más páginas!");
        } else if (libro2.getPaginas() > libro1.getPaginas()) {
            System.out.println(libro2.getTitulo() +  " tiene más páginas!");
        } else {
            System.out.println("Ambos libros tienen la misma cantidad de páginas!");
        }
    }

}
