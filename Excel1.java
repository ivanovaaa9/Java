/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Excel1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("How many number? ");
       int size = s.nextInt();
       
       
       int[] numbers = new int [size];
       for(int i = 0; i < size; i++){
           System.out.print("Enter a number: ");
           numbers[i] = s.nextInt();
           
       }
       int sum = 0, count = 0;
       double average = 0;
       int min = numbers[0];
       int max = numbers[0];
       for(int x: numbers){
           sum += x;
           count++;
           if(x < min){
               min = x;
           }
           if(x > max){
               max = x;
           }
       }
       average = (double)sum/count;
       System.out.printf("SUM = %d, AVERAGE = %.2f,", sum, average);
       System.out.printf("COUNT = %d, MIN = %d,MAX= %d\n", count, min, max);
    }
    
}
