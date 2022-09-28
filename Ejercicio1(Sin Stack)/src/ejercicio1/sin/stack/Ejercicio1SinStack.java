/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.sin.stack;

public class Ejercicio1SinStack {

    
    public static void main(String[] args) {
//        Pila pila = new Pila();
//        
//        pila.push(15);
//        pila.push(10);
//        pila.push(5);
//        pila.push(8);
//        pila.push(20);
//        pila.push(30);
//        pila.push(50);
//        pila.push(2);
//        pila.pop();
//        pila.pop();
//        
//        System.out.println("Ultimo Elemento de la pila antes de eliminar " + pila.peek());
//        
//        pila.pop();
//        pila.push(40);
//        
//        System.out.println("Ultimo Elemento de la pila antes de eliminar " + pila.peek());
//        
//        
//        for (int i = 0; i < 3; i++) {
//            pila.pop();
//        }
//        
//        System.out.println("Ultimo Elemento de la pila antes de eliminar " + pila.peek());
        
          Pilitas pila = new Pilitas();
          
          pila.push(10);
          pila.push(20);
          int[] arr = pila.array;
          
          System.out.println("Elemento en 0: " + arr[0]);
    }
    
}
