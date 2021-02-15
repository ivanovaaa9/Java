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
public class ArithmeticProgression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int a1, d, n;

   Scanner s = new Scanner(System.in);
   
   System.out.println("Please enter the value of the first element: ");
   a1 = s.nextInt();
   
   System.out.println("Please enter the value of the step: ");
   d = s.nextInt();
   
   System.out.println("Please enter the number of the element you'd want " + 
           "to be calculated: ");
   n = s.nextInt();
   
  int an = a1 + (n -1) * d;
  System.out.println("Element " + n + " is " + an);
  

   
   
    }
    
}
