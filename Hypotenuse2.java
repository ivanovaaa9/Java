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
public class Hypotenuse2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b, c;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a: ");
        a = s.nextDouble();
        
        System.out.println("Enter b: ");
        b = s.nextDouble();
        
        c = Math.sqrt(a * a + b * b);
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The lenght is: " + c);
        System.out.printf("The lenght is %f\n", c);
        
                
        
    }
    
}
