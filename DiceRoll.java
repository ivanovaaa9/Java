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
public class DiceRoll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      
        System.out.println("Desired sum of two rolls: ");
       int desired = s.nextInt();
        
       int dice1  = (int)(Math.random() * 6 + 1);
       int dice2 = (int)(Math.random() * 6 + 1);
       
       int sum = dice1 + dice2;
       boolean result = dice1 + dice2 == desired;
       
      
       System.out.printf("First roll was %d, second roll was %d, the sum is %d\n" 
               + "Win: %b\n", dice1, dice2, sum, result);
       
       
        
         
    }
    
}
