/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cwalgorithms;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 1707586
 */
public class CWAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //testPart1();
        //testPart2();
        
    }
    
    
    /*

        I made 12 test. First four are testing sorting for whole arrays for 10, 50, 100 and 1000 elements.
        Next four tests sort just left half(0, middle) of arrays. 
        Last four tessts sort right half(middle, length - 1) of arrays.

    */
    
    private static void testPart1(){
    
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
        //Print out sorting used time
        System.out.println("Time taken: " + ms.getTime());
        //Print out sorting used space
        System.out.println("Space taken: " + ms.getSpace());
        
        
        System.out.println("QUICKSORT");
        //Print all elements in array.
        System.out.println(qs.toString());
        //Quick Sort array.
        qs.sort(0, 9);
        //Print all elements in array.
        System.out.println(qs.toString());
        //Print out sorting time taken
        System.out.println("Time taken: " + qs.getTime());
        
        
        
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
        //Print out sorting used time
        System.out.println("Time taken: " + ms.getTime());
        //Print out sorting used space
        System.out.println("Space taken: " + ms.getSpace());
        
        
        System.out.println("QUICKSORT");
        //Print all elements in array.
        System.out.println(qs.toString());
        //Quick Sort array.
        qs.sort(0, 49);
        //Print all elements in array.
        System.out.println(qs.toString());
        //Print out sorting time taken
        System.out.println("Time taken: " + qs.getTime());
        
        
        
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
        //Print out sorting used time
        System.out.println("Time taken: " + ms.getTime());
        //Print out sorting used space
        System.out.println("Space taken: " + ms.getSpace());
        
        
        System.out.println("QUICKSORT");
        //Print all elements in array.
        System.out.println(qs.toString());
        //Quick Sort array.
        qs.sort(0, 99);
        //Print all elements in array.
        System.out.println(qs.toString());
        //Print out sorting time taken
        System.out.println("Time taken: " + qs.getTime());
        
        
        
        /******************** TEST 4 ********************/
        ms = new MergeSort(1000);
        qs = new QuickSort(1000);
        
        System.out.println("\n\n===== TEST 4 ====");
        System.out.println("MERGE SORT");
        //Print all elements in array.
        System.out.println(ms.toString());
        //Merge Sort array.
        ms.sort(0, 999);
        //Print all elements in array.
        System.out.println(ms.toString());
        //Print out sorting used time
        System.out.println("Time taken: " + ms.getTime());
        //Print out sorting used space
        System.out.println("Space taken: " + ms.getSpace());
        
        
        System.out.println("QUICKSORT");
        //Print all elements in array.
        System.out.println(qs.toString());
        //Quick Sort array.
        qs.sort(0, 999);
        //Print all elements in array.
        System.out.println(qs.toString());
        //Print out sorting time taken
        System.out.println("Time taken: " + qs.getTime());
        
        
        
        /******************** TEST 5 ********************/
        ms = new MergeSort(10);
        qs = new QuickSort(10);
        
        System.out.println("\n\n===== TEST 5 ====");
        System.out.println("MERGE SORT");
        //Print all elements in array.
        System.out.println(ms.toString());
        //Merge Sort array.
        ms.sort(0, 5);
        //Print all elements in array.
        System.out.println(ms.toString());
        //Print out sorting used time
        System.out.println("Time taken: " + ms.getTime());
        //Print out sorting used space
        System.out.println("Space taken: " + ms.getSpace());
        
        
        System.out.println("QUICKSORT");
        //Print all elements in array.
        System.out.println(qs.toString());
        //Quick Sort array.
        qs.sort(0, 5);
        //Print all elements in array.
        System.out.println(qs.toString());
        //Print out sorting time taken
        System.out.println("Time taken: " + qs.getTime());
        
        
        
        /******************** TEST 6 ********************/
        ms = new MergeSort(50);
        qs = new QuickSort(50);
        
        System.out.println("\n\n===== TEST 6 ====");
        System.out.println("MERGE SORT");
        //Print all elements in array.
        System.out.println(ms.toString());
        //Merge Sort array.
        ms.sort(0, 25);
        //Print all elements in array.
        System.out.println(ms.toString());
        //Print out sorting used time
        System.out.println("Time taken: " + ms.getTime());
        //Print out sorting used space
        System.out.println("Space taken: " + ms.getSpace());
        
        
        System.out.println("QUICKSORT");
        //Print all elements in array.
        System.out.println(qs.toString());
        //Quick Sort array.
        qs.sort(0, 25);
        //Print all elements in array.
        System.out.println(qs.toString());
        //Print out sorting time taken
        System.out.println("Time taken: " + qs.getTime());
                
        
        
        /******************** TEST 7 ********************/
        ms = new MergeSort(100);
        qs = new QuickSort(100);
        
        System.out.println("\n\n===== TEST 7 ====");
        System.out.println("MERGE SORT");
        //Print all elements in array.
        System.out.println(ms.toString());
        //Merge Sort array.
        ms.sort(0, 50);
        //Print all elements in array.
        System.out.println(ms.toString());
        System.out.println("Time taken: " + ms.getTime());
        
        
        System.out.println("QUICKSORT");
        //Print all elements in array.
        System.out.println(qs.toString());
        //Quick Sort array.
        qs.sort(0, 50);
        //Print all elements in array.
        System.out.println(qs.toString());
        //Print out sorting time taken
        System.out.println("Time taken: " + qs.getTime());
                
        
        
        /******************** TEST 8 ********************/
        ms = new MergeSort(1000);
        qs = new QuickSort(1000);
        
        System.out.println("\n\n===== TEST 8 ====");
        System.out.println("MERGE SORT");
        //Print all elements in array.
        System.out.println(ms.toString());
        //Merge Sort array.
        ms.sort(0, 500);
        //Print all elements in array.
        System.out.println(ms.toString());
        //Print out sorting used time
        System.out.println("Time taken: " + ms.getTime());
        //Print out sorting used space
        System.out.println("Space taken: " + ms.getSpace());
        
        
        System.out.println("QUICKSORT");
        //Print all elements in array.
        System.out.println(qs.toString());
        //Quick Sort array.
        qs.sort(0, 500);
        //Print all elements in array.
        System.out.println(qs.toString());
        //Print out sorting time taken
        System.out.println("Time taken: " + qs.getTime());
        
        
        
        /******************** TEST 9 ********************/
        ms = new MergeSort(10);
        qs = new QuickSort(10);
        
        System.out.println("\n\n===== TEST 9 ====");
        System.out.println("MERGE SORT");
        //Print all elements in array.
        System.out.println(ms.toString());
        //Merge Sort array.
        ms.sort(5, 9);
        //Print all elements in array.
        System.out.println(ms.toString());
        //Print out sorting used time
        System.out.println("Time taken: " + ms.getTime());
        //Print out sorting used space
        System.out.println("Space taken: " + ms.getSpace());
        
        
        System.out.println("QUICKSORT");
        //Print all elements in array.
        System.out.println(qs.toString());
        //Quick Sort array.
        qs.sort(5, 9);
        //Print all elements in array.
        System.out.println(qs.toString());
        //Print out sorting time taken
        System.out.println("Time taken: " + qs.getTime());
        
        
        
        /******************** TEST 10 ********************/
        ms = new MergeSort(50);
        qs = new QuickSort(50);
        
        System.out.println("\n\n===== TEST 10 ====");
        System.out.println("MERGE SORT");
        //Print all elements in array.
        System.out.println(ms.toString());
        //Merge Sort array.
        ms.sort(25, 49);
        //Print all elements in array.
        System.out.println(ms.toString());
        //Print out sorting used time
        System.out.println("Time taken: " + ms.getTime());
        //Print out sorting used space
        System.out.println("Space taken: " + ms.getSpace());
        
        
        System.out.println("QUICKSORT");
        //Print all elements in array.
        System.out.println(qs.toString());
        //Quick Sort array.
        qs.sort(25, 49);
        //Print all elements in array.
        System.out.println(qs.toString());
        //Print out sorting time taken
        System.out.println("Time taken: " + qs.getTime());
        
        
        
        /******************** TEST 11 ********************/
        ms = new MergeSort(100);
        qs = new QuickSort(100);
        
        System.out.println("\n\n===== TEST 11 ====");
        System.out.println("MERGE SORT");
        //Print all elements in array.
        System.out.println(ms.toString());
        //Merge Sort array.
        ms.sort(50, 99);
        //Print all elements in array.
        System.out.println(ms.toString());
        //Print out sorting time taken
        //Print out sorting used time
        System.out.println("Time taken: " + ms.getTime());
        //Print out sorting used space
        System.out.println("Space taken: " + ms.getSpace());
        
        
        System.out.println("QUICKSORT");
        //Print all elements in array.
        System.out.println(qs.toString());
        //Quick Sort array.
        qs.sort(50, 99);
        //Print all elements in array.
        System.out.println(qs.toString());
        //Print out sorting time taken
        System.out.println("Time taken: " + qs.getTime());
            
        
        
        /******************** TEST 12 ********************/
        ms = new MergeSort(1000);
        qs = new QuickSort(1000);
        
        System.out.println("\n\n===== TEST 12 ====");
        System.out.println("MERGE SORT");
        //Print all elements in array.
        System.out.println(ms.toString());
        //Merge Sort array.
        ms.sort(500, 999);
        //Print all elements in array.
        System.out.println(ms.toString());
        //Print out sorting used time
        System.out.println("Time taken: " + ms.getTime());
        //Print out sorting used space
        System.out.println("Space taken: " + ms.getSpace());
        
        
        System.out.println("QUICKSORT");
        //Print all elements in array.
        System.out.println(qs.toString());
        //Quick Sort array.
        qs.sort(500, 999);
        //Print all elements in array.
        System.out.println(qs.toString());
        //Print out sorting time taken
        System.out.println("Time taken: " + qs.getTime());
        
        
    }
    
    private static void testPart2(){
    
        Map<Integer, Double> merge_time_map = new HashMap<>();
        Map<Integer, Double> merge_space_map = new HashMap<>();
        Map<Integer, Double> quick_map = new HashMap<>();
        
        for(int i = 10; i < 1000; i += 10){
        
            MergeSort[] ms = new MergeSort[100];
            QuickSort[] qs = new QuickSort[100];
            
            int time = 0;
            int space = 0;
            
            for(MergeSort m: ms){
            
                m = new MergeSort(i);
                m.sort(0, i - 1);
                time += m.getTime();
                space += m.getSpace();
                
            }
            merge_time_map.put(i, (double)(time / 100));
            merge_space_map.put(i, (double) (space / 100));
            
            time = 0;
            space = 0;
            for(QuickSort q: qs){

                q = new QuickSort(i);
                q.sort(0, i - 1);
                time += q.getTime();

            }
            quick_map.put(i, (double) (time / 100));
            
        }
        
    }
    
}
