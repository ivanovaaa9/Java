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
public class ProgressionSum {

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

      System.out.println("Please enter the number of the last element: ");
      n  = s.nextInt();
      
      int Sn = ((2 * a1 + (n - 1) * d) / 2) * n;
      System.out.println("The sum of the first " + n + " elements is " + Sn);
      

    }
    
}
