/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Luis
 */
public class Banco2 {
       private long numero;
    private String titular;
    private float saldo;
    private float interesAnual;
        
    public Banco(long aNumero, String aTitular, float aInteresAnual) {
        numero = aNumero;
        titular = aTitular;
        saldo = 0;
        interesAnual = aInteresAnual;
        
    }
    public void ingreso (float cantidad) {
        saldo += cantidad;
    }
    
    public void reintegro (float cantidad) {
        saldo -= cantidad;
    }
    
    public void ingresoInteresMes () {
        saldo += interesAnual * saldo / 1200;
    }
    
    public boolean enRojos() {return saldo < 0;}
    public float leerSaldo() {return saldo;}
    
}
