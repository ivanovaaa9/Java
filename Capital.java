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
public class Capital {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
              Scanner s = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int numbers = s.nextInt();
        
     double[] days = new double[numbers];
     double sum = 0;
     for(int i = 0; i < numbers; i++ ) {
          System.out.printf("Day %d", i + 1);
          double j = s.nextDouble();
          days[i] = j;
          sum+=j;
           }
        System.out.println("Price movements: ");
        for (int i = 1; i < numbers; i++) {
        double price = days[i] - days[i - 1];
        if (price > 0){
         System.out.printf("UP with %.4f\n", price);   
        }else if (price < 0){
        System.out.printf("DOWN with %.4f\n", price);    
        }else{
           System.out.println("Not changed"); 
        }
        }
           
    System.out.printf("Average price for the period is : %.4f\n", sum / numbers);
   
          }
       }     
    
           
           
           
               
               
               
               
           
           
           
           
           
           
                    
        
        
    
    


