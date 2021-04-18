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
public class QuadraticEquationsLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int limit;
       double d = 0;
       double x1 = 0;
       double x2 = 0;
 Scanner s = new Scanner(System.in);
 System.out.print("Limit: ");
 limit = s.nextInt();
 for (int a = 1; a <= limit; a++) {
 for (int b = 1; b <= limit; b++) {
 for (int c = 1; c <= limit; c++) {
 System.out.printf("a = %d, b = %d, c = %d\n",
a, b, c);
 d = b * b - 4 * a * c;
 if (d == 0) {
 x1 = - b - Math.sqrt(b * b - 4 * a * c);
 x1 /= 2 * a;
 System.out.println("x1 = " + x1);
 }else if (d > 0) {
 x1 = -b - Math.sqrt(b * b - 4 * a * c);
 x1 /= 2 * a;
 x2 = -b + Math.sqrt(b * b - 4 * a * c);
 x2 /=2 * a; 
 System.out.println("x1 = " + x1);
 System.out.println("x2 = " + x2);
  } else {
 System.out.println("No solution");
 }
 }
 }
    }
    }
}


 


    
    

