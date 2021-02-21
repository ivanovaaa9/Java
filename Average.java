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
public class Average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      long firstN, secondN, thirdN;
      
      System.out.println("First number: ");
      firstN = s.nextLong();
      
      System.out.println("Second number: ");
      secondN = s.nextLong();
      
      System.out.println("Third number: ");
      thirdN = s.nextLong();
      
      double average = (firstN + secondN + thirdN) / 3;
      
      System.out.printf("The average is: %,.4f\n",
              average );
      
      
    }
    
}
