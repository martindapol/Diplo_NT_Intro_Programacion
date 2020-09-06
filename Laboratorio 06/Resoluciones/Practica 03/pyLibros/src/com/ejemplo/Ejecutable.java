package com.ejemplo;

import com.ejemplo.dominio.Biblioteca;
import com.ejemplo.dominio.Libro;
import com.ejemplo.dominio.Revista;
import java.util.Scanner;

/**
 *
 * @author MARTIN
 */
public class Ejecutable {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // para cadenas
        Scanner entrada2 = new Scanner(System.in); // para otros tipos de variables
        Biblioteca miBiblioteca;
        int cant;
        do {
            System.out.println("Ingrese la cantidad de publicaciones de la biblioteca: (>0) ");
            cant = entrada2.nextInt();
        } while (cant <= 0);

        //Crear un objeto biblioteca:
        miBiblioteca = new Biblioteca(cant);

        // Libro creado con valores por defecto:
        Libro libro1, libro2; // son objetos? son referencias valen null;
        Revista revista1;
        
        revista1 = new Revista(33, "Una revista de ejemplo", 60);
        
        libro1 = new Libro();
        libro1.setIsbn("324-343444-44");
        libro1.setAutor("Otro autor");
        libro1.setTitulo("Libro1");
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

        if (miBiblioteca.agregarPublicacion(libro1) == true) {
            System.out.println("Libro agregado!");
        } else {
            System.out.println("No se pudo agregar el libro!");
        }

        //simplemente lo agregamos sin validar:
        miBiblioteca.agregarPublicacion(libro2);
        
        //simplemente agregamos sin validar ahora una revista:
        miBiblioteca.agregarPublicacion(revista1);
       
        //Mostrar estado de la biblioteca:
        String listado = miBiblioteca.mostrarListado();
        System.out.println(listado);
        
        //Buscar la Libro con título: Libro1
        System.out.println("Existe Libro1?\n" + miBiblioteca.buscarPublicacion("Libro1"));
       
        //Contar libros con más de 100 páginas:
        System.out.println("Cantidad de libros con más de 100 páginas: " + miBiblioteca.contarLibros(100));
    }
}
