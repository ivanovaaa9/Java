/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author inf2067_usr
 */
public class Factorial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
        Scanner s = new Scanner(System.in);
        System.out.print("Factorial of: ");
        number = s.nextInt();
        
        long factorial = 1;
        for(int i = 1; i <= number; i++) {
            factorial = factorial * i;
            
        } 
        System.out.printf("%d! = %d\n", number, factorial);
        
    }
    
}
