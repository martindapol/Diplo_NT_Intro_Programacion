
package com.ejemplo.dominio;

import java.util.Random;

/**
 *
 * @author MARTIN
 */
public class Persona{
    private String nombre;
    private String dni;
    private int edad;
    private char sexo; 
    private float altura;
    private float peso;
    
    private static final char SEXO = 'H';

    public Persona() {
        nombre = "S/N";
        edad = 0;
        sexo = SEXO;
        altura = peso = 0;
        dni = generarDNI();
    }
    
    //sobrecargar con 3 parámetros:
  
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        altura = peso = 0;
        dni = generarDNI();
    }

    public Persona(String nombre, int edad, char sexo, float altura, float peso) {
        this(nombre, edad, sexo);
        this.altura = altura;
        this.peso = peso;
    }

    //getters y setters:

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        peso++;
    }

    public String getDni() {
        return dni;
    }
    /**
     * 
     * @return valor de IMC 
     */
    public int calcularIMC(){
        int aux = -1;
        float imc = peso /(altura * altura);
        if(imc >= 20 && imc <= 25)
            aux = 0;
        else if(imc > 25)
            aux = 1;

        return aux;
    }
    
    public boolean esMayorEdad(){
        return edad >= 18;
    }

    @Override
    public String toString() {
        //Devuelve el 'Estado' del objeto como una cadena:
        return "Nombre: " + nombre + "| Dni:" + dni + "| Edad=" + edad + " años| Sexo: " + sexo + "| Altura: " + altura + "| Peso: " + peso;
    }
    
 

    private String generarDNI() {
        Random r = new Random();
        return String.valueOf(r.nextInt(1000000));
    }
    
    private char comprobarSexo (char sexo){
        return (sexo == 'M' || sexo == 'm')?'M':SEXO;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}

