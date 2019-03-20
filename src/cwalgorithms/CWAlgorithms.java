/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cwalgorithms;

/**
 *
 * @author 1707586
 */
public class CWAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Create MergeSort object. Initialize it with 10 elements.
        MergeSort ms = new MergeSort(10);
        
        //Create QuickSort object. Initialize it with 10 elements.
        QuickSort qs = new QuickSort(10);
        
        
        /****************** TEST 1 **********************/
        System.out.println("===== TEST 1 ====");
        System.out.println("MERGE SORT");
        //Print all elements in array.
        System.out.println(ms.toString());
        //Merge Sort array.
        ms.sort(0, 9);
        //Print all elements in array.
        System.out.println(ms.toString());
        
        System.out.println("QUICKSORT");
        //Print all elements in array.
        System.out.println(qs.toString());
        //Quick Sort array.
        qs.sort(0, 9);
        //Print all elements in array.
        System.out.println(qs.toString());
        
        
        
        /******************** TEST 2 ********************/
        ms = new MergeSort(50);
        qs = new QuickSort(50);
        
        System.out.println("\n\n===== TEST 2 ====");
        System.out.println("MERGE SORT");
        //Print all elements in array.
        System.out.println(ms.toString());
        //Merge Sort array.
        ms.sort(0, 49);
        //Print all elements in array.
        System.out.println(ms.toString());
        
        
        System.out.println("QUICKSORT");
        //Print all elements in array.
        System.out.println(qs.toString());
        //Quick Sort array.
        qs.sort(0, 49);
        //Print all elements in array.
        System.out.println(qs.toString());

    }
    
}
