/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cwalgorithms;

import java.util.Random;

/**
 *
 * @author 1707586
 */
public class ArrayUtils {
    
    private int[] array;
    private Random r;
    public ArrayUtils(int size){
        
        array = new int[size];
        r = new Random();
        
    }
    
    public int[] initializeArray(){
    
        for(int i = 0; i < array.length; i++){
        
            array[i] = r.nextInt((100 - 0) + 1) + 1;
        
        }
        
        return array;
    
    }
    
}
