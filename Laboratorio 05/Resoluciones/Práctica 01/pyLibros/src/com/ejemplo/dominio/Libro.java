/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.dominio;

/**
 *
 * @author MARTIN
 */
public class Libro {

    //atributos:
    private String isbn;
    private String autor;
    private String titulo;
    private int paginas;

    //métodos:
    public Libro() {
        isbn = "Sin ISBN";
        autor = "Desconocido";
        titulo = "Desconocido";
        paginas = 1;
    }

    public Libro(String isbn, String autor, String titulo, int paginas) {
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = validarPaginas(paginas);
    }

    //getters y setters:
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTirulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = validarPaginas(paginas);
    }

    //comportamientos propios:
    @Override
    public String toString() {
        //permite devolver la representación del objeto como una cadena:
        String aux = "El libro con ISBN " + isbn + ", creado por el autor: "
                + autor + " tiene: " + paginas + " páginas.";
        return aux;
    }
    
    private int validarPaginas(int paginas){
        /*int aux = 1;
        if(paginas > 0)
            aux = paginas;
        */
        return (paginas > 0)? paginas:1;
    }
    
    
}
