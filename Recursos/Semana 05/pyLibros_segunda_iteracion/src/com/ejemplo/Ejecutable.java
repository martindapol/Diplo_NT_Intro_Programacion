/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo;

import com.ejemplo.dominio.Biblioteca;
import com.ejemplo.dominio.Libro;
import java.util.Scanner;

/**
 *
 * @author MARTIN
 */
public class Ejecutable {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // para cadenas
        Scanner entrada2 = new Scanner(System.in); // para otros tipos de variables

        int cant;
        do {
            System.out.println("Ingrese la cantidad de libros de la biblioteca: (>0) ");
            cant = entrada2.nextInt();
        } while (cant <= 0);

        //Crear un objeto biblioteca:
        Biblioteca miBiblioteca = new Biblioteca(cant);

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

        if (miBiblioteca.agregarLibro(libro1) == true) {
            System.out.println("Libro agregado!");
        } else {
            System.out.println("No se pudo agregar el libro!");
        }

        //simplemente lo agregamos sin validar:
        miBiblioteca.agregarLibro(libro2);
        
                //simplemente lo agregamos sin validar:
        miBiblioteca.agregarLibro(libro2);

        
        //Mostrar estado de la biblioteca:
        String listado = miBiblioteca.mostrarListado();
        System.out.println(listado);
    }
}
