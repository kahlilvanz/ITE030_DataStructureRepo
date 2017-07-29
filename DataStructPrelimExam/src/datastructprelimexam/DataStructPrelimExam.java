/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructprelimexam;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class DataStructPrelimExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] scores = new int[100];
        int input; int counter = 0;
        
        // Scanner Class
        Scanner inputscan = new Scanner(System.in);
        
        while (true){
            
            System.out.println("Enter the score: ");
            input = inputscan.nextInt();
            scores[counter] = input;
                    
            if(input < 0){
                break;
            }
            
            counter++;
        }
        
        double averagescore = calculateAverage(scores);
        System.out.println("The average score is: " + averagescore);
        
        aboveAverage(scores, averagescore);
        
    }
    
    public static double calculateAverage(int[] scores){
        
        double averagescore;
        int totalscore = 0;
        int scorecount = 0;
        
        for(int i=0; i<scores.length; ++i){
            if(scores[i] < 0){
                break;
            }
            totalscore += scores[i];
            scorecount++;
        }
        
        averagescore = (double) totalscore / scorecount;
        
        return averagescore;
    }
    
    public static void aboveAverage(int[] scores, double averagescore){
        
        for(int i=0; i<scores.length; i++){
            if( scores[i]>averagescore ){
                System.out.println("Number of scores above average: " + scores[i]);
            }
        }
         
    }
    
}
