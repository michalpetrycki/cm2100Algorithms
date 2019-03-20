/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cwalgorithms;

import java.util.Arrays;

/**
 *
 * @author 1707586
 */
public class QuickSort {
    
    private int[] array;
    
    public QuickSort(int size){
        array = new ArrayUtils(size).initializeArray();
    }
    
    public int partition(int left, int right){
    
        int m = (left + right) / 2;
        int pivot = array[m];
        
        int x = left - 1;
        int y = right + 1;
        
        while(true){
        
            do{ x++; }
            while(array[x] < pivot);
            
            do{ y--; }
            while(array[y] > pivot);
                
            if(x < y){
            
                int temp = array[x];
                array[x] = array[y];
                array[y] = temp;
                
            }
            else return y;
                
        }
        
    }
    
    public void sort(int left, int right){
    
        if(left < right){
        
            int q = partition(left, right);
            
            sort(left, q);
            sort(q + 1, right);
        
        }
    
    }
    
    @Override
    public String toString(){
        return Arrays.toString(array);
    }
    
}
