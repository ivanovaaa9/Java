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
public class DiceRoll2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int sum;
    
    System.out.println("Desired sum of two rolls: ");
    sum = s.nextInt();
    
    if (sum  < 2 ) 
    System.out.println("The sum of two rolls cannot be less than 2");
    else 
    {
    
   if (sum > 12) 
    System.out.println("The sum of the two rolls cannot be greater than 12");
    else
   {
    
       int dice1  = (int)(Math.random() * 6 + 1);
       int dice2 = (int)(Math.random() * 6 + 1);
       sum = dice1 + dice2;
       int desired = 0;
       boolean result;
            result = dice1 + dice2 == desired;
        if (sum > 2);
       System.out.printf("First roll was %d, second roll was %d, the sum is %d\n" 
               + "Win: %b\n", dice1, dice2, sum, result);
       
       
      
       
     
    }    
    }
    }
}
    


