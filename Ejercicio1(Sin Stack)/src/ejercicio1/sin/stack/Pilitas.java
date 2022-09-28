/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.sin.stack;


public class Pilitas {
    public int[] array = {};
    private int size = 0;
    private int fPos = 0;
    public int sizeLastArr = 0;
//    public void Pilitas(int size) {
//        this.size = size;
//        array = new int[size];
//    }
    
    public void push(int number) {     
        if(fPos == 0) {
            fPos++;
            array = new int[fPos];
        }
        sizeLastArr = array.length;
        array[size] = number;
        size++;
        
    }
    
    private void resize(int capacity) {
        int[] copy = new int[capacity];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
            array = copy;
        }
    }
    
    public void pop(){
        resize(sizeLastArr);
        
    }
    
}
