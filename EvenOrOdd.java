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
public class EvenOrOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int number;
       Scanner s = new Scanner(System.in);
       
       System.out.println("Enter a number: ");
       number = s.nextInt();
       
       if(number % 2 == 0){
           System.out.println("Result: even ");
           
       }
       else {
           System.out.println("Result: odd");
       }        
    }
    
}
