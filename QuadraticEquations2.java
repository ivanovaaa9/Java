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
public class QuadraticEquations2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int a, b, c;
      Scanner s = new Scanner(System.in);
      
      System.out.println("Enter a: ");
      a = s.nextInt();
      System.out.println("Enter b: ");
      b = s.nextInt();
      System.out.println("Enter c: ");
      c = s.nextInt();
      
      double x1 = (- b -Math.sqrt(b * b - 4 * a * c)) / (2 * a);
      double x2 = (- b +Math.sqrt(b * b - 4 * a * c)) / (2 * a);
      
      System.out.println("x1 = "+ x1);
      System.out.println("x2 = "+ x2);
    

      
         

    }
    
}