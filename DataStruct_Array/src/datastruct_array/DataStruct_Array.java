/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastruct_array;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class DataStruct_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        multiDimArray();
        
    }
    
    public static void multiDimArray(){
        
        double[][] rental = new double[4][3];
        
        Scanner sc = new Scanner(System.in);
        
        for( int i = 0; i < rental.length; i++ ){
            for( int j = 0; j < rental[i].length; j++ ){
                
                System.out.println("Enter rental value for floor "
                    + i + " with " + j + " # of bedrooms");
                rental[i][j] = sc.nextDouble();
                
            }
        }
        
        System.out.println("Enter floor you want: ");
        int floor = sc.nextInt();
         System.out.println("Enter bedroom you want: ");
        int bedroom = sc.nextInt();
        
        System.out.println("The rental value is: " + returnRentalValue(rental, floor, bedroom));
        
    }
    
    public static double returnRentalValue(
            double[][] getrental
            , int getfloor
            , int getroom
    ){
        return getrental[getfloor][getroom];  
    }
    
}
