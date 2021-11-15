/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;


import java.util.Scanner;

/**
 *
 * @author Viktoria Tsvetanova
 */
public class Lunch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);    
       System.out.print("What is the bill?: ");
       double a = s.nextDouble();      
       System.out.print("How many of you are there: ");
       int b = s.nextInt();
       double  c = 0;         
       for (int d = 1; d<=b; d++) {
          
           
       System.out.print("Person " + d + " gives: " );
      
         c = c +s.nextDouble();
           
         
       }
        
       
       System.out.printf("Paid: %.2f \n",c);
       
       if(c<a) { 
           double z = b - c;       
       System.out.printf("%.2f leva left to pay the bill \n", z); 
       }
       if(c>=b) {
           double z = c-b;
           System.out.printf("Tip %.2f \n" ,z);
       
            }
          
    }
}    