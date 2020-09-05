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
public class BibliotecaEjecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // para cadenas
        Scanner entrada2 = new Scanner(System.in); // para otros tipos de variables

        // Libro creado con valores por defecto:
        /*Libro libro1, libro2; // son objetos? son referencias valen null;
        libro1 = new Libro();
        libro1.setIsbn("324-343444-44");
        libro1.setAutor("Otro autor");
        libro1.setPaginas(500);
         */
        int cant;
        do {
            System.out.println("Ingrese la cantidad de libros de la biblioteca: (>0) ");
            cant = entrada2.nextInt();
        } while (cant <= 0);

        
        String isbn, tit, autor;
        int paginas;
        //crear un arreglo que represente lo físicamente sería el estable:
        Libro estanteria[] = new Libro[cant];
        for (int i = 0; i < estanteria.length; i++) {
            //Libreo creado con valores ingresados por teclado:
            System.out.println("Ingrese ISBN del libro: ");
            isbn = entrada.nextLine();

            System.out.println("Ingrese Título del libro: ");
            tit = entrada.nextLine();

            System.out.println("Ingrese Autor del libro: ");
            autor = entrada.nextLine();

            System.out.println("Ingrese cantidad de páginas del libro: ");
            paginas = entrada2.nextInt();

            estanteria[i] = new Libro(isbn, autor, tit, paginas); // cada vuelta crea
            //un objeto nuevo (Libro) y lo referencia mediante una componente del arreglo
        }
        
        for (int i = 0; i < estanteria.length; i++) {
            System.out.println("Libro " + (i+1) + ": " + estanteria[i].toString());
        }

    }

}
