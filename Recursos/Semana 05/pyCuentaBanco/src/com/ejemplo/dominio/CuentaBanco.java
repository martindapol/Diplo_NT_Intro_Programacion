package com.ejemplo.dominio;

/**
 *
 * @author MARTIN
 */
public class CuentaBanco {

    //1. atributos:
    private int codigo;
    private float saldo;
    private String titular;

    //2. Constructores: Se llama igual que la clase y no tiene tipo de retorno
    //Se puede sobrecargar con todas las definiciones que necesitemos
    //Constructor por defecto: no tiene parámetros
    public CuentaBanco() {
        //codigo = 0;
        //saldo = 0 ;
        titular = "Sin definir";
    }

    //Constructor con parámetros: tiene al menos 1 parámetro
    public CuentaBanco(String titular) { // titular pasa a ser un parámetro
        codigo = 0;
        saldo = 0;
        this.titular = titular; // this referencia al objeto actual
    }

    //Constructor con todos los parámetros para inicializar todos los atributos
    public CuentaBanco(int codigo, float saldo, String titular) {
        this.codigo = codigo;
        this.saldo = saldo;
        this.titular = titular;
    }

    //3. Comportamientos de acces: GETERS y SETERS 
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //4. Comportamientos propios: depositar() y extraer()
    public void depositar(float monto) {
        if (monto > 0) {
            saldo = saldo + monto;
        }
    }

    public void extraer(float monto) {
        if (monto > 0 && saldo >= monto) {
            saldo = saldo - monto;
        }        
    }
    
    public String mostrarDatos(){
        String estado = "Cuenta Nº: " + codigo + " |Titular: " + titular + " |Saldo actual: $" + saldo; 
        return estado;
    }
    

}
