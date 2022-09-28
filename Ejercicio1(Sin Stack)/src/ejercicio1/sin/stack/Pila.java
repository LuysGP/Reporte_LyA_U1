/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.sin.stack;

import java.util.ArrayList;

public class Pila {
    
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    public int sizeArr = 0;
        
    public void push(int number){
        numeros.add(number);
        sizeArr = numeros.size() - 1;
    }
    
    public void pop() {
        numeros.remove(sizeArr);
        sizeArr = sizeArr - 1;
    }
    
    public int peek() {
        return numeros.get(sizeArr);
    }
}
