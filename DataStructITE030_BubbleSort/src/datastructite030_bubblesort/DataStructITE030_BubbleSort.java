/*
 * ITE 030 Data Structure
 * Sort Algorithms
 * Using Bubble Sort algorithm
 */
package datastructite030_bubblesort;

/**
 * Author
 * Kahlil Vanz A. Quilab
 */
public class DataStructITE030_BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Test Data Array
        int[] arraydata = {3,45,67,2,1,23,73,21,0};
        
        // Display Array 
        System.out.print("Sort array using bubble sort algorithim: ");
        for( int i = 0; i < arraydata.length; i++ ){
            System.out.print(arraydata[i] + " ");
        }
        System.out.println();
        
        // Sort Algorithm Method (see method below)
        bubbleSort(arraydata);
        
        // Display result
        System.out.print("Sort result: ");
        for( int i = 0; i < arraydata.length; i++ ){
            System.out.print(arraydata[i] + " ");
        }
        System.out.println();
    }
    
    // Bubble Sort Algorithm Method
    public static void bubbleSort(int[] arraydata){
        // Loop 
        for( int i = 0; i < arraydata.length; i++ ){
            // Loop to the end of array index to compare element
            // note that to be effecient ( arraydata.length - i ) was used,
            // explained as it will not always to start at the first index to compare element
            // because in every loop, the elements are ordered by lowest to greater but not yet sorted completely 
            for( int j = 1; j < ( arraydata.length - i ); j++ ){
                // Compare elements
                if( arraydata[j-1] > arraydata[j] ){
                    // Swap elements
                    // using a variable to hold element value
                    // then reassigning values between two element indexes
                    int temp = arraydata[j-1];
                    arraydata[j-1] = arraydata[j];
                    arraydata[j] = temp;
                }
                
            }
            
        }
        
    }
    
}
