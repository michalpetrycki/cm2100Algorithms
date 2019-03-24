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
        
        
        /*
        
            I made 9 test. First three are testing sorting for whole arrays for 10, 50 and 100 elements.
            Next three tests sort just left half(0, middle) of arrays. 
            Last three tessts sort right half(middle, length - 1) of arrays.
        
        */
        
        
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
        
        
        /******************** TEST 3 ********************/
        ms = new MergeSort(100);
        qs = new QuickSort(100);
        
        System.out.println("\n\n===== TEST 3 ====");
        System.out.println("MERGE SORT");
        //Print all elements in array.
        System.out.println(ms.toString());
        //Merge Sort array.
        ms.sort(0, 99);
        //Print all elements in array.
        System.out.println(ms.toString());
        
        
        System.out.println("QUICKSORT");
        //Print all elements in array.
        System.out.println(qs.toString());
        //Quick Sort array.
        qs.sort(0, 99);
        //Print all elements in array.
        System.out.println(qs.toString());
        
        
        
        /******************** TEST 4 ********************/
        ms = new MergeSort(10);
        qs = new QuickSort(10);
        
        System.out.println("\n\n===== TEST 4 ====");
        System.out.println("MERGE SORT");
        //Print all elements in array.
        System.out.println(ms.toString());
        //Merge Sort array.
        ms.sort(0, 5);
        //Print all elements in array.
        System.out.println(ms.toString());
        
        
        System.out.println("QUICKSORT");
        //Print all elements in array.
        System.out.println(qs.toString());
        //Quick Sort array.
        qs.sort(0, 5);
        //Print all elements in array.
        System.out.println(qs.toString());
        
        
        
        /******************** TEST 5 ********************/
        ms = new MergeSort(50);
        qs = new QuickSort(50);
        
        System.out.println("\n\n===== TEST 5 ====");
        System.out.println("MERGE SORT");
        //Print all elements in array.
        System.out.println(ms.toString());
        //Merge Sort array.
        ms.sort(0, 25);
        //Print all elements in array.
        System.out.println(ms.toString());
        
        
        System.out.println("QUICKSORT");
        //Print all elements in array.
        System.out.println(qs.toString());
        //Quick Sort array.
        qs.sort(0, 25);
        //Print all elements in array.
        System.out.println(qs.toString());
        
        
        
        /******************** TEST 6 ********************/
        ms = new MergeSort(100);
        qs = new QuickSort(100);
        
        System.out.println("\n\n===== TEST 6 ====");
        System.out.println("MERGE SORT");
        //Print all elements in array.
        System.out.println(ms.toString());
        //Merge Sort array.
        ms.sort(0, 50);
        //Print all elements in array.
        System.out.println(ms.toString());
        
        
        System.out.println("QUICKSORT");
        //Print all elements in array.
        System.out.println(qs.toString());
        //Quick Sort array.
        qs.sort(0, 50);
        //Print all elements in array.
        System.out.println(qs.toString());
                
        
        
        /******************** TEST 7 ********************/
        ms = new MergeSort(10);
        qs = new QuickSort(10);
        
        System.out.println("\n\n===== TEST 7 ====");
        System.out.println("MERGE SORT");
        //Print all elements in array.
        System.out.println(ms.toString());
        //Merge Sort array.
        ms.sort(5, 9);
        //Print all elements in array.
        System.out.println(ms.toString());
        
        
        System.out.println("QUICKSORT");
        //Print all elements in array.
        System.out.println(qs.toString());
        //Quick Sort array.
        qs.sort(5, 9);
        //Print all elements in array.
        System.out.println(qs.toString());
        
        
        
        /******************** TEST 8 ********************/
        ms = new MergeSort(50);
        qs = new QuickSort(50);
        
        System.out.println("\n\n===== TEST 8 ====");
        System.out.println("MERGE SORT");
        //Print all elements in array.
        System.out.println(ms.toString());
        //Merge Sort array.
        ms.sort(25, 49);
        //Print all elements in array.
        System.out.println(ms.toString());
        
        
        System.out.println("QUICKSORT");
        //Print all elements in array.
        System.out.println(qs.toString());
        //Quick Sort array.
        qs.sort(25, 49);
        //Print all elements in array.
        System.out.println(qs.toString());
        
        
        /******************** TEST 9 ********************/
        ms = new MergeSort(100);
        qs = new QuickSort(100);
        
        System.out.println("\n\n===== TEST 9 ====");
        System.out.println("MERGE SORT");
        //Print all elements in array.
        System.out.println(ms.toString());
        //Merge Sort array.
        ms.sort(50, 99);
        //Print all elements in array.
        System.out.println(ms.toString());
        
        
        System.out.println("QUICKSORT");
        //Print all elements in array.
        System.out.println(qs.toString());
        //Quick Sort array.
        qs.sort(50, 99);
        //Print all elements in array.
        System.out.println(qs.toString());

    }
    
}
