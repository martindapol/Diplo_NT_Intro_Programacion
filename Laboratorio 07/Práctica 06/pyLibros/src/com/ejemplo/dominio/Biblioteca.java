package com.ejemplo.dominio;

/**
 *
 * @author MARTIN
 */
public class Biblioteca {

    private final Publicacion[] estanteria;
    private int ultimo;

    public Biblioteca() {
        estanteria = new Publicacion[20];
        ultimo = 0;
    }

    public Biblioteca(int cant) {
        estanteria = new Publicacion[cant];
    }

    public Publicacion[] getEstanteria() {
        return estanteria;
    }

    public boolean agregarPublicacion(Publicacion unaPublicacion) {
        boolean aux = false;
        if (ultimo < estanteria.length) { // si no está llena la estantería:
            estanteria[ultimo] = unaPublicacion; //acceso directo al arreglo
            aux = true;
            ultimo++; // actualizo la posición para el próximo ingreso
        }
        return aux;//permite informar si efectivamente se pudo agregar el libro      
    }

    public String mostrarListado() {
        String aux = "Estanteria:\n[";
        for (int i = 0; i < ultimo; i++) {
            if (estanteria[i] != null) { //si tengo libro
                aux += estanteria[i].getTitulo() + "\t|";
            } else {
                aux = aux + "Lugar vacío\t|";
            }
        }
        aux += "]";

        return aux;
    }

    public String buscarPublicacion(String unTitulo) {
        String aux = "Publicación no se encuentra en la biblioteca!";

        for (int i = 0; i < estanteria.length; i++) {
            if (estanteria[i] != null) {
                if (estanteria[i].getTitulo().equals(unTitulo)) {
                    aux = estanteria[i].toString();
                    break;
                }
            }
        }//fin for
        return aux;
    }

    public int contarLibros(int nPaginas) {
        int aux = 0;

        for (int i = 0; i < estanteria.length; i++) {
            if (estanteria[i] != null) {
                if (estanteria[i] instanceof Libro) {
                    if (estanteria[i].getPaginas() >= nPaginas) {
                        aux++;
                    }
                }
            }
        }
        return aux;
    }
}
